/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import VO.UsuariosVO;

/**
 *
 * @author blanclabs
 */
public interface CRUD_USUARIOS {
    public boolean AgregarRegistro(UsuariosVO usuariosVo);

    public boolean ActualizarRegistro(UsuariosVO usuariosVo);

    public boolean EliminarRegistro(int IdUsuario);
}
