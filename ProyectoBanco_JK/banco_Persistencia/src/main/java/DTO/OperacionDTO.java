/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para la entidad Operacion.
 * 
 * Un OperacionDTO encapsula la información relacionada con una operación, incluyendo
 * el ID, la fecha y el monto de la operación.
 * 
 * @author Jesus Gabriel
 */
public class OperacionDTO {

    // Propiedades de la clase
    private int id;
    private Date fecha;
    private double monto;

    /**
     * Constructor de la clase OperacionDTO.
     * 
     * @param id     El ID de la operación.
     * @param fecha  La fecha de la operación.
     * @param monto  El monto de la operación.
     */
    public OperacionDTO(int id, Date fecha, double monto) {
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

}
