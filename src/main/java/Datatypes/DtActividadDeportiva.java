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
        return nombre;
    }

    public String getDesc() {
        return desc;
    }

    public int getDuracion() {
        return duracion;
    }

    public float getCosto() {
        return costo;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public List<DtClase> getClases() {
        return clases;
    }


}
