/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

/**
 *
 * @author Jesus Gabriel
 */
import java.security.NoSuchAlgorithmException;
import java.util.List;

import DTO.ClienteDTO;
import DTO.CuentaDTO;
import DTO.DireccionDTO;
import DTO.RetiroDTO;
import DTO.TransferenciaDTO;
import Exception.PersistenciaExcepcion;

public interface iCliente {

    ClienteDTO registrarUsuario(ClienteDTO cliente, DireccionDTO domicilio) throws PersistenciaExcepcion;

    ClienteDTO login(String usr, String contrasena) throws PersistenciaExcepcion;

    TransferenciaDTO transferencia(TransferenciaDTO transferencia) throws PersistenciaExcepcion;

    List<String> consultarNumeroCuentas(int id) throws PersistenciaExcepcion;

    List<CuentaDTO> consultarCuentas(int id) throws PersistenciaExcepcion;

    CuentaDTO consultarCuenta(int id) throws PersistenciaExcepcion;

    List<TransferenciaDTO> consultarTransferencias(int id) throws PersistenciaExcepcion;

    List<RetiroDTO> consultarRetiros(int id) throws PersistenciaExcepcion;

    void deposito(long numCuenta, double monto) throws PersistenciaExcepcion;

    double consultarSaldo(long numCuenta) throws PersistenciaExcepcion;

    CuentaDTO agregarCuenta(CuentaDTO cuenta) throws PersistenciaExcepcion;

    boolean eliminarCuenta(long numCuenta) throws PersistenciaExcepcion;

    boolean retiroSinCuenta(RetiroDTO retiro) throws PersistenciaExcepcion;

    long generarFolio() throws PersistenciaExcepcion;

    int generarContrasena() throws PersistenciaExcepcion;

}
