package Manejadores;

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

    public List<ActividadDeportiva> getActividades(){
        return actividades;
    }

}
