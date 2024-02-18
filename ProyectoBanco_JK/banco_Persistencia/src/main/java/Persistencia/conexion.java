/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Gabriel
 */
public class conexion implements iConexion  {
    
    /**
     * Aqui empezamos a declarar todo para realizar la conexion a la BD
     */
    String url = "jdbc:mysql://localhost:3306 ";
    String nombreBD = "banco";
    String usuario = "root";
    String contra = "PHW#84#jeor";

    Connection conexion = null;
    
    /*
    Costructor vacio
    */
    public conexion() {
    }
    
    

    /**
     * Metodo donde creamos la conexion a la BD
     * @return nos regresa la conexion 
     */
    public Connection crearConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexion = DriverManager.getConnection(url + "/" + nombreBD, usuario, contra);

            JOptionPane.showMessageDialog(null, "Conexion Exitosa" );

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Conexion Fallida" + e);
        }
        return conexion;

    }

    /**
     * Metodo donde cerramos la conexion a la BD
     */
    public void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed() ) {
                conexion.close();
                JOptionPane.showMessageDialog(null, "Conexion cerrada");
            }
        }catch (Exception e){
            
       JOptionPane.showMessageDialog(null, e);
                  }
        }
    
    
}
