package Controlador;

import Controlador.Interfaces.ICActDeportiva;

import Datatypes.DtActividadDeportiva;
import Datatypes.DtClase;
import Excepciones.ActividadNoExisteException;
import Logica.ActividadDeportiva;
import Manejadores.ManejadorActDeportiva;

import java.util.ArrayList;
import java.util.List;

public class CActDeportiva implements ICActDeportiva {
    ManejadorActDeportiva manejador;

    public CActDeportiva() {
        this.manejador = ManejadorActDeportiva.getInstancia();
    }

    @Override
    public void altaActividad(DtActividadDeportiva actividad) {
        manejador.agegarActividad(new ActividadDeportiva(actividad.getNombre(), actividad.getDesc(), actividad.getDuracion(), actividad.getCosto(), actividad.getFechaReg()));
    }

    @Override
    public void modificarActividad(DtActividadDeportiva actividadDeportiva) throws ActividadNoExisteException {
        //Nombre, es unico, y fecha no se pueden modificar
        ManejadorActDeportiva mAct = ManejadorActDeportiva.getInstancia();
        ActividadDeportiva actividad = mAct.buscarActividad(actividadDeportiva.getNombre());

        if(actividad == null) {
            throw new ActividadNoExisteException("No existe actividad deportiva con ese nombre");
        }

        actividad.setDesc(actividadDeportiva.getDesc());
        actividad.setDuracion(actividadDeportiva.getDuracion());
        actividad.setCosto(actividadDeportiva.getCosto());

        mAct.modificarActividad(actividad);
    }

    @Override
    public void consultaActividad() {

    }

    @Override
    public void rankingActividad() {

    }

    @Override
    public List<DtActividadDeportiva> getActividades(){
        List<DtActividadDeportiva> actividades = new ArrayList<DtActividadDeportiva>();
        manejador.getActividades().forEach(act -> actividades.add(new DtActividadDeportiva(act.getNombre(), act.getDesc(), act.getDuracion(), act.getCosto(), act.getFechaReg())));

        return actividades;
    }
    
    @Override
    public void agregarClaseAActividadDeportiva(DtClase clase, DtActividadDeportiva actividad)
    {   
        ActividadDeportiva actividaddepor = manejador.buscarActividad(actividad.getNombre());
        actividaddepor.setClase(clase);
    }
    
    @Override
    public List<DtClase> getClases(DtActividadDeportiva dtActividad){
        ActividadDeportiva actividad = manejador.buscarActividad(dtActividad.getNombre());
        
        return actividad.getClases();
    }
}
