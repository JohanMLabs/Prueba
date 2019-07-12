/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import VO.ComprasVO;

/**
 *
 * @author blanclabs
 */
public interface CRUD_COMPRAS {
    
        public boolean AgregarRegistro(ComprasVO comprasVo);

    public boolean ActualizarRegistro(ComprasVO comprasVo);

    public boolean EliminarRegistro(int IdCompra);
    
}
