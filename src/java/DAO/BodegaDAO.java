/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Config.*;
import Interfaces.CRUD_BODEGA;
import VO.BodegaVO;
import static java.awt.PageAttributes.MediaType.C;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author blanclabs
 */
public class BodegaDAO extends Conexion implements CRUD_BODEGA{
    
     BodegaVO compras = new BodegaVO();

    Conexion conexion = new Conexion();

    private Connection Conn = null;
    private Statement puente = null;
    private ResultSet rs = null;
    
     public BodegaDAO(BodegaVO bodeVO) {
         
    }

    @Override
    public boolean AgregarRegistro(BodegaVO bodegaVo) {
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         String Sql = " INSERT INTO `bodega`(`IdBodega`, `Ubicacion`, `Descripcion`, `FechaIngreso`) VALUES ('" + bodegaVo.getIdBodega()+ "', '" + bodegaVo.getUbicacion()+ "','" + bodegaVo.getDescripcion()+ "','" + bodegaVo.getFechaIngreso()+  "' ) ";
                   
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
    public boolean ActualizarRegistro(BodegaVO bodegaVo) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               String Sql = "UPDATE bodega SET   Ubicacion='" + bodegaVo.getUbicacion()+ "' , Descripcion='" + bodegaVo.getDescripcion()+ "' ,  FechaIngreso='" + bodegaVo.getFechaIngreso()+ "' WHERE IdBodega='" + bodegaVo.getIdBodega()+ "' ";
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
    public boolean EliminarRegistro(int IdBodega) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          String Sql = "DELETE bodega where IdBodega=" + IdBodega;
            try {
            conn = conexion.obtenerConexion();
            puente = conn.prepareStatement(Sql);
            puente.executeUpdate(Sql);

        } catch (Exception e) {
            e.getStackTrace();
        }
        return false;
    }
     

   public ArrayList<BodegaVO> Listar() {
        ArrayList<BodegaVO> List = new ArrayList<>();
       // String Sql = "select idUsuario,Usuario,Nombres,Apellidos,Telefono,Correo,Rol from usuarios where Rol = 'veterinario' and Estado=1;";
        String Sql = "SELECT `IdBodega`, `Ubicacion`, `Descripcion`, `FechaIngreso` FROM `bodega` WHERE bodega;";
        try {
            conn = conexion.obtenerConexion();
            puente = conn.prepareStatement(Sql);
            rs = puente.executeQuery(Sql);

            while (rs.next()) {
                BodegaVO bodegaVO = new BodegaVO();

                bodegaVO.setIdBodega(rs.getString("IdBodega"));
                bodegaVO.setUbicacion(rs.getString("Ubicacion"));
                bodegaVO.setDescripcion(rs.getString("Descripcion"));
                bodegaVO.setFechaIngreso(rs.getString("FechaIngreso"));
                

                List.add(bodegaVO);

            }

        } catch (Exception e) {
            e.getStackTrace();
        }

        return List;
    }

    

    public BodegaVO ListarId(String IdBodega) {
        String Sql = "SELECT `IdBodega`, `Ubicacion`, `Descripcion`, `FechaIngreso` FROM `bodega` where IdBodega=" + IdBodega;
        try {
            Conn = conexion.obtenerConexion();
            puente = Conn.prepareStatement(Sql);
            rs = puente.executeQuery(Sql);
            while (rs.next()) {
                
                 compras.setIdBodega(rs.getString("IdBodega"));
                compras.setUbicacion(rs.getString("Ubicacion"));
                compras.setDescripcion(rs.getString("Descripcion"));
                compras.setFechaIngreso(rs.getString("FechaIngreso"));
              
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
        return compras;
    }   
    
    
}
