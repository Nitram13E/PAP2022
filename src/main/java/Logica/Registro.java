/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.util.Date;
@Entity
@IdClass(RegistroId.class)
@XmlAccessorType(XmlAccessType.FIELD)
public class Registro {
    @Id
    private String socio;

    @Id
    private String clase;

    @Temporal(TemporalType.DATE)
    private Date fechaReg;

    public Registro(){
    }

    public Registro(String clase, String socio) {
        this.clase = clase;
        this.socio = socio;
        this.fechaReg = new Date();
    }

    public String getSocio() {
        return socio;
    }

    public Date getFechaReg() {
        return this.fechaReg;
    }

    public String getClase() {
        return clase;
    }
}
