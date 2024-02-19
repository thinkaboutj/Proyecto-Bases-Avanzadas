/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Jesus Gabriel
 */
public class ClienteDTO {

    private int id;
    private Date fechaN;
    private int edad;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int idDireccion;

    // Constructor
    public ClienteDTO(int id, Date fechaN, int edad, String nombre, String apellidoP, String apellidoM, int idDireccion) {
        this.id = id;
        this.fechaN = fechaN;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.idDireccion = idDireccion;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        // Validación de id 
        if (id < 0) {
            throw new IllegalArgumentException("El ID no puede ser un número negativo.");
        }
        this.id = id;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        // Validación de edad
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser un número negativo.");
        }
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        // Validación de nombre
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        }
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        // Validación de apellidoP 
        if (apellidoP == null || apellidoP.trim().isEmpty()) {
            throw new IllegalArgumentException("El apellidoP no puede ser nulo o vacío.");
        }
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        // Validación de apellidoM 
        if (apellidoM == null || apellidoM.trim().isEmpty()) {
            throw new IllegalArgumentException("El apellidoM no puede ser nulo o vacío.");
        }
        this.apellidoM = apellidoM;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        // Validación de idDireccion 
        if (idDireccion < 0) {
            throw new IllegalArgumentException("El idDireccion no puede ser un número negativo.");
        }
        this.idDireccion = idDireccion;
    }

}
