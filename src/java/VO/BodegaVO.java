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
public class BodegaVO {
    private String IdBodega,Ubicacion,Descripcion,FechaIngreso;

    public BodegaVO(String IdBodega, String Ubicacion, String Descripcion, String FechaIngreso) {
        this.IdBodega = IdBodega;
        this.Ubicacion = Ubicacion;
        this.Descripcion = Descripcion;
        this.FechaIngreso = FechaIngreso;
    }

    public BodegaVO() {
    }

    public String getIdBodega() {
        return IdBodega;
    }

    public void setIdBodega(String IdBodega) {
        this.IdBodega = IdBodega;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }
    
    
    
}
