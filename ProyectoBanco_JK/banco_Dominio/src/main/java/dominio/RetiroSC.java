/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Date;
import java.util.Objects;

/**
 * Clase que representa un retiro en un sistema de caja.
 *
 * Esta clase proporciona una estructura para almacenar información relacionada
 * con un retiro de efectivo, incluyendo la contraseña, folio, estado y la
 * cuenta asociada.
 *
 * @author Jesus Gabriel
 */
public class RetiroSC {

    // Propiedades de la clase
    private String contrasena;
    private int folio;
    private String estado;
    private Cuenta cuenta;  // Agregamos la asociación con la clase Cuenta

    /**
     * Constructor de la clase RetiroSC.
     *
     * @param contrasena La contraseña asociada al retiro.
     * @param folio El número de folio del retiro.
     * @param estado El estado del retiro.
     * @param cuenta La cuenta asociada al retiro.
     */
    public RetiroSC(String contrasena, int folio, String estado, Cuenta cuenta) {
        this.contrasena = contrasena;
        this.folio = folio;
        this.estado = estado;
        this.cuenta = cuenta;
    }

    /**
     * Obtiene la contraseña asociada al retiro.
     *
     * @return La contraseña asociada al retiro.
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Establece la contraseña asociada al retiro.
     *
     * @param contrasena La nueva contraseña asociada al retiro.
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Obtiene el número de folio del retiro.
     *
     * @return El número de folio del retiro.
     */
    public int getFolio() {
        return folio;
    }

    /**
     * Establece el número de folio del retiro.
     *
     * @param folio El nuevo número de folio del retiro.
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

    /**
     * Genera un código hash único para el retiro.
     *
     * @return El código hash generado.
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.contrasena);
        hash = 23 * hash + this.folio;
        hash = 23 * hash + Objects.hashCode(this.estado);
        hash = 23 * hash + Objects.hashCode(this.cuenta);
        return hash;
    }

    /**
     * Compara el retiro actual con otro objeto para determinar si son iguales.
     *
     * @param obj El objeto con el que se va a comparar.
     * @return true si son iguales, false de lo contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RetiroSC other = (RetiroSC) obj;
        if (this.folio != other.folio) {
            return false;
        }
        if (!Objects.equals(this.contrasena, other.contrasena)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        return Objects.equals(this.cuenta, other.cuenta);
    }

}
