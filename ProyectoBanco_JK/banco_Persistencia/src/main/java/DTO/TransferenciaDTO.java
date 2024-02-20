/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para la entidad Transferencia.
 * 
 * Un TransferenciaDTO encapsula la información relacionada con una transferencia, incluyendo
 * el ID, la fecha y la cuenta destino de la transferencia.
 * 
 * @author Jesus Gabriel
 */
public class TransferenciaDTO {
    
    // Propiedades de la clase
    private int cuentaD;

    /**
     * Constructor de la clase TransferenciaDTO.
     * 
     * @param id     El ID de la transferencia.
     * @param fecha  La fecha de la transferencia.
     * @param monto  El monto de la transferencia.
     */
    public TransferenciaDTO(int id, Date fecha, double monto) {
        this.cuentaD = cuentaD;
    }

    /**
     * Obtiene la cuenta destino de la transferencia.
     * 
     * @return La cuenta destino de la transferencia.
     */
    public int getCuentaD() {
        return cuentaD;
    }

    /**
     * Establece la cuenta destino de la transferencia.
     * 
     * @param cuentaD La nueva cuenta destino de la transferencia.
     */
    public void setCuentaD(int cuentaD) {
        this.cuentaD = cuentaD;
    }
}

