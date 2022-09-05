package Logica;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class InstitucionDeportiva {
    @Id
    private String nombre;
    private String descripcion;
    private String url;
    @OneToMany
    private List<ActividadDeportiva> actividades;

    public InstitucionDeportiva() {}

    public InstitucionDeportiva(String nombre, String descripcion, String url) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url = url;
        this.actividades = new ArrayList<ActividadDeportiva>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return this.descripcion;
    }

    public void setDesc(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<ActividadDeportiva> getActividades() {
        return this.actividades;
    }

    public void agregarActividad(ActividadDeportiva actividad) {
        this.actividades.add(actividad);
    }
}

