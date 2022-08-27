package Controlador.Interfaces;

import Datatypes.DtActividadDeportiva;

import java.util.List;

public interface ICActDeportiva {
    public void altaActividad(DtActividadDeportiva actividad);
    public void modificarActividad();
    public void consultaActividad();
    public void rankingActividad();
    public List<DtActividadDeportiva> getActividades();
}
