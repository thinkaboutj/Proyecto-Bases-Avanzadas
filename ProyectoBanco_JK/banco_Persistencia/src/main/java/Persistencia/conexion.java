/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.Connection;

/**
 *
 * @author Jesus Gabriel
 */
public class conexion {
    
    String url = "jdbc:mysql://localhost:3306 ";
    String nombreBD = "Banco_Proyecto";
    String usuario = "root";
    String contra = "PHW#84#jeor";

    Connection conexion = null;
    
}
