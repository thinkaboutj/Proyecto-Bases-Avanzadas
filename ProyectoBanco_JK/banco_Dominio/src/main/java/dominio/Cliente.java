/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Jesus Gabriel
 */
public class Cliente implements iCliente {
    
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

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        if (this.idDireccion != other.idDireccion) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidoP, other.apellidoP)) {
            return false;
        }
        if (!Objects.equals(this.apellidoM, other.apellidoM)) {
            return false;
        }
        return Objects.equals(this.fechaN, other.fechaN);
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", fechaN=" + fechaN + ", edad=" + edad + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", idDireccion=" + idDireccion + '}';
    }
 
    
}
