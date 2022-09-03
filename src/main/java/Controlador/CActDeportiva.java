package Controlador;

import Controlador.Interfaces.ICActDeportiva;

import Datatypes.ActividadDeportiva;
import Datatypes.DtClase;
import Excepciones.ActividadNoExisteException;
import Manejadores.ManejadorActDeportiva;

import java.util.ArrayList;
import java.util.List;

public class CActDeportiva implements ICActDeportiva {
    ManejadorActDeportiva manejador;

    public CActDeportiva() {
        this.manejador = ManejadorActDeportiva.getInstancia();
    }

    @Override
    public void altaActividad(ActividadDeportiva actividad) {
        manejador.agegarActividad(new Logica.ActividadDeportiva(actividad.getNombre(), actividad.getDesc(), actividad.getDuracion(), actividad.getCosto(), actividad.getFechaReg()));
    }

    @Override
    public void modificarActividad(ActividadDeportiva actividadDeportiva) throws ActividadNoExisteException {
        //Nombre, es unico, y fecha no se pueden modificar
        ManejadorActDeportiva mAct = ManejadorActDeportiva.getInstancia();
        Logica.ActividadDeportiva actividad = mAct.buscarActividad(actividadDeportiva.getNombre());

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
    public List<ActividadDeportiva> getActividades(){
        List<ActividadDeportiva> actividades = new ArrayList<ActividadDeportiva>();
        manejador.getActividades().forEach(act -> actividades.add(new ActividadDeportiva(act.getNombre(), act.getDesc(), act.getDuracion(), act.getCosto(), act.getFechaReg())));

        return actividades;
    }
    
    @Override
    public void agregarClaseAActividadDeportiva(DtClase clase, ActividadDeportiva actividad)
    {   
        Logica.ActividadDeportiva actividaddepor = manejador.buscarActividad(actividad.getNombre());
        actividaddepor.setClase(clase);
    }
    
    @Override
    public List<DtClase> getClases(ActividadDeportiva dtActividad){
        Logica.ActividadDeportiva actividad = manejador.buscarActividad(dtActividad.getNombre());
        
        return actividad.getClases();
    }
}
