package Controlador.Interfaces;

import Datatypes.DtActividadDeportiva;

public interface ICActDeportiva {
    public void altaActividad();
    public void modificarActividad(DtActividadDeportiva actividadDeportiva);
    public void consultaActividad();
    public void rankingActividad();
}
