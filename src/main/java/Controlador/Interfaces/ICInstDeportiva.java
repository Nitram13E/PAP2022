package Controlador.Interfaces;

import Datatypes.DtActividadDeportiva;
import Datatypes.DtInstitucionDeportiva;
import Excepciones.InstitucionExistenteException;
import Logica.InstitucionDeportiva;

import java.util.List;

public interface ICInstDeportiva {
    public void altaInstitucion(DtInstitucionDeportiva institucion) throws InstitucionExistenteException;
    public void modificarInstitucion(DtInstitucionDeportiva institucion) throws InstitucionExistenteException;
    public void agregarActividadDeportiva(String  noimbreInstitucion, DtActividadDeportiva actividad);
    public List<DtInstitucionDeportiva> getInstituciones();
    public List<DtActividadDeportiva> getActividadesDeInstitucion(String nombreInstitucion);
    
}
