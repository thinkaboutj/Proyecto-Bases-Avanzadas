/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Conexion.ConexionBD;
import DTO.CuentaDTO;
import dominio.Cuenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author skevi
 */
public class CuentaDAO {
    
    
    public void agregarCuenta(CuentaDTO cuenta) {
        String query = "INSERT INTO cuentas (id, fecha, numC, saldo, usuario, contrasena, id_cliente) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setInt(1, cuenta.getId());
            statement.setString(2, cuenta.getFecha());
            statement.setInt(3, cuenta.getNumC());
            statement.setDouble(4, cuenta.getSaldo());
            statement.setString(5, cuenta.getUsuario());
            statement.setString(6, cuenta.getContrasena());
            statement.setInt(7, cuenta.getCliente());

            statement.executeUpdate();
            System.out.println("Cuenta agregada correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al agregar la cuenta: " + e.getMessage());
        }
    }
    
    public void actualizarCuenta(CuentaDTO cuenta) {
        String query = "UPDATE cuentas SET fecha=?, numC=?, saldo=?, usuario=?, contrasena=?, id_cliente=? WHERE id=?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setString(1, cuenta.getFecha());
            statement.setInt(2, cuenta.getNumC());
            statement.setDouble(3, cuenta.getSaldo());
            statement.setString(4, cuenta.getUsuario());
            statement.setString(5, cuenta.getContrasena());
            statement.setInt(6, cuenta.getCliente());
            statement.setInt(7, cuenta.getId());

            statement.executeUpdate();
            System.out.println("Cuenta actualizada correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al actualizar la cuenta: " + e.getMessage());
        }
    }

    
    public void eliminarCuenta(int idCuenta) {
        String query = "DELETE FROM cuentas WHERE id=?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setInt(1, idCuenta);
            statement.executeUpdate();
            System.out.println("Cuenta eliminada correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al eliminar la cuenta: " + e.getMessage());
        }
    }
    
    public CuentaDTO buscarCuentaPorId(int idCuenta) {
        String query = "SELECT * FROM cuentas WHERE id=?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setInt(1, idCuenta);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                int id = result.getInt("id");
                String fecha = result.getString("fecha");
                int numC = result.getInt("numC");
                double saldo = result.getDouble("saldo");
                String usuario = result.getString("usuario");
                String contrasena = result.getString("contrasena");
                int id_cliente = result.getInt("id_cliente");

                // Aquí deberías crear un objeto Cliente con los datos del cliente encontrado en la base de datos
                CuentaDTO cuenta = new CuentaDTO(id, fecha, numC, saldo, usuario, contrasena, id_cliente);

                return cuenta;
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar la cuenta: " + e.getMessage());
        }

        return null;
    }
        
    public List<CuentaDTO> consultarTodasLasCuentas() {
        List<CuentaDTO> cuentas = new ArrayList<>();
        String query = "SELECT * FROM cuentas";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query);
             ResultSet result = statement.executeQuery()) {

            while (result.next()) {
                int id = result.getInt("id");
                String fecha = result.getString("fecha");
                int numC = result.getInt("numC");
                double saldo = result.getDouble("saldo");
                String usuario = result.getString("usuario");
                String contrasena = result.getString("contrasena");
                int id_cliente = result.getInt("id_cliente");

                // Aquí deberías crear un objeto Cliente con los datos del cliente encontrado en la base de dato

                CuentaDTO cuenta = new CuentaDTO(id, fecha, numC, saldo, usuario, contrasena, id_cliente);
                cuentas.add(cuenta);
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar las cuentas: " + e.getMessage());
        }

        return cuentas;
    }
    
    
}
    

