/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author blanclabs
 */
public class UsuariosVO {
    
    private String IdUsuario,Nombre,RolFK,DepartamentoFK ;

    public UsuariosVO(String IdUsuario, String Nombre, String RolFK, String DepartamentoFK) {
        this.IdUsuario = IdUsuario;
        this.Nombre = Nombre;
        this.RolFK = RolFK;
        this.DepartamentoFK = DepartamentoFK;
    }

    public UsuariosVO() {
    }

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRolFK() {
        return RolFK;
    }

    public void setRolFK(String RolFK) {
        this.RolFK = RolFK;
    }

    public String getDepartamentoFK() {
        return DepartamentoFK;
    }

    public void setDepartamentoFK(String DepartamentoFK) {
        this.DepartamentoFK = DepartamentoFK;
    }
    
}
