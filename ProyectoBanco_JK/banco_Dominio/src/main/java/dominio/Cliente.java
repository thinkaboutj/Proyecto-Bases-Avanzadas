/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Date;

/**
 *
 * @author Jesus Gabriel
 */
public class Cliente {
    
     private int id;
    private Date fechaN;
    private int edad;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int idDireccion;

    // Constructor
    public Cliente(int id, Date fechaN, int edad, String nombre, String apellidoP, String apellidoM, int idDireccion) {
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
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }
 
}
