/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Date;

/**
 *
 * @author Jesus Gabriel
 */
public class Transferencia extends Operacion {
    private int cuentaD;

    public Transferencia(int id, Date fecha, double monto) {
        super(id, fecha, monto);
        
        this.cuentaD = cuentaD;
    }

    public int getCuentaD() {
        return cuentaD;
    }

    public void setCuentaD(int cuentaD) {
        this.cuentaD = cuentaD;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.cuentaD;
        return hash;
    }

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
