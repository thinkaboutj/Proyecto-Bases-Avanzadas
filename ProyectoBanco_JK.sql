-- EQUIPO: Jesus Medina Y Kevin Jared (╹ڡ╹ )

CREATE DATABASE banco;

USE banco;

CREATE TABLE Direccion (
    id INT PRIMARY KEY,
    calle VARCHAR(255),
    numero INT,
    codigoP INT,
    colonia VARCHAR(30)
);

CREATE TABLE Cliente (
    id INT PRIMARY KEY,
    fechaN DATE,
    edad INT,
    nombre VARCHAR(30),
    apellidoP VARCHAR(15),
    apellidoM VARCHAR(15),
    id_direccion INT,
    FOREIGN KEY (id_direccion) REFERENCES Direccion(id)
);



CREATE TABLE Cuenta (
    id INT PRIMARY KEY,
    fecha DATE,
    numC INT,
    saldo FLOAT,
    usuario VARCHAR(20),
    contrasno VARCHAR(20),
    id_cliente INT,
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id)
);


CREATE TABLE Operacion (
    id INT PRIMARY KEY,
    fecha DATE,
    monto FLOAT
);

CREATE TABLE Transferencia (
    id INT PRIMARY KEY,
    cuentaD INT,
    id_operacion INT,
    FOREIGN KEY (id_operacion) REFERENCES Operacion(id)
);

CREATE TABLE RetiroSC (
    id INT PRIMARY KEY,
    contrasena INT,
    folio INT,
    estado VARCHAR(20),
    id_cuenta INT,
    id_operacion INT,
    FOREIGN KEY (id_cuenta) REFERENCES Cuenta(id),
    FOREIGN KEY (id_operacion) REFERENCES Operacion(id)
);
