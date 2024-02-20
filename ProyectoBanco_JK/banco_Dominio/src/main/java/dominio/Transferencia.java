/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Date;
/**
 * Clase que representa una transferencia entre cuentas.
 * 
 * Esta clase proporciona una estructura para almacenar información relacionada
 * con una transferencia, incluyendo la cuenta de destino.
 * 
 * @author Jesus Gabriel
 */
public class Transferencia  {
    
    // Propiedad de la clase
    private int cuentaD;

    /**
     * Constructor de la clase Transferencia.
     * 
     * @param cuentaD La cuenta de destino para la transferencia.
     */
    public Transferencia(int cuentaD) {        
        this.cuentaD = cuentaD;
    }

    /**
     * Obtiene la cuenta de destino para la transferencia.
     * 
     * @return La cuenta de destino.
     */
    public int getCuentaD() {
        return cuentaD;
    }

    /**
     * Establece la cuenta de destino para la transferencia.
     * 
     * @param cuentaD La nueva cuenta de destino.
     */
    public void setCuentaD(int cuentaD) {
        this.cuentaD = cuentaD;
    }

    /**
     * Genera un código hash único para la transferencia.
     * 
     * @return El código hash generado.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.cuentaD;
        return hash;
    }

    /**
     * Compara la transferencia actual con otro objeto para determinar si son iguales.
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
        final Transferencia other = (Transferencia) obj;
        return this.cuentaD == other.cuentaD;
    }
    
}
