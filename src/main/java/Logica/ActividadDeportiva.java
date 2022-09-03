package Logica;

import Datatypes.DtClase;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Shifter
 */
public class ActividadDeportiva {

    private String nombre;
    private String descripcion;
    private int duracion;
    private float costo;
    private Date fechaReg;
    private List<DtClase> clases;

    public ActividadDeportiva(String nombre, String descripcion, int duracion, float costo, Date fechaReg) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.costo = costo;
        this.fechaReg = fechaReg;
        this.clases = new ArrayList<DtClase>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return descripcion;
    }

    public void setDesc(String descripcion) {
        this.descripcion = descripcion;
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

    public List<DtClase> getClases() {
        return clases;
    }

    public void setClase(DtClase clase) {
        this.clases.add(clase);
    }

}
