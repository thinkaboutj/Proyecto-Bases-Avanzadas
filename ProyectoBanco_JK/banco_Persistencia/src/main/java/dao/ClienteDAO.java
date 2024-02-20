/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import DTO.ClienteDTO;
import DTO.DireccionDTO;
import Exception.PersistenciaExcepcion;
import Persistencia.iConexion;
import dominio.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que implementa la interfaz iCliente para la manipulación de objetos Cliente en la base de datos.
 * 
 * Utiliza procedimientos almacenados para agregar un nuevo cliente junto con su información de dirección asociada.
 * 
 * @author skevi
 */
public class ClienteDAO implements iCliente {

    /**
     * Interfaz que proporciona métodos para gestionar la conexión a la base de datos.
     */
    private iConexion conexionBD;

    /**
     * Constructor que inicializa la conexión a la base de datos.
     * 
     * @param conexionBD Objeto que implementa la interfaz iConexion para la gestión de la conexión.
     */
    public ClienteDAO(iConexion conexionBD) {
        this.conexionBD = conexionBD;
    }

    /**
     * Agrega un nuevo cliente a la base de datos junto con su información de dirección.
     * 
     * @param cliente El objeto ClienteDTO que contiene la información del cliente a agregar.
     * @param dire    El objeto DireccionDTO que contiene la información de la dirección asociada al cliente.
     * @return        El objeto Cliente agregado a la base de datos.
     * @throws PersistenciaExcepcion Si ocurre un error durante la operación de persistencia.
     */
    @Override
    public Cliente AgregarCliente(ClienteDTO cliente, DireccionDTO dire) throws PersistenciaExcepcion {
        try {
            // Llamada al procedimiento almacenado
            Connection conexion = conexionBD.crearConexion();
            String sentencia = "{CALL GuardarClienteConDireccion(?, ?, ?, ?, ?, ?, ?, ?)}";
            PreparedStatement llamar = conexion.prepareStatement(sentencia);

            // Parámetros para el cliente
            llamar.setDate(1, new java.sql.Date(cliente.getFechaN().getTime()));
            llamar.setInt(2, cliente.getEdad());
            llamar.setString(3, cliente.getNombre());
            llamar.setString(4, cliente.getApellidoP());
            llamar.setString(5, cliente.getApellidoM());

            // Parámetros para la dirección
            llamar.setString(6, dire.getCalle());
            llamar.setInt(7, dire.getNumero());
            llamar.setString(8, dire.getColonia());

            // Ejecutar la llamada al procedimiento almacenado
            llamar.executeQuery();

            // Cerrar la conexión
            conexionBD.cerrarConexion();
            
             // Obtener el ID del cliente insertado
            ResultSet resultado = llamar.getGeneratedKeys();
            int idCliente = 0;
            if (resultado.next()) {
                idCliente = resultado.getInt(1);
            }

        // AQUÍ FALTA QUE REGRESE UN CLIENTE 
        } catch (SQLException e) {
            // Manejar las excepciones adecuadamente
            e.printStackTrace();
        }
        return null;
       
    }
}

