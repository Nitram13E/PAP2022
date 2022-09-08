package Logica;

import Datatypes.DtClase;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class ActividadDeportiva {
    @Id
    private String nombre;
    private String descripcion;
    private int duracion;
    private float costo;
    private Date fechaReg;
    @OneToMany
    private List<Clase> clases;

    public ActividadDeportiva() {}
    public ActividadDeportiva(String nombre, String descripcion, int duracion, float costo, Date fechaReg) {
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public List<Clase> getClases() {
        return clases;
    }

    public void setClase(Clase clase) {
        this.clases.add(clase);
    }
}
