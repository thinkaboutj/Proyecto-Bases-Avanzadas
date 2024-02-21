/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Conexion.ConexionBD;
import DTO.OperacionDTO;
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
public class OperacionDAO {
    
    
    public void agregarOperacion(OperacionDTO operacion) {
        String query = "INSERT INTO operaciones (id, fecha, monto) VALUES (?, ?, ?)";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setInt(1, operacion.getId());
            statement.setString(2, operacion.getFecha());
            statement.setDouble(3, operacion.getMonto());

            statement.executeUpdate();
            System.out.println("Operación agregada correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al agregar la operación: " + e.getMessage());
        }
    }
    
    public void actualizarOperacion(OperacionDTO operacion) {
        String query = "UPDATE operaciones SET fecha=?, monto=? WHERE id=?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setString(1, operacion.getFecha());
            statement.setDouble(2, operacion.getMonto());
            statement.setInt(3, operacion.getId());

            statement.executeUpdate();
            System.out.println("Operación actualizada correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al actualizar la operación: " + e.getMessage());
        }
    }
    
    public void eliminarOperacion(int idOperacion) {
        String query = "DELETE FROM operaciones WHERE id=?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setInt(1, idOperacion);

            statement.executeUpdate();
            System.out.println("Operación eliminada correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al eliminar la operación: " + e.getMessage());
        }
    }
    
    public OperacionDTO consultarOperacionPorId(int idOperacion) {
        String query = "SELECT * FROM operaciones WHERE id=?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setInt(1, idOperacion);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                int id = result.getInt("id");
                String fecha = result.getString("fecha");
                double monto = result.getDouble("monto");

                return new OperacionDTO(id, fecha, monto);
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar la operación: " + e.getMessage());
        }

        return null;
    }
    
    public List<OperacionDTO> consultarTodasLasOperaciones() {
        List<OperacionDTO> operaciones = new ArrayList<>();
        String query = "SELECT * FROM operaciones";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query);
             ResultSet result = statement.executeQuery()) {

            while (result.next()) {
                int id = result.getInt("id");
                String fecha = result.getString("fecha");
                double monto = result.getDouble("monto");

                OperacionDTO operacion = new OperacionDTO(id, fecha, monto);
                operaciones.add(operacion);
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar las operaciones: " + e.getMessage());
        }

        return operaciones;
    }
    
    
}
