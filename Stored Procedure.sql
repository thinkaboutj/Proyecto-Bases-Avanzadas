DELIMITER //

CREATE PROCEDURE GuardarClienteConDireccion(
    IN p_fechaN DATE,
    IN p_edad INT,
    IN p_nombre VARCHAR(30),
    IN p_apellidoP VARCHAR(15),
    IN p_apellidoM VARCHAR(15),
    IN p_calle VARCHAR(255),
    IN p_numero INT,
    IN p_colonia VARCHAR(30)
)
BEGIN
    DECLARE last_inserted_id_cliente INT;
    DECLARE last_inserted_id_direccion INT;

    -- Insertar el cliente y obtener el ID generado automáticamente
    INSERT INTO Cliente (fechaN, edad, nombre, apellidoP, apellidoM)
    VALUES (p_fechaN, p_edad, p_nombre, p_apellidoP, p_apellidoM);

    SET last_inserted_id_cliente = LAST_INSERT_ID();

    -- Insertar la dirección asociada al cliente
    INSERT INTO Direccion (calle, numero, colonia, id_cliente)
    VALUES (p_calle, p_numero, p_colonia, last_inserted_id_cliente);

    SET last_inserted_id_direccion = LAST_INSERT_ID();

    -- Actualizar el campo id_cliente en la tabla Direccion
    UPDATE Direccion SET id_cliente = last_inserted_id_cliente WHERE id = last_inserted_id_direccion;
END //

DELIMITER ;
