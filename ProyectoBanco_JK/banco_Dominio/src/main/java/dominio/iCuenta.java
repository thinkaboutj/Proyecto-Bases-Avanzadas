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
public interface iCuenta {
    
     int getId();
    Date getFecha();
    int getNumC();
    double getSaldo();
    String getUsuario();
    String getContrasena();
    iCliente getCliente();

    void setId(int id);
    void setFecha(Date fecha);
    void setNumC(int numC);
    void setSaldo(double saldo);
    void setUsuario(String usuario);
    void setContrasena(String contrasena);
    void setCliente(iCliente cliente);
    
}
