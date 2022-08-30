package Controlador.Interfaces;

import Datatypes.DtInstitucionDeportiva;
import Excepciones.InstitucionExistenteException;

import java.util.List;

public interface ICInstDeportiva {
    public void altaInstitucion(DtInstitucionDeportiva institucion) throws InstitucionExistenteException;
    public void modificarInstitucion(DtInstitucionDeportiva institucion) throws InstitucionExistenteException;
    public List<DtInstitucionDeportiva> getInstituciones();
}
