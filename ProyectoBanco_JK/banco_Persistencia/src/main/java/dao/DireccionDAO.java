/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dominio.Direccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Persistencia.conexion;

/**
 *
 * @author Jesus Gabriel
 */
public class DireccionDAO {

    private conexion conexionDireccion;

    public DireccionDAO() {
        this.conexionDireccion = new conexion();
    }

    public void guardarDireccion(Direccion direccion) {
        try (Connection conexion = this.conexionDireccion.crearConexion()) {
            // Validaciones y lógica de persistencia aquí...
            guardarDireccionEnBD(direccion);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void guardarDireccionEnBD(Direccion direccion) throws SQLException {

        String query = "INSERT INTO Direccion (calle, numero, codigoP, colonia) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = conexionDireccion.crearConexion().prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
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
}
