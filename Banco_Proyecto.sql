-- EQUIPO: Jesus Medina Y Kevin Jared (╹ڡ╹ )
CREATE DATABASE BANCO;
USE BANCO;

CREATE TABLE Cliente (
    id INT PRIMARY KEY AUTO_INCREMENT,
    fechaN DATE,
    edad INT,
    nombre VARCHAR(30),
    apellidoP VARCHAR(15),
    apellidoM VARCHAR(15),
    id_direccion INT
);

CREATE TABLE Direccion (
    id INT PRIMARY KEY AUTO_INCREMENT,
    calle VARCHAR(255),
    numero INT,
    codigoP INT,
    colonia VARCHAR(30)
);

CREATE TABLE Cuenta (
    id INT PRIMARY KEY AUTO_INCREMENT,
    fecha DATE,
    numC INT,
    saldo DECIMAL(10, 2),
    usuario VARCHAR(20),
    contrasena VARCHAR(255), -- Usar VARCHAR para contraseñas
    id_cliente INT
);

CREATE TABLE Operacion (
    id INT PRIMARY KEY AUTO_INCREMENT,
    fecha DATE,
    monto DECIMAL(10, 2) -- Usar DECIMAL para montos
);

CREATE TABLE Transferencia (
    id INT PRIMARY KEY AUTO_INCREMENT,
    cuentaD INT,
    id_operacion INT
);

CREATE TABLE RetiroSC (
    id INT PRIMARY KEY AUTO_INCREMENT,
    contrasena VARCHAR(255), -- Usar VARCHAR para contraseñas
    folio INT,
    estado VARCHAR(20),
    id_cuenta INT,
    id_operacion INT
);

ALTER TABLE Cliente
ADD FOREIGN KEY (id_direccion) REFERENCES Direccion(id);

ALTER TABLE Cuenta
ADD FOREIGN KEY (id_cliente) REFERENCES Cliente(id);

ALTER TABLE Transferencia
ADD FOREIGN KEY (id_operacion) REFERENCES Operacion(id);

ALTER TABLE RetiroSC
ADD FOREIGN KEY (id_cuenta) REFERENCES Cuenta(id),
ADD FOREIGN KEY (id_operacion) REFERENCES Operacion(id);

DELIMITER //

CREATE PROCEDURE CrearClienteConDireccion(
    IN p_fechaN DATE,
    IN p_edad INT,
    IN p_nombre VARCHAR(30),
    IN p_apellidoP VARCHAR(15),
    IN p_apellidoM VARCHAR(15),
    IN p_calle VARCHAR(255),
    IN p_numero INT,
    IN p_codigoP INT,
    IN p_colonia VARCHAR(30)
)
BEGIN
    DECLARE last_inserted_id INT;

    -- Insertar la dirección y obtener el ID generado automáticamente
    INSERT INTO Direccion (calle, numero, codigoP, colonia)
    VALUES (p_calle, p_numero, p_codigoP, p_colonia);

    SET last_inserted_id = LAST_INSERT_ID();

    -- Insertar el cliente con el ID de dirección asociado
    INSERT INTO Cliente (fechaN, edad, nombre, apellidoP, apellidoM, id_direccion)
    VALUES (p_fechaN, p_edad, p_nombre, p_apellidoP, p_apellidoM, last_inserted_id);
END //

DELIMITER ;
	