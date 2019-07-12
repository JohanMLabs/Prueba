/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Config.Conexion;
import Interfaces.CRUD_COMPRAS;
import VO.ComprasVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author blanclabs
 */
public class ComprasDAO extends Conexion implements CRUD_COMPRAS{

      ComprasVO compras = new ComprasVO();

    Conexion conexion = new Conexion();

    private Connection Conn = null;
    private Statement puente = null;
    private ResultSet rs = null;

    public ComprasDAO(ComprasVO compVO) {
    }

  
    
    @Override
    public boolean AgregarRegistro(ComprasVO comprasVo) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       //String Sql = " INSERT INTO `software`(`IdSoftware`, `Nombre`, `Version`, `HardwareFK`, `FechaCreado`, `FechaModifi`, `DepartamentoFK`) VALUES ('" + softwareVo.getIdSoftware()+ "', '" + softwareVo.getNombre() + "','" + softwareVo.getVersion()+ "','" + softwareVo.getHardwareFK()+ "','" + softwareVo.getFechaCreado()+ "','" + softwareVo.getFechaModifi()+ "','" + softwareVo.getDepartamentoFK() + "' ) ";
       String Sql = " INSERT INTO `compras`(`IdCompra`, `Nombre`, `Descripcion`, `FechaCompra`) VALUES ('" + comprasVo.getIdCompra()+ "', '" + comprasVo.getNombre() + "','" + comprasVo.getDescripcion()+ "','" + comprasVo.getFechaCompra()+  "' ) ";
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
    public boolean ActualizarRegistro(ComprasVO comprasVo) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         String Sql = "UPDATE hardware SET   Nombre='" + comprasVo.getNombre() + "' , Descripcion='" + comprasVo.getDescripcion() + "' ,  FechaCompra='" + comprasVo.getFechaCompra()+ "' WHERE IdCompra='" + comprasVo.getIdCompra()+ "' ";
                   
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
    public boolean EliminarRegistro(int IdCompra) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
       String Sql = "DELETE compras where IdCompra=" + IdCompra;
            try {
            conn = conexion.obtenerConexion();
            puente = conn.prepareStatement(Sql);
            puente.executeUpdate(Sql);

        } catch (Exception e) {
            e.getStackTrace();
        }
        return false;
    }
    
  public ArrayList<ComprasVO> Listar() {
        ArrayList<ComprasVO> List = new ArrayList<>();
       // String Sql = "select idUsuario,Usuario,Nombres,Apellidos,Telefono,Correo,Rol from usuarios where Rol = 'veterinario' and Estado=1;";
        String Sql = "SELECT `IdCompra`, `Nombre`, `Descripcion`, `FechaCompra` FROM `compras` WHERE compras;";
        try {
            conn = conexion.obtenerConexion();
            puente = conn.prepareStatement(Sql);
            rs = puente.executeQuery(Sql);

            while (rs.next()) {
                ComprasVO comprasVO = new ComprasVO();

                comprasVO.setIdCompra(rs.getString("IdCompra"));
                comprasVO.setNombre(rs.getString("Nombre"));
                comprasVO.setDescripcion(rs.getString("Descripcion"));
                comprasVO.setFechaCompra(rs.getString("FechaCompra("));
                

                List.add(comprasVO);

            }

        } catch (Exception e) {
            e.getStackTrace();
        }

        return List;
    }

    

    public ComprasVO ListarId(String IdCompra) {
        String Sql = "SELECT `IdCompra`, `Nombre`, `Descripcion`, `FechaCompra` FROM `compras` where IdCompra=" + IdCompra;
        try {
            Conn = conexion.obtenerConexion();
            puente = Conn.prepareStatement(Sql);
            rs = puente.executeQuery(Sql);
            while (rs.next()) {
                
                 compras.setIdCompra(rs.getString("IdCompras"));
                compras.setNombre(rs.getString("Nombre"));
                compras.setDescripcion(rs.getString("Descripcion"));
                compras.setFechaCompra(rs.getString("FechaCompra"));
              
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
        return compras;
    }  
}
