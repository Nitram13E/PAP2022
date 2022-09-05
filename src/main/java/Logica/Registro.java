/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datatypes.DtClase;
import Datatypes.DtSocio;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.util.Date;
@Entity
@IdClass(RegistroId.class)
public class Registro {
    @Id
    @ManyToOne
    private Socio socio;

    @Id
    @ManyToOne
    private Clase clase;

    @Temporal(TemporalType.DATE)
    private Date fechaReg;

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Registro(){
    }

    public Registro(Clase clase, Socio socio, Date fechaReg) {
        this.clase = clase;
        this.socio = socio;
        this.fechaReg = fechaReg;
    }

    public DtSocio getSocio() {
        return new DtSocio(socio.getNickname(), socio.getNombre(), socio.getApellido(), socio.getMail(), socio.getFechaNac());
    }

    public Date getFechaReg() {
        return this.fechaReg;
    }

    public DtClase getClase() {
        return new DtClase(clase.getNombre(), clase.getFecha(), clase.getHoraInicio(), clase.getUrl(),  clase.getFechaReg());
    }
}
