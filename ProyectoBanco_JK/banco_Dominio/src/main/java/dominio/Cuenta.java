/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Date;
import java.util.Objects;

public class Cuenta implements iCuenta {

    private int id;
    private Date fecha;
    private int numC;
    private double saldo;
    private String usuario;
    private String contrasena;
    private iCliente cliente;

    public Cuenta(int id, Date fecha, int numC, double saldo, String usuario, String contrasena, iCliente cliente) {
        this.id = id;
        this.fecha = fecha;
        this.numC = numC;
        this.saldo = saldo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.cliente = cliente;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Date getFecha() {
        return fecha;
    }

    @Override
    public int getNumC() {
        return numC;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public String getUsuario() {
        return usuario;
    }

    @Override
    public String getContrasena() {
        return contrasena;
    }

    @Override
    public iCliente getCliente() {
        return cliente;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public void setNumC(int numC) {
        this.numC = numC;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public void setCliente(iCliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, numC, saldo, usuario, contrasena, cliente);
    }

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
