package Logica;

import Datatypes.DtActividadDeportiva;
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
    private List<DtActividadDeportiva> actividades;

    public InstitucionDeportiva(String nombre, String desc, String url) {
        this.nombre = nombre;
        this.desc = desc;
        this.url = url;
        this.actividades = new ArrayList<DtActividadDeportiva>();
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

    public List<DtActividadDeportiva> getActividades() {
        return actividades;
    }

    public void setActividades(List<DtActividadDeportiva> actividades) {
        this.actividades = actividades;
    }

}
