/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Date;
import java.util.Objects;

/**
 * Clase que representa una cuenta en un sistema financiero.
 *
 * @author Jesus Gabriel
 */
public class Cuenta {

    // Propiedades de la clase
    private int id;
    private Date fecha;
    private int numC;
    private double saldo;
    private String usuario;
    private String contrasena;
    private Cliente cliente;

    /**
     * Constructor de la clase Cuenta.
     *
     * @param id El ID de la cuenta.
     * @param fecha La fecha de creación de la cuenta.
     * @param numC El número de cuenta.
     * @param saldo El saldo de la cuenta.
     * @param usuario El nombre de usuario asociado a la cuenta.
     * @param contrasena La contraseña de la cuenta.
     * @param cliente El cliente asociado a la cuenta.
     */
    public Cuenta(int id, Date fecha, int numC, double saldo, String usuario, String contrasena, Cliente cliente) {
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
     */
    public void setNumC(int numC) {
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
     */
    public void setSaldo(double saldo) {
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
     */
    public void setContrasena(String contrasena) {
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
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Genera un código hash único para la cuenta.
     *
     * @return El código hash generado.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, numC, saldo, usuario, contrasena, cliente);
    }

    /**
     * Compara la cuenta actual con otro objeto para determinar si son iguales.
     *
     * @param obj El objeto con el que se va a comparar.
     * @return true si son iguales, false de lo contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cuenta other = (Cuenta) obj;
        return id == other.id
                && numC == other.numC
                && Double.compare(other.saldo, saldo) == 0
                && Objects.equals(fecha, other.fecha)
                && Objects.equals(usuario, other.usuario)
                && Objects.equals(contrasena, other.contrasena)
                && Objects.equals(cliente, other.cliente);
    }
}
