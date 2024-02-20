/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Objects;

/**
 * Clase que representa una dirección.
 * 
 * Esta clase proporciona una estructura para almacenar información relacionada
 * con una dirección, incluyendo la calle, número, colonia, y un identificador único.
 * 
 * @author Jesus Gabriel
 */
public class Direccion  {
    
    // Propiedades de la clase
    private int id;
    private String calle;
    private int numero;
    private String colonia;

    /**
     * Constructor de la clase Direccion con identificador único.
     * 
     * @param id       El identificador único de la dirección.
     * @param calle    El nombre de la calle.
     * @param numero   El número de la dirección.
     * @param colonia  El nombre de la colonia.
     */
    public Direccion(int id, String calle, int numero, String colonia) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
    }

    /**
     * Constructor de la clase Direccion sin identificador único.
     * 
     * @param calle    El nombre de la calle.
     * @param numero   El número de la dirección.
     * @param colonia  El nombre de la colonia.
     */
    public Direccion(String calle, int numero, String colonia) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
    }

    /**
     * Obtiene el identificador único de la dirección.
     * 
     * @return El identificador único de la dirección.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único de la dirección.
     * 
     * @param id El nuevo identificador único de la dirección.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la calle.
     * 
     * @return El nombre de la calle.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece el nombre de la calle.
     * 
     * @param calle El nuevo nombre de la calle.
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
     * Obtiene el nombre de la colonia.
     * 
     * @return El nombre de la colonia.
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Establece el nombre de la colonia.
     * 
     * @param colonia El nuevo nombre de la colonia.
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * Genera un código hash único para la dirección.
     * 
     * @return El código hash generado.
     */
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    /**
     * Compara la dirección actual con otro objeto para determinar si son iguales.
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
        final Direccion other = (Direccion) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.calle, other.calle)) {
            return false;
        }
        return Objects.equals(this.colonia, other.colonia);
    }

    /**
     * Devuelve una representación en cadena de la dirección.
     * 
     * @return Una cadena que representa la dirección en formato legible.
     */
    @Override
    public String toString() {
        return "Direccion{" + "id=" + id + ", calle=" + calle + ", numero=" + numero  + ", colonia=" + colonia + '}';
    }
}

