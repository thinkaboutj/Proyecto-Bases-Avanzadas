/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco_persistencia;

import Persistencia.conexion;

/**
 *
 * @author Jesus Gabriel
 */
public class Banco_Persistencia {

    /*
    AQUI PROBAREMOS SI SE HIZO LA CONEXION O NO NOMAS
    */
    public static void main(String[] args) {
         conexion conexion = new conexion();
        
        conexion.crearConexion();
        conexion.cerrarConexion();

    }
}
