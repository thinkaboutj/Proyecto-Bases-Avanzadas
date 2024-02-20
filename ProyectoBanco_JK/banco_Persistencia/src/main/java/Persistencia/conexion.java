/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 * Clase que implementa la interfaz iConexion para gestionar la conexión a la base de datos.
 * 
 * Esta clase utiliza el controlador JDBC para establecer la conexión con la base de datos MySQL.
 * Se espera que se utilice como un componente para la gestión de conexiones en el sistema.
 * 
 * @author Jesus Gabriel
 */
public class conexion implements iConexion {
    
    /**
     * URL de conexión a la base de datos.
     */
    String url = "jdbc:mysql://localhost:3306";
    
    /**
     * Nombre de la base de datos.
     */
    String nombreBD = "banco";
    
    /**
     * Nombre de usuario para la conexión a la base de datos.
     */
    String usuario = "root";
    
    /**
     * Contraseña para la conexión a la base de datos.
     */
    String contra = "PHW#84#jeor";

    /**
     * Objeto Connection para gestionar la conexión a la base de datos.
     */
    Connection conexion = null;
    
    /**
     * Constructor vacío de la clase.
     */
    public conexion() {
    }

    /**
     * Crea una nueva conexión a la base de datos.
     * 
     * @return Una instancia de Connection representando la nueva conexión.
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
     * Cierra la conexión actual a la base de datos.
     * 
     * Este método debe ser llamado para liberar recursos y cerrar la conexión
     * después de que ya no sea necesaria.
     */
    public void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed() ) {
                conexion.close();
                JOptionPane.showMessageDialog(null, "Conexion cerrada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
