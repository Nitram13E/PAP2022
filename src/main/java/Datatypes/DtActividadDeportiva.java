package Datatypes;

import Logica.Clase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DtActividadDeportiva {
    private String nombre;
    private String desc;
    private int duracion;
    private float costo;
    private Date fechaReg;
    private List<DtClase> clases;

    public DtActividadDeportiva(String nombre, String desc, int duracion, float costo, Date fechaReg) {
        this.nombre = nombre;
        this.desc = desc;
        this.duracion = duracion;
        this.costo = costo;
        this.fechaReg = fechaReg;
        this.clases = new ArrayList<DtClase>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public float getCosto() {
        return this.costo;
    }

    public Date getFechaReg() {
        return this.fechaReg;
    }

    public List<DtClase> getClases() {
        return this.clases;
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}
