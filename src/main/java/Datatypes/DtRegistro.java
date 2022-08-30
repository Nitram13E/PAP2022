/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datatypes;

import Datatypes.DtClase;
import Datatypes.DtSocio;

import java.util.Date;

/**
 *
 *
 */
public class DtRegistro {
    private DtSocio socio;
    private DtClase clase;
    private Date fechaReg;

    public DtRegistro(DtClase clase, DtSocio socio, Date fechaReg) {
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
