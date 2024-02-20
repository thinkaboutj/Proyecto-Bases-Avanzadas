/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import dominio.Cuenta;
import java.util.Date;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para la entidad RetiroSC.
 * 
 * Un RetiroDTO encapsula la información relacionada con un retiro, incluyendo
 * la contraseña, el folio, el estado, la cuenta asociada, el ID, la fecha y el monto.
 * 
 * @author Jesus Gabriel
 */
public class RetiroDTO {

    // Propiedades de la clase
    private String contrasena;
    private int folio;
    private String estado;
    private Cuenta cuenta;  // Agregamos la asociación con la clase Cuenta

    /**
     * Constructor de la clase RetiroDTO.
     * 
     * @param contrasena La contraseña asociada al retiro.
     * @param folio      El folio del retiro.
     * @param estado     El estado del retiro.
     * @param cuenta     La cuenta asociada al retiro.
     * @param id         El ID del retiro.
     * @param fecha      La fecha del retiro.
     * @param monto      El monto del retiro.
     */
    public RetiroDTO(String contrasena, int folio, String estado, Cuenta cuenta, int id, Date fecha, double monto) {
        this.contrasena = contrasena;
        this.folio = folio;
        this.estado = estado;
        this.cuenta = cuenta;
    }

    /**
     * Obtiene la contraseña asociada al retiro.
     * 
     * @return La contraseña del retiro.
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Establece la contraseña asociada al retiro.
     * 
     * @param contrasena La nueva contraseña del retiro.
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Obtiene el folio del retiro.
     * 
     * @return El folio del retiro.
     */
    public int getFolio() {
        return folio;
    }

    /**
     * Establece el folio del retiro.
     * 
     * @param folio El nuevo folio del retiro.
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }

    /**
     * Obtiene el estado del retiro.
     * 
     * @return El estado del retiro.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado del retiro.
     * 
     * @param estado El nuevo estado del retiro.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene la cuenta asociada al retiro.
     * 
     * @return La cuenta asociada al retiro.
     */
    public Cuenta getCuenta() {
        return cuenta;
    }

    /**
     * Establece la cuenta asociada al retiro.
     * 
     * @param cuenta La nueva cuenta asociada al retiro.
     */
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

}
