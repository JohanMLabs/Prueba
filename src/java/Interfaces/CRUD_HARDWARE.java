/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import VO.HardwareVO;

/**
 *
 * @author blanclabs
 */
public interface CRUD_HARDWARE {
    public boolean AgregarRegistro(HardwareVO hardwareVo);

    public boolean ActualizarRegistro(HardwareVO hardwareVo);

    public boolean EliminarRegistro(int IdHardware);
}
