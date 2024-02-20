/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import dominio.Cliente;
import java.util.Date;
/**
 * Clase que representa un objeto de transferencia de datos (DTO) para la entidad Cuenta.
 * 
 * Un CuentaDTO encapsula la información relacionada con una cuenta, incluyendo
 * el ID, la fecha de creación, el número de cuenta, el saldo, el usuario, la contraseña
 * y el cliente asociado.
 * 
 * @author Jesus Gabriel
 */
public class CuentaDTO {

    // Propiedades de la clase
    private int id;
    private Date fecha;
    private int numC;
    private double saldo;
    private String usuario;
    private String contrasena;
    private Cliente cliente;

    /**
     * Constructor de la clase CuentaDTO.
     * 
     * @param id          El ID de la cuenta.
     * @param fecha       La fecha de creación de la cuenta.
     * @param numC        El número de cuenta.
     * @param saldo       El saldo de la cuenta.
     * @param usuario     El nombre de usuario asociado a la cuenta.
     * @param contrasena  La contraseña de la cuenta.
     * @param cliente     El cliente asociado a la cuenta.
     */
    public CuentaDTO(int id, Date fecha, int numC, double saldo, String usuario, String contrasena, Cliente cliente) {
        this.id = id;
        this.fecha = fecha;
        this.numC = numC;
        this.saldo = saldo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.cliente = cliente;
    }

    /**
     * Obtiene el ID de la cuenta.
     * 
     * @return El ID de la cuenta.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID de la cuenta.
     * 
     * @param id El nuevo ID de la cuenta.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la fecha de creación de la cuenta.
     * 
     * @return La fecha de creación de la cuenta.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de creación de la cuenta.
     * 
     * @param fecha La nueva fecha de creación de la cuenta.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el número de cuenta.
     * 
     * @return El número de cuenta.
     */
    public int getNumC() {
        return numC;
    }

    /**
     * Establece el número de cuenta.
     * 
     * @param numC El nuevo número de cuenta.
     * @throws IllegalArgumentException Si el numC es un número negativo.
     */
    public void setNumC(int numC) {
        if (numC < 0) {
            throw new IllegalArgumentException("El numC no puede ser un número negativo.");
        }
        this.numC = numC;
    }

    /**
     * Obtiene el saldo de la cuenta.
     * 
     * @return El saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo El nuevo saldo de la cuenta.
     * @throws IllegalArgumentException Si el saldo es un número negativo.
     */
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser un número negativo.");
        }
        this.saldo = saldo;
    }

    /**
     * Obtiene el nombre de usuario asociado a la cuenta.
     * 
     * @return El nombre de usuario asociado a la cuenta.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Establece el nombre de usuario asociado a la cuenta.
     * 
     * @param usuario El nuevo nombre de usuario.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene la contraseña de la cuenta.
     * 
     * @return La contraseña de la cuenta.
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Establece la contraseña de la cuenta.
     * 
     * @param contrasena La nueva contraseña de la cuenta.
     * @throws IllegalArgumentException Si la contraseña es nula, vacía o tiene menos de 8 caracteres.
     */
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

    /**
     * Obtiene el cliente asociado a la cuenta.
     * 
     * @return El cliente asociado a la cuenta.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece el cliente asociado a la cuenta.
     * 
     * @param cliente El nuevo cliente asociado a la cuenta.
     * @throws IllegalArgumentException Si el cliente es nulo.
     */
    public void setCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser nulo.");
        }
        this.cliente = cliente;
    }

}
