/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import DTO.ClienteDTO;
import DTO.DireccionDTO;
import Exception.PersistenciaExcepcion;
import dao.ClienteDAO;
import dominio.Cliente;
import dominio.Direccion;

/**
 *
 * @author Jesus Gabriel
 */
public class ClienteControl {

    private final ClienteDAO clienteDAO;

    public ClienteControl(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

   
}
