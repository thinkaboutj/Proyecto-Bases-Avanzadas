-- EQUIPO: Jesus Medina Y Kevin Jared (╹ڡ╹ )
-- CREAR LA BASE DE DATOS
CREATE DATABASE IF NOT EXISTS BANCO;
USE BANCO;

-- CREAR TABLA CLIENTE
CREATE TABLE IF NOT EXISTS Cliente (
    id INT PRIMARY KEY AUTO_INCREMENT,
    fechaN DATE,
    edad INT,
    nombre VARCHAR(30),
    apellidoP VARCHAR(15),
    apellidoM VARCHAR(15)
);

-- CREAR TABLA DIRECCION
CREATE TABLE IF NOT EXISTS Direccion (
    id INT PRIMARY KEY AUTO_INCREMENT,
    calle VARCHAR(255),
    numero INT,
    codigoP INT,
    colonia VARCHAR(30),
    id_cliente INT, -- Agregar la columna id_cliente
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id) -- Agregar la clave foránea a Cliente
);

-- CREAR TABLA CUENTA
CREATE TABLE IF NOT EXISTS Cuenta (
    id INT PRIMARY KEY AUTO_INCREMENT,
    fecha DATE,
    numC INT,
    saldo DECIMAL(10, 2),
    usuario VARCHAR(20),
    contrasena VARCHAR(255), -- Usar VARCHAR para contraseñas
    id_cliente INT,
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id) -- Agregar la clave foránea a Cliente
);

-- CREAR TABLA OPERACION
CREATE TABLE IF NOT EXISTS Operacion (
    id INT PRIMARY KEY AUTO_INCREMENT,
    fecha DATE,
    monto DECIMAL(10, 2) -- Usar DECIMAL para montos
);

-- CREAR TABLA TRANSFERENCIA
CREATE TABLE IF NOT EXISTS Transferencia (
    id INT PRIMARY KEY AUTO_INCREMENT,
    cuentaD INT,
    id_operacion INT,
    FOREIGN KEY (id_operacion) REFERENCES Operacion(id) -- Agregar la clave foránea a Operacion
);

-- CREAR TABLA RETIROSC
CREATE TABLE IF NOT EXISTS RetiroSC (
    id INT PRIMARY KEY AUTO_INCREMENT,
    contrasena VARCHAR(255), -- Usar VARCHAR para contraseñas
    folio INT,
    estado VARCHAR(20),
    id_cuenta INT,
    id_operacion INT,
    FOREIGN KEY (id_cuenta) REFERENCES Cuenta(id), -- Agregar la clave foránea a Cuenta
    FOREIGN KEY (id_operacion) REFERENCES Operacion(id) -- Agregar la clave foránea a Operacion
);
