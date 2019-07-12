/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Config.Conexion;
import Interfaces.CRUD_SOFTWARE;
import VO.SoftwareVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author blanclabs
 */
public class SoftwareDAO extends Conexion implements CRUD_SOFTWARE{
     SoftwareVO software = new SoftwareVO();

    Conexion conexion = new Conexion();

    private Connection Conn = null;
    private Statement puente = null;
    private ResultSet rs = null;

    public SoftwareDAO(SoftwareVO softVO) {
    }


    @Override
    public boolean AgregarRegistro(SoftwareVO softwareVo) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       String Sql = " INSERT INTO `software`(`IdSoftware`, `Nombre`, `Version`, `HardwareFK`, `FechaCreado`, `FechaModifi`, `DepartamentoFK`) VALUES ('" + softwareVo.getIdSoftware()+ "', '" + softwareVo.getNombre() + "','" + softwareVo.getVersion()+ "','" + softwareVo.getHardwareFK()+ "','" + softwareVo.getFechaCreado()+ "','" + softwareVo.getFechaModifi()+ "','" + softwareVo.getDepartamentoFK() + "' ) ";
        try {
            conn = conexion.obtenerConexion();
            puente = conn.prepareStatement(Sql);
            puente.executeUpdate(Sql);

        } catch (Exception e) {
            e.getStackTrace();
        }
        return false;
    }

    @Override
    public boolean ActualizarRegistro(SoftwareVO softwareVo) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String Sql = "UPDATE hardware SET   Nombre='" + softwareVo.getNombre() + "' , Version='" + softwareVo.getVersion()+ "' ,  gHardwareFK='" + softwareVo.getHardwareFK()+ "', FechaCreado='" + softwareVo.getFechaCreado()+ "', FechaModifi='" + softwareVo.getFechaModifi()+ "', DepartamentoFK='" + softwareVo.getDepartamentoFK() + "' WHERE IdSoftware='" + softwareVo.getIdSoftware()+ "' ";
            try {
            Conn = conexion.obtenerConexion();
            puente = Conn.prepareStatement(Sql);
            puente.executeUpdate(Sql);

        } catch (Exception e) {
            e.getStackTrace();
        }
        return false;
    }

    @Override
    public boolean EliminarRegistro(int IdSoftware) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         String Sql = "DELETE FROM software where IdSoftware=" + IdSoftware;
        try {
            Conn = conexion.obtenerConexion();
            puente = Conn.prepareStatement(Sql);
            puente.executeUpdate(Sql);
        } catch (Exception e) {
            e.getStackTrace();
        }
        return false;
    }
    
    public ArrayList<SoftwareVO> Listar() {
        ArrayList<SoftwareVO> List = new ArrayList<>();
       // String Sql = "select idUsuario,Usuario,Nombres,Apellidos,Telefono,Correo,Rol from usuarios where Rol = 'veterinario' and Estado=1;";
        String Sql = "SELECT `IdSoftware`, `Nombre`, `Version`, `HardwareFK`, `FechaCreado`, `FechaModifi`, `DepartamentoFK` FROM `software` ;";
        try {
            conn = conexion.obtenerConexion();
            puente = conn.prepareStatement(Sql);
            rs = puente.executeQuery(Sql);

            while (rs.next()) {
                SoftwareVO softwareVO = new SoftwareVO();

                softwareVO.setIdSoftware(rs.getString("IdSoftware"));
                softwareVO.setNombre(rs.getString("Nombre"));
                softwareVO.setVersion(rs.getString("Version"));
                softwareVO.setHardwareFK(rs.getString("HardwareFK"));
                softwareVO.setFechaCreado(rs.getString("FechaCreado"));
                softwareVO.setFechaModifi(rs.getString("FechaModifi"));
                softwareVO.setDepartamentoFK(rs.getString("DepartamentoFK"));
          

                List.add(softwareVO);

            }

        } catch (Exception e) {
            e.getStackTrace();
        }

        return List;
    }

    

    public SoftwareVO ListarId(String IdSoftware) {
        String Sql = "SELECT `IdSoftware`, `Nombre`, `Version`, `HardwareFK`, `FechaCreado`, `FechaModifi`, `DepartamentoFK` FROM `software` where IdSoftware=" + IdSoftware;
        try {
            Conn = conexion.obtenerConexion();
            puente = Conn.prepareStatement(Sql);
            rs = puente.executeQuery(Sql);
            while (rs.next()) {
                
               
                software.setIdSoftware(rs.getString("IdSoftware"));
                software.setNombre(rs.getString("Nombre"));
                software.setVersion(rs.getString("Version"));
                software.setHardwareFK(rs.getString("HardwareFK"));
                software.setFechaCreado(rs.getString("FechaCreado"));
                software.setFechaModifi(rs.getString("FechaModifi"));
                software.setDepartamentoFK(rs.getString("DepartamentoFK"));
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
        return software;
    }
    }

  
   