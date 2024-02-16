-- EQUIPO: Jesus Medina Y Kevin Jared (╹ڡ╹ )
CREATE DATABASE BANCO;
use BANCO;

CREATE TABLE Cliente (
    id INT PRIMARY KEY,
    fechaN DATE,
    edad INT,
    nombre VARCHAR(30),
    apellidoP VARCHAR(15),
    apellidoM VARCHAR(15),
    id_direccion INT
);

CREATE TABLE Direccion (
    id INT PRIMARY KEY,
    calle VARCHAR(255),
    numero INT,
    codigoP INT,
    colonia VARCHAR(30)
);

CREATE TABLE Cuenta (
    id INT PRIMARY KEY,
    fecha DATE,
    numC INT,
    saldo FLOAT,
    usuario VARCHAR(20),
    contrasno VARCHAR(20),
    id_cliente INT
);

CREATE TABLE Operacion (
    id INT PRIMARY KEY,
    fecha DATE,
    monto FLOAT
);

CREATE TABLE Transferencia (
    id INT PRIMARY KEY,
    cuentaD INT,
    id_operacion INT
);

CREATE TABLE RetiroSC (
    id INT PRIMARY KEY,
    contrasena INT,
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