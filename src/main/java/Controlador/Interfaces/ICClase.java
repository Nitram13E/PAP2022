package Controlador.Interfaces;

import Datatypes.DtClase;
import Datatypes.DtSocio;
import Excepciones.RegistroExistenteException;
import Logica.Registro;

import java.util.List;

public interface ICClase {
    public void altaClase(DtClase clase);
    public void registroDictado();
    public DtClase consultaDictado(String nombre);
    public void rankingDictado();
    public DtClase retornarClase(String nombre);
    public void registroSocio(DtClase clase, Registro registro) throws RegistroExistenteException;
}
