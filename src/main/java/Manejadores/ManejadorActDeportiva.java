package Manejadores;

import Datatypes.DtActividadDeportiva;
import Logica.ActividadDeportiva;

import java.util.ArrayList;
import java.util.List;

public class ManejadorActDeportiva {
    private static ManejadorActDeportiva instancia = null;
    private final List<ActividadDeportiva> actividades;
    private ManejadorActDeportiva(){
        this.actividades = new ArrayList<ActividadDeportiva>();
    }

    public static ManejadorActDeportiva getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorActDeportiva();
        }
        return instancia;
    }

    public void agegarActividad(ActividadDeportiva actividad) {
        actividades.add(actividad);
    }
    public List<ActividadDeportiva> getActividades(){
        return actividades;
    }

}
