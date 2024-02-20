/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 * Excepción personalizada para manejar errores relacionados con la persistencia de datos.
 * 
 * Esta excepción puede ser lanzada en situaciones donde ocurran problemas durante
 * las operaciones de persistencia, como errores de conexión a la base de datos, problemas
 * de escritura o lectura, etc.
 * 
 * @author Jesus Gabriel
 */
public class PersistenciaExcepcion extends Exception {

    /**
     * Constructor predeterminado de la excepción.
     */
    public PersistenciaExcepcion() {
    }

    /**
     * Constructor que acepta un mensaje descriptivo para la excepción.
     * 
     * @param message El mensaje descriptivo para la excepción.
     */
    public PersistenciaExcepcion(String message) {
        super(message);
    }

    /**
     * Constructor que acepta un mensaje descriptivo y una causa para la excepción.
     * 
     * @param message El mensaje descriptivo para la excepción.
     * @param cause   La causa subyacente de la excepción.
     */
    public PersistenciaExcepcion(String message, Throwable cause) {
        super(message, cause);
    }
}
