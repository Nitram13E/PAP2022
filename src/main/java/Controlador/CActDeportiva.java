package Controlador;

import Controlador.Interfaces.ICActDeportiva;

import Datatypes.DtActividadDeportiva;
import Datatypes.DtClase;
import Excepciones.ActividadExistenteException;
import Excepciones.ActividadNoExisteException;
import Excepciones.DuracionNegativaException;
import Excepciones.PrecioNegativoException;
import Logica.ActividadDeportiva;
import Logica.Clase;
import Manejadores.ManejadorActDeportiva;
import Manejadores.ManejadorClase;

import java.util.ArrayList;
import java.util.List;

public class CActDeportiva implements ICActDeportiva {
    ManejadorActDeportiva manejador;

    public CActDeportiva() {
        this.manejador = ManejadorActDeportiva.getInstancia();
    }

    @Override
    public void altaActividad(DtActividadDeportiva actividad) throws ActividadExistenteException, PrecioNegativoException, DuracionNegativaException {

        boolean existeActividad = manejador.existeActividad(actividad.getNombre());

        if(existeActividad) {
            throw new ActividadExistenteException("Ya existe una actividad con este nombre");
        }if(actividad.getDuracion()<0){
            throw new DuracionNegativaException("Se asignado un tiempo de duración negativo.");
        }if(actividad.getCosto()<0){
            throw new PrecioNegativoException("No se acepta precios menores a 0.");
        }
        manejador.agegarActividad(new Logica.ActividadDeportiva(actividad.getNombre(), actividad.getDesc(), actividad.getDuracion(), actividad.getCosto(), actividad.getFechaReg()));
    }

    @Override
    public void modificarActividad(DtActividadDeportiva actividadDeportiva) throws ActividadNoExisteException {
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
    public List<DtActividadDeportiva> getActividades(){
        List<DtActividadDeportiva> actividades = new ArrayList<>();
        manejador.getActividades().forEach(act -> actividades.add(new DtActividadDeportiva(act.getNombre(), act.getDesc(), act.getDuracion(), act.getCosto(), act.getFechaReg())));

        return actividades;
    }
    
    @Override
    public void agregarClaseAActividadDeportiva(DtClase dtClase, DtActividadDeportiva dtActividad)
    {
        ManejadorClase manejadorClase = ManejadorClase.getInstancia();

        ActividadDeportiva actividad = manejador.buscarActividad(dtActividad.getNombre());
        Clase clase = manejadorClase.buscarClase(dtClase.getNombre());

        actividad.setClase(clase);
    }
    
    @Override
    public List<DtClase> getClases(DtActividadDeportiva dtActividad){
        Logica.ActividadDeportiva actividad = manejador.buscarActividad(dtActividad.getNombre());

        List<DtClase> clases = new ArrayList<>();

        actividad.getClases().forEach(clase -> clases.add(new DtClase(clase.getNombre(), clase.getFecha(), clase.getHoraInicio(), clase.getUrl(), clase.getFechaReg())));

        return clases;
    }
}
