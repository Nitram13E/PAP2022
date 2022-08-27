package Controlador;

import Controlador.Interfaces.ICActDeportiva;
import Datatypes.DtActividadDeportiva;
import Excepciones.ActividadNoExisteException;
import Logica.ActividadDeportiva;
import Manejadores.ManejadorActDeportiva;

public class CActDeportiva implements ICActDeportiva {

    @Override
    public void altaActividad() {

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
}
