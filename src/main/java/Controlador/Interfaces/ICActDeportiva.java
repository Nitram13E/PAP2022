package Controlador.Interfaces;

import Datatypes.DtActividadDeportiva;
import Excepciones.ActividadNoExisteException;

public interface ICActDeportiva {
    public void altaActividad();
    public void modificarActividad(DtActividadDeportiva actividadDeportiva) throws ActividadNoExisteException;
    public void consultaActividad();
    public void rankingActividad();
}
