/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia;

import java.sql.Connection;

/**
 * Interfaz que define métodos para la gestión de conexiones a la base de datos.
 * 
 * Esta interfaz proporciona métodos para crear y cerrar conexiones a la base de datos.
 * Implementaciones de esta interfaz deben proporcionar lógica específica para
 * la creación y cierre de conexiones según los requisitos del sistema.
 * 
 * @author Jesus Gabriel
 */
public interface iConexion {
    
    /**
     * Crea una nueva conexión a la base de datos.
     * 
     * @return Una instancia de Connection representando la nueva conexión.
     */
    public Connection crearConexion();
    
    /**
     * Cierra la conexión actual a la base de datos.
     * 
     * Este método debe ser llamado para liberar recursos y cerrar la conexión
     * después de que ya no sea necesaria.
     */
    public void cerrarConexion();
}

