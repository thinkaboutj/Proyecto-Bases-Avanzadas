/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import dominio.Cuenta;
import java.util.Date;

/**
 *
 * @author Jesus Gabriel
 */
public class RetiroDTO {

    private String contrasena;
    private int folio;
    private String estado;
    private Cuenta cuenta;  // Agregamos la asociación con la clase Cuenta

    public RetiroDTO(String contrasena, int folio, String estado, Cuenta cuenta, int id, Date fecha, double monto) {
        this.contrasena = contrasena;
        this.folio = folio;
        this.estado = estado;
        this.cuenta = cuenta;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    
}
