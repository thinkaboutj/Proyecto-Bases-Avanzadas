/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dominio;

/**
 *
 * @author Jesus Gabriel
 */
public interface iDireccion {
    
     int getId();
    String getCalle();
    int getNumero();
    int getCodigoP();
    String getColonia();

    void setId(int id);
    void setCalle(String calle);
    void setNumero(int numero);
    void setCodigoP(int codigoP);
    void setColonia(String colonia);
    
}
