package Datatypes;

import Logica.Clase;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class DtActividadDeportiva {

    private String nombre;
    private String descripcion;
    private Integer duracion;
    private Float costo;
    private Date fechaReg;
    private List<Clase> clases;

    public DtActividadDeportiva() {}

    public DtActividadDeportiva(String nombre, String descripcion, int duracion, float costo, Date fechaReg) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.costo = costo;
        this.fechaReg = fechaReg;
        this.clases = new ArrayList<Clase>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDesc() {
        return this.descripcion;
    }

    public Integer getDuracion() {
        return this.duracion;
    }

    public Float getCosto() {
        return this.costo;
    }

    public Date getFechaReg() {
        return this.fechaReg;
    }

    public List<Clase> getClases() {
        return this.clases;
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}