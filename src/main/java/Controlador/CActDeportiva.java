package Controlador;

import Controlador.Interfaces.ICActDeportiva;
import Datatypes.DtActividadDeportiva;
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
    public void modificarActividad() {

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
}
