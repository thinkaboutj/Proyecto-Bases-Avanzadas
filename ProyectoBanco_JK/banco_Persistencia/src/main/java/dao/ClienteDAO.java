/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Conexion.ConexionBD;
import DTO.ClienteDTO;
import DTO.DireccionDTO;
import Exception.PersistenciaExcepcion;
import dominio.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author skevi
 */
public class ClienteDAO {
 
    private ConexionBD con = new ConexionBD(); // Instancia de la clase de conexión
 
     public void agregarCliente(ClienteDTO cliente) {
        String query = "INSERT INTO clientes (id, fecha_nacimiento, edad, nombre, apellido_paterno, apellido_materno, id_direccion) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setInt(1, cliente.getId());
            statement.setString(2, cliente.getFechaN());
            statement.setInt(3, cliente.getEdad());
            statement.setString(4, cliente.getNombre());
            statement.setString(5, cliente.getApellidoP());
            statement.setString(6, cliente.getApellidoM());
            statement.setInt(7, cliente.getIdDireccion());

            statement.executeUpdate();
            System.out.println("Cliente agregado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al agregar el cliente: " + e.getMessage());
        }
    }

    public void actualizarCliente(ClienteDTO cliente) {
        String query = "UPDATE clientes SET fecha_nacimiento=?, edad=?, nombre=?, apellido_paterno=?, apellido_materno=?, id_direccion=? WHERE id=?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setString(1, cliente.getFechaN());
            statement.setInt(2, cliente.getEdad());
            statement.setString(3, cliente.getNombre());
            statement.setString(4, cliente.getApellidoP());
            statement.setString(5, cliente.getApellidoM());
            statement.setInt(6, cliente.getIdDireccion());
            statement.setInt(7, cliente.getId());

            statement.executeUpdate();
            System.out.println("Cliente actualizado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al actualizar el cliente: " + e.getMessage());
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
    
    
    public ClienteDTO consultarClientePorId(int idCliente) {
        String query = "SELECT * FROM clientes WHERE id=?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setInt(1, idCliente);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                int id = result.getInt("id");
                String fechaNacimiento = result.getString("fecha_nacimiento");
                int edad = result.getInt("edad");
                String nombre = result.getString("nombre");
                String apellidoPaterno = result.getString("apellido_paterno");
                String apellidoMaterno = result.getString("apellido_materno");
                int idDireccion = result.getInt("id_direccion");

                return new ClienteDTO(id, fechaNacimiento, edad, nombre, apellidoPaterno, apellidoMaterno, idDireccion);
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar el cliente: " + e.getMessage());
        }

        return null;
    }
    
    
    public List<ClienteDTO> obtenerTodosLosClientes() {
        List<ClienteDTO> clientes = new ArrayList<>();

        try (Connection conn = ConexionBD.conectar()) {
            String query = "SELECT * FROM clientes";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int id = result.getInt("id");
                String fechaNacimiento = result.getString("fecha_nacimiento");
                int edad = result.getInt("edad");
                String nombre = result.getString("nombre");
                String apellidoPaterno = result.getString("apellido_paterno");
                String apellidoMaterno = result.getString("apellido_materno");
                int idDireccion = result.getInt("id_direccion");

                ClienteDTO cliente = new ClienteDTO(id, fechaNacimiento, edad, nombre, apellidoPaterno, apellidoMaterno, idDireccion);
                clientes.add(cliente);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener los clientes: " + e.getMessage());
        }

        return clientes;
    }
    
}
