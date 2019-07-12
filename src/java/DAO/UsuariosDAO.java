/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Config.*;
import Interfaces.CRUD_USUARIOS;
import VO.UsuariosVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author blanclabs
 */
public class UsuariosDAO extends Conexion implements CRUD_USUARIOS{
    
      UsuariosVO usuarios = new UsuariosVO();

    Conexion conexion = new Conexion();

    private Connection Conn = null;
    private Statement puente = null;
    private ResultSet rs = null;

    public UsuariosDAO(UsuariosVO usuVO) {
        
    }

    @Override
    public boolean AgregarRegistro(UsuariosVO usuariosVo) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
         String Sql = " INSERT INTO `usuario`(`IdUsuario`, `Nombre`, `RolFK`, `DepartamentoFK`) VALUES ('" + usuariosVo.getIdUsuario()+ "', '" + usuariosVo.getNombre() + "','" + usuariosVo.getRolFK()+ "','" + usuariosVo.getDepartamentoFK()+  "' ) ";
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
    public boolean ActualizarRegistro(UsuariosVO usuariosVo) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           String Sql = "UPDATE usuario SET   Nombre='" + usuariosVo.getNombre() + "' , RolFK='" + usuariosVo.getRolFK()+ "' ,  DepartamentoFK='" + usuariosVo.getDepartamentoFK()+ "' WHERE IdUsuario='" + usuariosVo.getIdUsuario()+ "' ";
                   
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
    public boolean EliminarRegistro(int IdUsuario) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
           String Sql = "DELETE usuario where IdUsuario=" + IdUsuario;
           try {
               
            conn = conexion.obtenerConexion();
            puente = conn.prepareStatement(Sql);
            puente.executeUpdate(Sql);

        } catch (Exception e) {
            e.getStackTrace();
        }
        return false;
    }
    
      
  public ArrayList<UsuariosVO> Listar() {
        ArrayList<UsuariosVO> List = new ArrayList<>();
       // String Sql = "select idUsuario,Usuario,Nombres,Apellidos,Telefono,Correo,Rol from usuarios where Rol = 'veterinario' and Estado=1;";
        String Sql = "SELECT `IdUsuario`, `Nombre`, `RolFK`, `DepartamentoFK` FROM `usuario` WHERE usuario;";
        try {
            conn = conexion.obtenerConexion();
            puente = conn.prepareStatement(Sql);
            rs = puente.executeQuery(Sql);

            while (rs.next()) {
                UsuariosVO usuariosVO = new UsuariosVO();

                usuariosVO.setIdUsuario(rs.getString("IdUsuario"));
                usuariosVO.setNombre(rs.getString("Nombre"));
                usuariosVO.setRolFK(rs.getString("RolFK"));
                usuariosVO.setDepartamentoFK(rs.getString("DepartamentoFK"));
                

                List.add(usuariosVO);

            }

        } catch (Exception e) {
            e.getStackTrace();
        }

        return List;
    }

    

    public UsuariosVO ListarId(String IdUsuario) {
        String Sql = "SELECT `IdUsuario`, `Nombre`, `RolFK`, `DepartamentoFK` FROM `usuario` where IdUsuario=" + IdUsuario;
        try {
            Conn = conexion.obtenerConexion();
            puente = Conn.prepareStatement(Sql);
            rs = puente.executeQuery(Sql);
            while (rs.next()) {
                
                 usuarios.setIdUsuario(rs.getString("IdCompras"));
                usuarios.setNombre(rs.getString("Nombre"));
                usuarios.setRolFK(rs.getString("RolFK"));
                usuarios.setDepartamentoFK(rs.getString("DepartamentoFK"));
              
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
        return usuarios;
    }  
    
    
}
