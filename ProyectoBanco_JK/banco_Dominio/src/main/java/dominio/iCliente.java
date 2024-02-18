/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dominio;

import java.util.Date;

public interface iCliente {

    int getId();

    Date getFechaN();

    int getEdad();

    String getNombre();

    String getApellidoP();

    String getApellidoM();

    int getIdDireccion();

    void setId(int id);

    void setFechaN(Date fechaN);

    void setEdad(int edad);

    void setNombre(String nombre);

    void setApellidoP(String apellidoP);

    void setApellidoM(String apellidoM);

    void setIdDireccion(int idDireccion);
}
