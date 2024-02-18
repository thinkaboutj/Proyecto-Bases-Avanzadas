/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorios;

import Persistencia.conexion;
import dominio.Cliente;
import dominio.Cuenta;
import dominio.Direccion;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Jesus Gabriel
 */
public class RepositorioCliente {

    private conexion conexionPersistencia;
    private SecureRandom secureRandom;

    public RepositorioCliente() {
        this.conexionPersistencia = new conexion();
        this.secureRandom = new SecureRandom();
    }

    public void guardarCliente(Cliente nuevoCliente, String contrasena, Direccion direccion) {
        try (Connection conexion = conexionPersistencia.crearConexion()) {
            // Realizar operaciones de persistencia con la conexión obtenida

            // Validaciones
            if (nuevoCliente == null || direccion == null) {
                throw new IllegalArgumentException("El cliente y la dirección no pueden ser nulos");
            }

            // Guardar el cliente y la dirección
            guardarDireccionEnBD(direccion);
            nuevoCliente.setIdDireccion(direccion.getId());
            guardarClienteEnBD(nuevoCliente);

            // Crear una cuenta para el cliente
            Cuenta nuevaCuenta = crearCuentaAutomatica(nuevoCliente, contrasena);
            guardarCuentaEnBD(nuevaCuenta);

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo básico de excepciones (puedes mejorar esto según tus necesidades)
        } finally {
            conexionPersistencia.cerrarConexion();
        }
    }

    private void guardarClienteEnBD(Cliente cliente) throws SQLException {

        String query = "INSERT INTO Cliente (fechaN, edad, nombre, apellidoP, apellidoM, id_direccion) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conexionPersistencia.crearConexion().prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            statement.setDate(1, new java.sql.Date(cliente.getFechaN().getTime()));
            statement.setInt(2, cliente.getEdad());
            statement.setString(3, cliente.getNombre());
            statement.setString(4, cliente.getApellidoP());
            statement.setString(5, cliente.getApellidoM());
            statement.setInt(6, cliente.getIdDireccion());

            // Ejecutar la inserción
            int affectedRows = statement.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Fallo al insertar el cliente, ninguna fila afectada.");
            }

            // Obtener el ID generado para el cliente
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    cliente.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Fallo al obtener el ID del cliente, ningún ID generado.");
                }
            }
        }
    }

    private void guardarDireccionEnBD(Direccion direccion) throws SQLException {

        String query = "INSERT INTO Direccion (calle, numero, codigoP, colonia) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = conexionPersistencia.crearConexion().prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, direccion.getCalle());
            statement.setInt(2, direccion.getNumero());
            statement.setInt(3, direccion.getCodigoP());
            statement.setString(4, direccion.getColonia());

            // Ejecutar la inserción
            int affectedRows = statement.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Fallo al insertar la dirección, ninguna fila afectada.");
            }

            // Obtener el ID generado para la dirección
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    direccion.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Fallo al obtener el ID de la dirección, ningún ID generado.");
                }
            }
        }
    }

    private void guardarCuentaEnBD(Cuenta cuenta) throws SQLException {

        String query = "INSERT INTO Cuenta (fecha, numC, saldo, usuario, contrasena, id_cliente) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conexionPersistencia.crearConexion().prepareStatement(query)) {
            statement.setDate(1, new java.sql.Date(new Date().getTime()));
            statement.setInt(2, cuenta.getNumC());
            statement.setDouble(3, cuenta.getSaldo());
            statement.setString(4, cuenta.getUsuario());
            statement.setString(5, cuenta.getContrasena());
            statement.setInt(6, cuenta.getCliente().getId());

            // Ejecutar la inserción
            statement.executeUpdate();
        }
    }

    private int generarNumeroCuentaUnico() {
        // Aquí se presenta una implementación básica con un número aleatorio de 10 dígitos.

        Random random = new Random();
        return 1000000000 + random.nextInt(900000000);
    }

    private Cuenta crearCuentaAutomatica(Cliente cliente, String contrasena) {
        // (Generar el número de cuenta, asignar saldo inicial, etc.)

        int numCuenta = generarNumeroCuentaUnico();
        double saldoInicial = 0.0; 
        // Fecha actual
        Date fechaActual = new Date();

        return new Cuenta(0, fechaActual, numCuenta, saldoInicial, cliente.getNombre(), contrasena, cliente);
    }
}
