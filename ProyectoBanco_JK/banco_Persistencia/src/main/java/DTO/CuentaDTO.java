/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import dominio.iCliente;
import java.util.Date;

/**
 *
 * @author Jesus Gabriel
 */
public class CuentaDTO {

    private int id;
    private Date fecha;
    private int numC;
    private double saldo;
    private String usuario;
    private String contrasena;

    public CuentaDTO(int id, Date fecha, int numC, double saldo, String usuario, String contrasena, iCliente cliente) {
        this.id = id;
        this.fecha = fecha;
        this.numC = numC;
        this.saldo = saldo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumC() {
        return numC;
    }

    public void setNumC(int numC) {
        this.numC = numC;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public iCliente getCliente() {
        return cliente;
    }

    public void setCliente(iCliente cliente) {
        this.cliente = cliente;
    }
    private iCliente cliente;

}

