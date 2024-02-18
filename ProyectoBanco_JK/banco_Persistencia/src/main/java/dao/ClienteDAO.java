/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

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
import dao.DireccionDAO;
import java.util.Calendar;

/**
 *
 * @author skevi
 */
public class ClienteDAO {

    private conexion conexionCliente;
    private DireccionDAO direccionDAO;
    private CuentaDAO cuentaDAO;
    private SecureRandom secureRandom;

    public ClienteDAO(DireccionDAO direccionDAO, CuentaDAO cuentaDAO) {
        this.direccionDAO = direccionDAO;
        this.cuentaDAO = cuentaDAO;
        this.conexionCliente = new conexion();
        this.secureRandom = new SecureRandom();
    }

    public boolean login(String usuario, String contrasena) {
        String query = "SELECT COUNT(*) AS count FROM Cliente WHERE nombre = ? AND contrasena = ?";
        try (PreparedStatement statement = conexionCliente.crearConexion().prepareStatement(query)) {
            statement.setString(1, usuario);
            statement.setString(2, contrasena);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int count = resultSet.getInt("count");
                    return count > 0;  // Si count es mayor a 0, el usuario y la contraseña son válidos
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo básico de excepciones (puedes mejorar esto según tus necesidades)
        }
        return false;  // Si hay alguna excepción, asumimos que el inicio de sesión falló
    }

    public void guardarCliente(Cliente nuevoCliente, String contrasena, Direccion direccion) {
        try (Connection conexion = conexionCliente.crearConexion()) {
            // Realizar operaciones de persistencia con la conexión obtenida

            // Validaciones
            if (nuevoCliente == null || direccion == null) {
                throw new IllegalArgumentException("El cliente y la dirección no pueden ser nulos");
            }

            // Guardar el cliente y la dirección
            direccionDAO.guardarDireccion(direccion);
            nuevoCliente.setIdDireccion(direccion.getId());
            guardarClienteEnBD(nuevoCliente);
            

            Cuenta nuevaCuenta = cuentaDAO.crearCuentaAutomatica(nuevoCliente, contrasena);
            cuentaDAO.guardarCuenta(nuevaCuenta);

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo básico de excepciones (puedes mejorar esto según tus necesidades)
        } finally {
            conexionCliente.cerrarConexion();
        }
    }

    private void guardarClienteEnBD(Cliente cliente) throws SQLException {

        String query = "INSERT INTO Cliente (fechaN, edad, nombre, apellidoP, apellidoM, id_direccion) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conexionCliente.crearConexion().prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
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
    
    public int calcularEdad(Date fechaNacimiento) {
        Calendar fechaNacimientoCal = Calendar.getInstance();
        fechaNacimientoCal.setTime(fechaNacimiento);

        Calendar hoy = Calendar.getInstance();

        int edad = hoy.get(Calendar.YEAR) - fechaNacimientoCal.get(Calendar.YEAR);

        // Ajustar la edad si aún no ha cumplido años en el año actual
        if (hoy.get(Calendar.DAY_OF_YEAR) < fechaNacimientoCal.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }

        return edad;
    }

}
