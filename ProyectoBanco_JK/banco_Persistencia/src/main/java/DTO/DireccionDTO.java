/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para la entidad Direccion.
 * 
 * Un DireccionDTO encapsula la información relacionada con una dirección, incluyendo
 * el ID, la calle, el número, la colonia y el ID del cliente asociado.
 * 
 * @author Jesus Gabriel
 */
public class DireccionDTO {

    // Propiedades de la clase
    private int id;
    private String calle;
    private int numero;
    private String colonia;
    private int idCliente;

    /**
     * Constructor de la clase DireccionDTO con ID.
     * 
     * @param id        El ID de la dirección.
     * @param calle     La calle de la dirección.
     * @param numero    El número de la dirección.
     * @param colonia   La colonia de la dirección.
     * @param idCliente El ID del cliente asociado a la dirección.
     */
    public DireccionDTO(int id, String calle, int numero, String colonia, int idCliente) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.idCliente = idCliente;
    }

    /**
     * Constructor de la clase DireccionDTO sin ID (para nuevas direcciones).
     * 
     * @param calle     La calle de la dirección.
     * @param numero    El número de la dirección.
     * @param colonia   La colonia de la dirección.
     * @param idCliente El ID del cliente asociado a la dirección.
     */
    public DireccionDTO(String calle, int numero, String colonia, int idCliente) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.idCliente = idCliente;
    }

    /**
     * Obtiene el ID de la dirección.
     * 
     * @return El ID de la dirección.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID de la dirección.
     * 
     * @param id El nuevo ID de la dirección.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la calle de la dirección.
     * 
     * @return La calle de la dirección.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece la calle de la dirección.
     * 
     * @param calle La nueva calle de la dirección.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el número de la dirección.
     * 
     * @return El número de la dirección.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Establece el número de la dirección.
     * 
     * @param numero El nuevo número de la dirección.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtiene la colonia de la dirección.
     * 
     * @return La colonia de la dirección.
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Establece la colonia de la dirección.
     * 
     * @param colonia La nueva colonia de la dirección.
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * Obtiene el ID del cliente asociado a la dirección.
     * 
     * @return El ID del cliente asociado a la dirección.
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Establece el ID del cliente asociado a la dirección.
     * 
     * @param idCliente El nuevo ID del cliente asociado a la dirección.
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}

