/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Date;
import java.util.Objects;

/**
 * Clase que representa una operación financiera.
 * 
 * Esta clase proporciona una estructura para almacenar información relacionada
 * con una operación, incluyendo el ID, la fecha y el monto de la operación.
 * 
 * @author Jesus Gabriel
 */
public class Operacion  {
    
    // Propiedades de la clase
    private int id;
    private Date fecha;
    private double monto;

    /**
     * Constructor de la clase Operacion.
     * 
     * @param id     El ID de la operación.
     * @param fecha  La fecha de la operación.
     * @param monto  El monto de la operación.
     */
    public Operacion(int id, Date fecha, double monto) {
        this.id = id;
        this.fecha = fecha;
        this.monto = monto;
    }

    /**
     * Obtiene el ID de la operación.
     * 
     * @return El ID de la operación.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID de la operación.
     * 
     * @param id El nuevo ID de la operación.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la fecha de la operación.
     * 
     * @return La fecha de la operación.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la operación.
     * 
     * @param fecha La nueva fecha de la operación.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el monto de la operación.
     * 
     * @return El monto de la operación.
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Establece el monto de la operación.
     * 
     * @param monto El nuevo monto de la operación.
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }

    /**
     * Genera un código hash único para la operación.
     * 
     * @return El código hash generado.
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.fecha);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.monto) ^ (Double.doubleToLongBits(this.monto) >>> 32));
        return hash;
    }

    /**
     * Compara la operación actual con otro objeto para determinar si son iguales.
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
        final Operacion other = (Operacion) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.monto) != Double.doubleToLongBits(other.monto)) {
            return false;
        }
        return Objects.equals(this.fecha, other.fecha);
    }

    /**
     * Devuelve una representación en cadena de la operación.
     * 
     * @return Una cadena que representa la operación en formato legible.
     */
    @Override
    public String toString() {
        return "Operacion{" + "id=" + id + ", fecha=" + fecha + ", monto=" + monto + '}';
    }
}
