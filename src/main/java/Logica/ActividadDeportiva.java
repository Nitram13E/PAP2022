package Logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Shifter
 */
public class ActividadDeportiva {

    private String nombre;
    private String desc;
    private int duracion;
    private float costo;
    private Date fechaReg;
    private List<Clase> clases;

    public ActividadDeportiva(String nombre, String desc, int duracion, float costo, Date fechaReg) {
        this.nombre = nombre;
        this.desc = desc;
        this.duracion = duracion;
        this.costo = costo;
        this.fechaReg = fechaReg;
        this.clases = new ArrayList<Clase>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public List<Clase> getClases() {
        return clases;
    }

    public void setClases(List<Clase> clases) {
        this.clases = clases;
    }

}
