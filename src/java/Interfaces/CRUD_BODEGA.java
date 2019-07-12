/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import VO.BodegaVO;

/**
 *
 * @author blanclabs
 */
public interface CRUD_BODEGA {
    
    
         public boolean AgregarRegistro(BodegaVO bodegaVo);

    public boolean ActualizarRegistro(BodegaVO bodegaVo);

    public boolean EliminarRegistro(int IdBodega);
}
