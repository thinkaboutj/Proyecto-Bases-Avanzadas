/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import DTO.ClienteDTO;
import DTO.DireccionDTO;
import Exception.PersistenciaExcepcion;
import dominio.Cliente;

/**
 *
 * @author Jesus Gabriel
 */


public interface iCliente {

    public Cliente AgregarCliente(ClienteDTO cliente, DireccionDTO dire) throws PersistenciaExcepcion;
    
}
