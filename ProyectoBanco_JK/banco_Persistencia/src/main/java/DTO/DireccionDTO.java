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
    private String colonia;
    private int idCliente;

    public DireccionDTO() {
    }
    
    // Constructor con ID
    public DireccionDTO(int id, String calle, int numero, String colonia, int idCliente) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.idCliente = idCliente;
    }

    // Constructor sin ID (para nuevas direcciones)
    public DireccionDTO(String calle, int numero, String colonia, int idCliente) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.idCliente = idCliente;
    }

    // Getters y Setters
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

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
