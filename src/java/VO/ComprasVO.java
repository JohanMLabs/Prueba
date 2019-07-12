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
public class ComprasVO {
    
    private String IdCompra,Nombre,Descripcion,FechaCompra;

    public ComprasVO(String IdCompra, String Nombre, String Descripcion, String FechaCompra) {
        this.IdCompra = IdCompra;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.FechaCompra = FechaCompra;
    }

    public ComprasVO() {
    }

    public String getIdCompra() {
        return IdCompra;
    }

    public void setIdCompra(String IdCompra) {
        this.IdCompra = IdCompra;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(String FechaCompra) {
        this.FechaCompra = FechaCompra;
    }
    
    
}
