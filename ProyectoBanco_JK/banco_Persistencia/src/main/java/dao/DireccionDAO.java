/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Conexion.ConexionBD;
import DTO.DireccionDTO;
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
public class DireccionDAO {
    
    
    public void agregarDireccion(DireccionDTO direccion) {
        String query = "INSERT INTO direcciones (id, calle, numero, colonia, id_cliente) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setInt(1, direccion.getId());
            statement.setString(2, direccion.getCalle());
            statement.setInt(3, direccion.getNumero());
            statement.setString(4, direccion.getColonia());
            statement.setInt(5, direccion.getIdCliente());

            statement.executeUpdate();
            System.out.println("Dirección agregada correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al agregar la dirección: " + e.getMessage());
        }
    }
        
        
    public void actualizarDireccion(DireccionDTO direccion) {
        String query = "UPDATE direcciones SET calle=?, numero=?, colonia=?, id_cliente=? WHERE id=?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setString(1, direccion.getCalle());
            statement.setInt(2, direccion.getNumero());
            statement.setString(3, direccion.getColonia());
            statement.setInt(4, direccion.getIdCliente());
            statement.setInt(5, direccion.getId());

            statement.executeUpdate();
            System.out.println("Dirección actualizada correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al actualizar la dirección: " + e.getMessage());
        }
     }
   
    
     public List<DireccionDTO> consultarTodasLasDirecciones() {
        List<DireccionDTO> direcciones = new ArrayList<>();
        String query = "SELECT * FROM direcciones";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query);
             ResultSet result = statement.executeQuery()) {

            while (result.next()) {
                int id = result.getInt("id");
                String calle = result.getString("calle");
                int numero = result.getInt("numero");
                String colonia = result.getString("colonia");
                int idCliente = result.getInt("id_cliente");

                DireccionDTO direccion = new DireccionDTO();
                direccion.setId(id);
                direccion.setCalle(calle);
                direccion.setNumero(numero);
                direccion.setColonia(colonia);
                direccion.setIdCliente(idCliente);

                direcciones.add(direccion);
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar las direcciones: " + e.getMessage());
        }

        return direcciones;
    }

    // Getters y Setters
    // Métodos adicionales según sea necesario
    
}
