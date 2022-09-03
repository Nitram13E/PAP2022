package Controlador.Interfaces;

import Datatypes.ActividadDeportiva;
import Datatypes.DtClase;
import Excepciones.ActividadNoExisteException;
import java.util.List;

public interface ICActDeportiva {
    public void altaActividad(ActividadDeportiva actividad);
    public void modificarActividad(ActividadDeportiva actividadDeportiva) throws ActividadNoExisteException;

    public void consultaActividad();
    public void rankingActividad();
    public List<ActividadDeportiva> getActividades();
    public void agregarClaseAActividadDeportiva(DtClase clase, ActividadDeportiva actividad);
    public List<DtClase> getClases(ActividadDeportiva dtActividad);
}
