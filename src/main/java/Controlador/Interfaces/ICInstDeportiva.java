package Controlador.Interfaces;

import Datatypes.ActividadDeportiva;
import Datatypes.DtInstitucionDeportiva;
import Excepciones.InstitucionExistenteException;

import java.util.List;

public interface ICInstDeportiva {
    public void altaInstitucion(DtInstitucionDeportiva institucion) throws InstitucionExistenteException;
    public void modificarInstitucion(DtInstitucionDeportiva institucion) throws InstitucionExistenteException;
    public void agregarActividadDeportiva(String nombreInstitucion, ActividadDeportiva actividad);
    public List<DtInstitucionDeportiva> getInstituciones();
    public List<ActividadDeportiva> getActividadesDeInstitucion(String nombreInstitucion);
    
}
