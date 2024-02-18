/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dominio;

import java.util.Date;

/**
 *
 * @author Jesus Gabriel
 */
public interface iOperacion {
      int getId();
    Date getFecha();
    double getMonto();

    void setId(int id);
    void setFecha(Date fecha);
    void setMonto(double monto);
}
