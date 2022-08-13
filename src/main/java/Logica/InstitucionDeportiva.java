package Logica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shifter
 */
public class InstitucionDeportiva {

    private String nombre;
    private String desc;
    private String url;
    //List<Profesor> profesores; Duda para el profesor
    private List<ActividadDeportiva> actividades;

    public InstitucionDeportiva(String nombre, String desc, String url/*List<Profesor> profesores*/) {
        this.nombre = nombre;
        this.desc = desc;
        this.url = url;
        //this.profesores = profesores;
        this.actividades = new ArrayList<ActividadDeportiva>();
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

//    public List<Profesor> getProfesores() {
//        return profesores;
//    }
//
//    public void setProfesores(List<Profesor> profesores) {
//        this.profesores = profesores;
//    }
    public List<ActividadDeportiva> getActividades() {
        return actividades;
    }

    public void setActividades(List<ActividadDeportiva> actividades) {
        this.actividades = actividades;
    }

}
