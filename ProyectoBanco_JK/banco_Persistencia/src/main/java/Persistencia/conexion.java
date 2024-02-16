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
public class conexion {
    
    String url = "jdbc:mysql://localhost:3306 ";
    String nombreBD = "banco";
    String usuario = "root";
    String contra = "PHW#84#jeor";

    Connection conexion = null;
    
    public conexion() {
    }
    
    

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
