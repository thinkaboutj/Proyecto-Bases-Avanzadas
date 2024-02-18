/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Jesus Gabriel
 */
public class DireccionDTO {
    
     private int id;
    private String calle;
    private int numero;
    private int codigoP;
    private String colonia;

    public DireccionDTO(int id, String calle, int numero, int codigoP, String colonia) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.codigoP = codigoP;
        this.colonia = colonia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(int codigoP) {
        this.codigoP = codigoP;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    
    
}
