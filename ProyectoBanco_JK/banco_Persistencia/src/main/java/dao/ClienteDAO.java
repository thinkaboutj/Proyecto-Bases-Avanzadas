/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import DTO.ClienteDTO;
import DTO.CuentaDTO;
import DTO.DireccionDTO;
import DTO.RetiroDTO;
import DTO.TransferenciaDTO;
import Exception.PersistenciaExcepcion;
import Persistencia.conexion;
import Persistencia.iConexion;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Random;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author skevi
 */
public class ClienteDAO implements iCliente {

    private iConexion conexionBD;

    // Constructor que inicializa la conexión
    public ClienteDAO(iConexion conexionBD) {
        this.conexionBD = conexionBD;
    }


}
