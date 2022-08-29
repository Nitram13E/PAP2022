package Controlador.Interfaces;

import Datatypes.DtActividadDeportiva;
import Excepciones.ActividadNoExisteException;
import java.util.List;

public interface ICActDeportiva {
    public void altaActividad(DtActividadDeportiva actividad);
    public void modificarActividad(DtActividadDeportiva actividadDeportiva) throws ActividadNoExisteException;

    public void consultaActividad();
    public void rankingActividad();
    public List<DtActividadDeportiva> getActividades();
}
