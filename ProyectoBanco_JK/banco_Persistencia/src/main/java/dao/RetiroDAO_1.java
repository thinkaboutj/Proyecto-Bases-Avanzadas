/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Conexion.ConexionBD;
import DTO.RetiroDTO;
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
public class RetiroDAO {
    
    public void agregarRetiro(RetiroDTO retiro) {
        String query = "INSERT INTO retiros (contrasena, folio, estado, cuenta) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setString(1, retiro.getContrasena());
            statement.setInt(2, retiro.getFolio());
            statement.setString(3, retiro.getEstado());
            statement.setInt(4, retiro.getCuenta());

            statement.executeUpdate();
            System.out.println("Retiro agregado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al agregar el retiro: " + e.getMessage());
        }
    }

     public void actualizarRetiro(RetiroDTO retiro) {
        String query = "UPDATE retiros SET contrasena=?, estado=?, cuenta=? WHERE folio=?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setString(1, retiro.getContrasena());
            statement.setString(2, retiro.getEstado());
            statement.setInt(3, retiro.getCuenta());
            statement.setInt(4, retiro.getFolio());

            statement.executeUpdate();
            System.out.println("Retiro actualizado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al actualizar el retiro: " + e.getMessage());
        }
    }
     
    public void eliminarRetiro(int folio) {
        String query = "DELETE FROM retiros WHERE folio=?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setInt(1, folio);

            statement.executeUpdate();
            System.out.println("Retiro eliminado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al eliminar el retiro: " + e.getMessage());
        }
    } 
     
    public RetiroDTO consultarRetiroPorId(int folio) {
        String query = "SELECT * FROM retiros WHERE folio=?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setInt(1, folio);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                String contrasena = result.getString("contrasena");
                String estado = result.getString("estado");
                int cuenta = result.getInt("cuenta");

                return new RetiroDTO(contrasena, folio, estado, cuenta);
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar el retiro: " + e.getMessage());
        }

        return null;
    }
    
    public List<RetiroDTO> consultarTodosLosRetiros() {
        List<RetiroDTO> retiros = new ArrayList<>();
        String query = "SELECT * FROM retiros";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query);
             ResultSet result = statement.executeQuery()) {

            while (result.next()) {
                int folio = result.getInt("folio");
                String contrasena = result.getString("contrasena");
                String estado = result.getString("estado");
                int cuenta = result.getInt("cuenta");

                RetiroDTO retiro = new RetiroDTO(contrasena, folio, estado, cuenta);
                retiros.add(retiro);
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar los retiros: " + e.getMessage());
        }

        return retiros;
    }
    
    
}
