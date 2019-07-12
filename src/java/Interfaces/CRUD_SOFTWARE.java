/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import VO.HardwareVO;
import VO.SoftwareVO;

/**
 *
 * @author blanclabs
 */
public interface CRUD_SOFTWARE {
        public boolean AgregarRegistro(SoftwareVO softwareVo);

    public boolean ActualizarRegistro(SoftwareVO softwareVo);

    public boolean EliminarRegistro(int IdSoftware);
}
