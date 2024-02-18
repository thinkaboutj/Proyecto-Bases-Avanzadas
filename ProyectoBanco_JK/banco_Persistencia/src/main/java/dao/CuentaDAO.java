/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Persistencia.conexion;
import dominio.Cuenta;
import dominio.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Random;

public class CuentaDAO {

    private conexion conexionCuenta;

    public CuentaDAO() {
        this.conexionCuenta = new conexion();
    }

    public void guardarCuenta(Cuenta cuenta) {
        try (Connection conexion = conexionCuenta.crearConexion()) {
            // Validaciones y operaciones de persistencia con la conexión obtenida

            // Lógica para guardar la cuenta recibida como parámetro
            guardarCuentaEnBD(cuenta);

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo básico de excepciones (puedes mejorar esto según tus necesidades)
        } finally {
            conexionCuenta.cerrarConexion();
        }
    }

    private void guardarCuentaEnBD(Cuenta cuenta) throws SQLException {
        String query = "INSERT INTO Cuenta (fecha, numC, saldo, usuario, contrasena, id_cliente) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conexionCuenta.crearConexion().prepareStatement(query)) {
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
        // tu lógica para generar el número de cuenta único...

        Random random = new Random();
        return 1000000000 + random.nextInt(900000000);
    }

    public Cuenta crearCuentaAutomatica(Cliente cliente, String contrasena) {

        int numCuenta = generarNumeroCuentaUnico();
        double saldoInicial = 0.0;
        // Fecha actual
        Date fechaActual = new Date();

        return new Cuenta(0, fechaActual, numCuenta, saldoInicial, cliente.getNombre(), contrasena, cliente);
    }
}
