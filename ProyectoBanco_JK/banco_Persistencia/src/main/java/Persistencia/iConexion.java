/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia;

import java.sql.Connection;

/**
 *
 * @author Jesus Gabriel
 */
public interface iConexion {
    
    public Connection crearConexion();
    
    public void cerrarConexion();

    
}
