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
        //instituciones.add(new InstitucionDeportiva(institucion.getNombre(), institucion.getDesc(), institucion.getUrl()));
        instituciones.add(institucion);
    }

    public List<InstitucionDeportiva> getInstituciones() {
        //List<DtInstitucionDeportiva> dtInstituciones = new ArrayList<>();
        //instituciones.forEach(institucion -> dtInstituciones.add(new DtInstitucionDeportiva(institucion.getNombre(), institucion.getDesc(), institucion.getUrl())));
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
        
    public void agregarActividadDeportiva(InstitucionDeportiva institucion, DtActividadDeportiva actividad){
        institucion.setActividades(actividad);
        
    }
        
}


