/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author skevi
 */
public class ClienteDAO {
    
    public void agregarMiClase(int id, String fechaN, int edad, String nombre, String apellidoP, String apellidoM, int id_direccion) {
        try {
            String query = "INSERT INTO cliente(id, fechaN, edad, nombre, apellidoP, apellidoM, id_direccion) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, fechaN);
            preparedStatement.setInt(3, edad);
            preparedStatement.setString(4, nombre);
            preparedStatement.setString(5, apellidoP);
            preparedStatement.setString(6, apellidoM);
            preparedStatement.setInt(7, id_direccion);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al agregar registro: " + e.getMessage());
        }
    }
    
}
