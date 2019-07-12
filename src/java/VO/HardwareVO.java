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
public class HardwareVO {
    
    
    private String IdHardware,Nombre,Descripcion,Observacion,PrestamoFK,EstadoFK,EstadoObjeto,Marca,Referencia,AsignacionFK,FechaCreado,FechaModifi,UsuarioFK,BodegaFK;

    public HardwareVO(String IdHardware, String Nombre, String Descripcion, String Observacion, String PrestamoFK, String EstadoFK, String EstadoObjeto, String Marca, String Referencia, String AsignacionFK, String FechaCreado, String FechaModifi, String UsuarioFK, String BodegaFK) {
        this.IdHardware = IdHardware;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Observacion = Observacion;
        this.PrestamoFK = PrestamoFK;
        this.EstadoFK = EstadoFK;
        this.EstadoObjeto = EstadoObjeto;
        this.Marca = Marca;
        this.Referencia = Referencia;
        this.AsignacionFK = AsignacionFK;
        this.FechaCreado = FechaCreado;
        this.FechaModifi = FechaModifi;
        this.UsuarioFK = UsuarioFK;
        this.BodegaFK = BodegaFK;
    }

    public HardwareVO() {
    }

    public String getIdHardware() {
        return IdHardware;
    }

    public void setIdHardware(String IdHardware) {
        this.IdHardware = IdHardware;
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

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    public String getPrestamoFK() {
        return PrestamoFK;
    }

    public void setPrestamoFK(String PrestamoFK) {
        this.PrestamoFK = PrestamoFK;
    }

    public String getEstadoFK() {
        return EstadoFK;
    }

    public void setEstadoFK(String EstadoFK) {
        this.EstadoFK = EstadoFK;
    }

    public String getEstadoObjeto() {
        return EstadoObjeto;
    }

    public void setEstadoObjeto(String EstadoObjeto) {
        this.EstadoObjeto = EstadoObjeto;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public String getAsignacionFK() {
        return AsignacionFK;
    }

    public void setAsignacionFK(String AsignacionFK) {
        this.AsignacionFK = AsignacionFK;
    }

    public String getFechaCreado() {
        return FechaCreado;
    }

    public void setFechaCreado(String FechaCreado) {
        this.FechaCreado = FechaCreado;
    }

    public String getFechaModifi() {
        return FechaModifi;
    }

    public void setFechaModifi(String FechaModifi) {
        this.FechaModifi = FechaModifi;
    }

    public String getUsuarioFK() {
        return UsuarioFK;
    }

    public void setUsuarioFK(String UsuarioFK) {
        this.UsuarioFK = UsuarioFK;
    }

    public String getBodegaFK() {
        return BodegaFK;
    }

    public void setBodegaFK(String BodegaFK) {
        this.BodegaFK = BodegaFK;
    }
    
    
}
