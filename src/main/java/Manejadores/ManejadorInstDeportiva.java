package Manejadores;

import Datatypes.DtInstitucionDeportiva;
import Logica.InstitucionDeportiva;

import java.util.ArrayList;
import java.util.List;

public class ManejadorInstDeportiva {
    private static ManejadorInstDeportiva instancia = null;
    private final List<InstitucionDeportiva> instituciones = new ArrayList<>();
    private ManejadorInstDeportiva(){}

    public static ManejadorInstDeportiva getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorInstDeportiva();
        }
        return instancia;
    }

    public void agregarInstitucionDeportiva(DtInstitucionDeportiva institucion){
        instituciones.add(new InstitucionDeportiva(institucion.getNombre(), institucion.getDesc(), institucion.getUrl()));
    }

    public List<InstitucionDeportiva> getInstituciones() {
        return instituciones;
    }
    
    
}
