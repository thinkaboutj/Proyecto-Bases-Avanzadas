/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import dominio.Cliente;
import java.util.Date;

/**
 *
 * @author Jesus Gabriel
 */
public class CuentaDTO {

    private int id;
    private String fecha;
    private int numC;
    private double saldo;
    private String usuario;
    private String contrasena;
    private int id_cliente;

    public CuentaDTO(int id, String fecha, int numC, double saldo, String usuario, String contrasena, int id_cliente) {
        this.id = id;
        this.fecha = fecha;
        this.numC = numC;
        this.saldo = saldo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.id_cliente = id_cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumC() {
        return numC;
    }

    public void setNumC(int numC) {
        if (numC < 0) {
            throw new IllegalArgumentException("El numC no puede ser un número negativo.");
        }
        this.numC = numC;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser un número negativo.");
        }
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
        if (contrasena == null || contrasena.trim().isEmpty()) {
            throw new IllegalArgumentException("La contraseña no puede ser nula o vacía.");
        }

        // Validación adicional: al menos 8 caracteres
        if (contrasena.length() < 8) {
            throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres.");
        }

        this.contrasena = contrasena;
    }

    public int getCliente() {
        return this.id_cliente;
    }

    public void setCliente(int cliente) {
        if (cliente <= 0) {
            throw new IllegalArgumentException("El cliente no puede ser nulo.");
        }
        this.id_cliente = cliente;
    }

}
