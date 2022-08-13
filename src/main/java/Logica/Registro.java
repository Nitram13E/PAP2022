/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import java.util.Date;

/**
 *
 * @author Shifter
 */
public class Registro {
    private Clase clase;
    private Date fechaReg;

    public Registro(Date fechaReg, Clase clase) {
        this.fechaReg = fechaReg;
        this.clase = clase;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }
    
    
}
