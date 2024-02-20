/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;
/**
 * Clase que representa un objeto de transferencia de datos (DTO) para la entidad Cliente.
 * 
 * Un ClienteDTO encapsula la información relacionada con un cliente, incluyendo
 * el ID, la fecha de nacimiento, la edad, el nombre, apellidos y la dirección asociada.
 * 
 * @author Jesus Gabriel
 */
public class ClienteDTO {

    // Propiedades de la clase
    private int id;
    private Date fechaN;
    private int edad;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int idDireccion;

    /**
     * Constructor de la clase ClienteDTO.
     * 
     * @param id          El ID del cliente.
     * @param fechaN      La fecha de nacimiento del cliente.
     * @param edad        La edad del cliente.
     * @param nombre      El nombre del cliente.
     * @param apellidoP   El apellido paterno del cliente.
     * @param apellidoM   El apellido materno del cliente.
     * @param idDireccion El ID de la dirección asociada al cliente.
     */
    public ClienteDTO(int id, Date fechaN, int edad, String nombre, String apellidoP, String apellidoM, int idDireccion) {
        this.id = id;
        this.fechaN = fechaN;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.idDireccion = idDireccion;
    }

    /**
     * Obtiene el ID del cliente.
     * 
     * @return El ID del cliente.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID del cliente.
     * 
     * @param id El nuevo ID del cliente.
     * @throws IllegalArgumentException Si el ID es un número negativo.
     */
    public void setId(int id) {
        // Validación de id 
        if (id < 0) {
            throw new IllegalArgumentException("El ID no puede ser un número negativo.");
        }
        this.id = id;
    }

    /**
     * Obtiene la fecha de nacimiento del cliente.
     * 
     * @return La fecha de nacimiento del cliente.
     */
    public Date getFechaN() {
        return fechaN;
    }

    /**
     * Establece la fecha de nacimiento del cliente.
     * 
     * @param fechaN La nueva fecha de nacimiento del cliente.
     */
    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    /**
     * Obtiene la edad del cliente.
     * 
     * @return La edad del cliente.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del cliente.
     * 
     * @param edad La nueva edad del cliente.
     * @throws IllegalArgumentException Si la edad es un número negativo.
     */
    public void setEdad(int edad) {
        // Validación de edad
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser un número negativo.");
        }
        this.edad = edad;
    }

    /**
     * Obtiene el nombre del cliente.
     * 
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     * 
     * @param nombre El nuevo nombre del cliente.
     * @throws IllegalArgumentException Si el nombre es nulo o vacío.
     */
    public void setNombre(String nombre) {
        // Validación de nombre
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        }
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido paterno del cliente.
     * 
     * @return El apellido paterno del cliente.
     */
    public String getApellidoP() {
        return apellidoP;
    }

    /**
     * Establece el apellido paterno del cliente.
     * 
     * @param apellidoP El nuevo apellido paterno del cliente.
     * @throws IllegalArgumentException Si el apellidoP es nulo o vacío.
     */
    public void setApellidoP(String apellidoP) {
        // Validación de apellidoP 
        if (apellidoP == null || apellidoP.trim().isEmpty()) {
            throw new IllegalArgumentException("El apellidoP no puede ser nulo o vacío.");
        }
        this.apellidoP = apellidoP;
    }

    /**
     * Obtiene el apellido materno del cliente.
     * 
     * @return El apellido materno del cliente.
     */
    public String getApellidoM() {
        return apellidoM;
    }

    /**
     * Establece el apellido materno del cliente.
     * 
     * @param apellidoM El nuevo apellido materno del cliente.
     * @throws IllegalArgumentException Si el apellidoM es nulo o vacío.
     */
    public void setApellidoM(String apellidoM) {
        // Validación de apellidoM 
        if (apellidoM == null || apellidoM.trim().isEmpty()) {
            throw new IllegalArgumentException("El apellidoM no puede ser nulo o vacío.");
        }
        this.apellidoM = apellidoM;
    }

    /**
     * Obtiene el ID de la dirección asociada al cliente.
     * 
     * @return El ID de la dirección asociada al cliente.
     */
    public int getIdDireccion() {
        return idDireccion;
    }

    /**
     * Establece el ID de la dirección asociada al cliente.
     * 
     * @param idDireccion El nuevo ID de la dirección asociada al cliente.
     * @throws IllegalArgumentException Si el idDireccion es un número negativo.
     */
    public void setIdDireccion(int idDireccion) {
        // Validación de idDireccion 
        if (idDireccion < 0) {
            throw new IllegalArgumentException("El idDireccion no puede ser un número negativo.");
        }
        this.idDireccion = idDireccion;
    }

}
