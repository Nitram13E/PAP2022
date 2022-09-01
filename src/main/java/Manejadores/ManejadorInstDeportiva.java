package Manejadores;

import Datatypes.DtActividadDeportiva;
import Logica.InstitucionDeportiva;

import java.util.ArrayList;
import java.util.List;

public class ManejadorInstDeportiva {
    private static ManejadorInstDeportiva instancia = null;
    private final List<InstitucionDeportiva> instituciones;
    private ManejadorInstDeportiva(){
        instituciones = new ArrayList<>();
    }
    
    public static ManejadorInstDeportiva getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorInstDeportiva();
        }
        return instancia;
    }

    public void agregarInstitucionDeportiva(InstitucionDeportiva institucion){
        instituciones.add(institucion);
    }

    public List<InstitucionDeportiva> getInstituciones() {
        return instituciones;
    }

    public Boolean existeInstitucion(String nombre){
        for (InstitucionDeportiva institucion : instituciones){
            if(institucion.getNombre().equals(nombre)) return true;
        }

        return false;
    }

    public InstitucionDeportiva buscarInstitucion(String nombre) {
        for (InstitucionDeportiva institucion : instituciones){
            if(institucion.getNombre().equals(nombre)) return institucion;
        }
        throw new RuntimeException();
    }

    /*
    public List<DtActividadDeportiva> getActividadesDeportivas(InstitucionDeportiva institucion){
        for (InstitucionDeportiva institucion : instituciones){
            if(institucion.getNombre().equals(nombre)) return institucion;
        }
    }*/
}


