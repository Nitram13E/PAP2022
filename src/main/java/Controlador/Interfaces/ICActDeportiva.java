package Controlador.Interfaces;

import Datatypes.DtActividadDeportiva;
import Datatypes.DtClase;
import Excepciones.ActividadNoExisteException;
import java.util.List;

public interface ICActDeportiva {
    public void altaActividad(DtActividadDeportiva actividad);
    public void modificarActividad(DtActividadDeportiva actividadDeportiva) throws ActividadNoExisteException;

    public void consultaActividad();
    public void rankingActividad();
    public List<DtActividadDeportiva> getActividades();
    public void agregarClaseAActividadDeportiva(DtClase clase, DtActividadDeportiva actividad);
    public List<DtClase> getClases(DtActividadDeportiva dtActividad);
}
