package Controlador;

import Controlador.Interfaces.ICInstDeportiva;
import Datatypes.DtActividadDeportiva;
import Datatypes.DtInstitucionDeportiva;
import Excepciones.InstitucionExistenteException;
import Logica.ActividadDeportiva;
import Logica.InstitucionDeportiva;
import Manejadores.ManejadorActDeportiva;
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

        manejador.modificarInstitucion(institucionDeportiva);
    }

    @Override
    public List<DtInstitucionDeportiva> getInstituciones(){
        List<DtInstitucionDeportiva> instituciones = new ArrayList<DtInstitucionDeportiva>();
        manejador.getInstituciones().forEach(institucion -> instituciones.add(new DtInstitucionDeportiva(institucion.getNombre(), institucion.getDesc(), institucion.getUrl())));

        return instituciones;
    }
    
    @Override
    public void agregarActividadDeportiva(String nombreInstitucion, DtActividadDeportiva dtActividad){
        ManejadorActDeportiva manejadorActDeportiva = ManejadorActDeportiva.getInstancia();

        InstitucionDeportiva institucion = manejador.buscarInstitucion(nombreInstitucion);
        ActividadDeportiva actividad = manejadorActDeportiva.buscarActividad(dtActividad.getNombre());

        manejador.agregarActividadDeportiva(institucion, actividad);
    }
    
    @Override
    public List<DtActividadDeportiva> getActividadesDeInstitucion(String nombreInstitucion){
        InstitucionDeportiva institucion = manejador.buscarInstitucion(nombreInstitucion);
        List<DtActividadDeportiva> actividades = new ArrayList<>();

        institucion.getActividades().forEach(actividad -> actividades.add(new DtActividadDeportiva(actividad.getNombre(), actividad.getDesc(), actividad.getDuracion(), actividad.getCosto(), actividad.getFechaReg())));

        return actividades;
    }
}
