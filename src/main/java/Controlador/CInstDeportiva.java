package Controlador;

import Controlador.Interfaces.ICInstDeportiva;
import Datatypes.DtActividadDeportiva;
import Datatypes.DtInstitucionDeportiva;
import Excepciones.InstitucionExistenteException;
import Logica.InstitucionDeportiva;
import Manejadores.ManejadorInstDeportiva;

import java.util.ArrayList;
import java.util.List;

public class CInstDeportiva implements ICInstDeportiva {
    ManejadorInstDeportiva manejador;

    public CInstDeportiva() {
        this.manejador = ManejadorInstDeportiva.getInstancia();
    }

    @Override
    public void altaInstitucion(DtInstitucionDeportiva institucion) throws InstitucionExistenteException{
        if(manejador.existeInstitucion(institucion.getNombre())) throw new InstitucionExistenteException("La institucion ya existe.");
        manejador.agregarInstitucionDeportiva(new InstitucionDeportiva(institucion.getNombre(), institucion.getDesc(), institucion.getUrl()));
    }
    @Override
    public void modificarInstitucion(DtInstitucionDeportiva institucion) throws InstitucionExistenteException{
        if(!manejador.existeInstitucion(institucion.getNombre())) throw new InstitucionExistenteException("La institucion no existe.");

        InstitucionDeportiva institucionDeportiva = manejador.buscarInstitucion(institucion.getNombre());
        institucionDeportiva.setUrl(institucion.getUrl());
        institucionDeportiva.setDesc(institucion.getDesc());
    }

    @Override
    public List<DtInstitucionDeportiva> getInstituciones(){
        List<DtInstitucionDeportiva> instituciones = new ArrayList<DtInstitucionDeportiva>();
        manejador.getInstituciones().forEach(institucion -> instituciones.add(new DtInstitucionDeportiva(institucion.getNombre(), institucion.getDesc(), institucion.getUrl())));

        return instituciones;
    }
    
    @Override
    public void agregarActividadDeportiva(String nombreInstitucion, DtActividadDeportiva actividad){
        InstitucionDeportiva institucion = manejador.buscarInstitucion(nombreInstitucion);
        institucion.agregarActividad(actividad);
    }
    
    @Override
    public List<DtActividadDeportiva> getActividadesDeInstitucion(String nombreInstitucion){
        InstitucionDeportiva institucion = manejador.buscarInstitucion(nombreInstitucion);
        return institucion.getActividades();
    }
}
