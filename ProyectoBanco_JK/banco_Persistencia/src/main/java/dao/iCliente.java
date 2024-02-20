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
 * Interfaz que define métodos para la manipulación de objetos Cliente en la capa de acceso a datos.
 * 
 * Implementaciones de esta interfaz deben proporcionar lógica específica para agregar
 * un nuevo cliente a la base de datos, junto con su información de dirección asociada.
 * 
 * @author Jesus Gabriel
 */
public interface iCliente {

    /**
     * Agrega un nuevo cliente a la base de datos junto con su información de dirección.
     * 
     * @param cliente El objeto ClienteDTO que contiene la información del cliente a agregar.
     * @param dire    El objeto DireccionDTO que contiene la información de la dirección asociada al cliente.
     * @return        El objeto Cliente agregado a la base de datos.
     * @throws PersistenciaExcepcion Si ocurre un error durante la operación de persistencia.
     */
    public Cliente AgregarCliente(ClienteDTO cliente, DireccionDTO dire) throws PersistenciaExcepcion;
}
