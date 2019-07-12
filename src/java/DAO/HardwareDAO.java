/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Config.Conexion;
import Interfaces.CRUD_HARDWARE;
import VO.HardwareVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author blanclabs
 */
public class HardwareDAO extends Conexion implements CRUD_HARDWARE {

    HardwareVO hardware = new HardwareVO();

    Conexion conexion = new Conexion();

    private Connection Conn = null;
    private Statement puente = null;
    private ResultSet rs = null;

    public HardwareDAO(HardwareVO hardVO) {
    }

  

    @Override
    public boolean AgregarRegistro(HardwareVO hardwareVo) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        String Sql = " INSERT INTO `hardware`(`IdHardware`, `Nombre`, `Descripcion`, `Observacion`, `PrestamoFK`, `EstadoFK`, `EstadoObjeto`, `Marca`, `Referencia`, `AsignacionFK`, `FechaCreado`, `FechaModifi`, `UsuarioFK`, `BodegaFK`) VALUES ('" + hardwareVo.getIdHardware() + "', '" + hardwareVo.getNombre() + "','" + hardwareVo.getDescripcion() + "','" + hardwareVo.getObservacion() + "','" + hardwareVo.getPrestamoFK() + "','" + hardwareVo.getEstadoFK() + "','" + hardwareVo.getEstadoObjeto() + "','" + hardwareVo.getMarca() + "' ,'" + hardwareVo.getReferencia() + "' ,'" + hardwareVo.getAsignacionFK() + "' ,'" + hardwareVo.getFechaCreado() + "' ,'" + hardwareVo.getFechaModifi() + "' ,'" + hardwareVo.getUsuarioFK() + "' ,'" + hardwareVo.getBodegaFK() + "' ) ";
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
    public boolean ActualizarRegistro(HardwareVO hardwareVo) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          String Sql = "UPDATE hardware SET   Nombre='" + hardwareVo.getNombre() + "' , Descripcion='" + hardwareVo.getDescripcion() + "' ,  Observacion='" + hardwareVo.getObservacion() + "', PrestamoFK='" + hardwareVo.getPrestamoFK() + "', EstadoFK='" + hardwareVo.getEstadoFK() + "', EstadoObjeto='" + hardwareVo.getEstadoObjeto() + "', Marca='" + hardwareVo.getMarca() + "', Referencia='" + hardwareVo.getReferencia() + "', AsignacionFK='" + hardwareVo.getAsignacionFK() + "', FechaCreado='" + hardwareVo.getFechaCreado() + "', FechaModifi='" + hardwareVo.getFechaModifi() + "', UsuarioFK='" + hardwareVo.getUsuarioFK() + "', BodegaFK='" + hardwareVo.getBodegaFK() + "' WHERE IdHardware='" + hardwareVo.getIdHardware() + "' ";
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
    public boolean EliminarRegistro(int IdHardware) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
            String Sql = "DELETE FROM hardware where IdHardware=" + IdHardware;
        try {
            Conn = conexion.obtenerConexion();
            puente = Conn.prepareStatement(Sql);
            puente.executeUpdate(Sql);
        } catch (Exception e) {
            e.getStackTrace();
        }
        return false;
    }
    
       public ArrayList<HardwareVO> Listar() {
        ArrayList<HardwareVO> List = new ArrayList<>();
       // String Sql = "select idUsuario,Usuario,Nombres,Apellidos,Telefono,Correo,Rol from usuarios where Rol = 'veterinario' and Estado=1;";
        String Sql = "SELECT `IdHardware`, `Nombre`, `Descripcion`, `Observacion`, `PrestamoFK`, `EstadoFK`, `EstadoObjeto`, `Marca`, `Referencia`, `AsignacionFK`, `FechaCreado`, `FechaModifi`, `UsuarioFK`, `BodegaFK` FROM `hardware` WHERE hardware;";
        try {
            conn = conexion.obtenerConexion();
            puente = conn.prepareStatement(Sql);
            rs = puente.executeQuery(Sql);

            while (rs.next()) {
                HardwareVO hardwareVO = new HardwareVO();

                hardwareVO.setIdHardware(rs.getString("IdHardware"));
                hardwareVO.setNombre(rs.getString("Nombre"));
                hardwareVO.setDescripcion(rs.getString("Descripcion"));
                hardwareVO.setObservacion(rs.getString("Observacion"));
                hardwareVO.setPrestamoFK(rs.getString("PrestamoFK"));
                hardwareVO.setEstadoFK(rs.getString("EstadoFK"));
                hardwareVO.setEstadoObjeto(rs.getString("EstadoObjeto"));
                hardwareVO.setMarca(rs.getString("Marca"));
                hardwareVO.setReferencia(rs.getString("Referencia"));
                hardwareVO.setAsignacionFK(rs.getString("AsignacionFK"));
                hardwareVO.setFechaCreado(rs.getString("FechaCreado"));
                hardwareVO.setFechaModifi(rs.getString("FechaModifi"));
                hardwareVO.setUsuarioFK(rs.getString("UsuarioFK"));
                hardwareVO.setBodegaFK(rs.getString("BodegaFK"));

                List.add(hardwareVO);

            }

        } catch (Exception e) {
            e.getStackTrace();
        }

        return List;
    }

    

    public HardwareVO ListarId(String IdHardware) {
        String Sql = "select IdHardware,Nombre,Descripcion,Observacion,PrestamoFK,EstadoFK,EstadoObjeto,Marca,Referencia,AsignacionFK,FechaCreado,FechaModifi,UsuarioFK,BodegaFK from usuarios where IdHardware=" + IdHardware;
        try {
            Conn = conexion.obtenerConexion();
            puente = Conn.prepareStatement(Sql);
            rs = puente.executeQuery(Sql);
            while (rs.next()) {
                
                 hardware.setIdHardware(rs.getString("IdHardware"));
                hardware.setNombre(rs.getString("Nombre"));
                hardware.setDescripcion(rs.getString("Descripcion"));
                hardware.setObservacion(rs.getString("Observacion"));
                hardware.setPrestamoFK(rs.getString("PrestamoFK"));
                hardware.setEstadoFK(rs.getString("EstadoFK"));
                hardware.setEstadoObjeto(rs.getString("EstadoObjeto"));
                hardware.setMarca(rs.getString("Marca"));
                hardware.setReferencia(rs.getString("Referencia"));
                hardware.setAsignacionFK(rs.getString("AsignacionFK"));
                hardware.setFechaCreado(rs.getString("FechaCreado"));
                hardware.setFechaModifi(rs.getString("FechaModifi"));
                hardware.setUsuarioFK(rs.getString("UsuarioFK"));
                hardware.setBodegaFK(rs.getString("BodegaFK"));
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
        return hardware;
    }
    }
    

   



    

