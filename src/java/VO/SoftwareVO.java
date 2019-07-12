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
public class SoftwareVO {
    
   private String IdSoftware,Nombre,Version,HardwareFK,FechaCreado,FechaModifi,DepartamentoFK;

    public SoftwareVO() {
    }

    public SoftwareVO(String IdSoftware, String Nombre, String Version, String HardwareFK, String FechaCreado, String FechaModifi, String DepartamentoFK) {
        this.IdSoftware = IdSoftware;
        this.Nombre = Nombre;
        this.Version = Version;
        this.HardwareFK = HardwareFK;
        this.FechaCreado = FechaCreado;
        this.FechaModifi = FechaModifi;
        this.DepartamentoFK = DepartamentoFK;
    }

    public String getIdSoftware() {
        return IdSoftware;
    }

    public void setIdSoftware(String IdSoftware) {
        this.IdSoftware = IdSoftware;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public String getHardwareFK() {
        return HardwareFK;
    }

    public void setHardwareFK(String HardwareFK) {
        this.HardwareFK = HardwareFK;
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

    public String getDepartamentoFK() {
        return DepartamentoFK;
    }

    public void setDepartamentoFK(String DepartamentoFK) {
        this.DepartamentoFK = DepartamentoFK;
    }
   
   
    
}
