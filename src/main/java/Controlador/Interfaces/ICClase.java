package Controlador.Interfaces;

import Datatypes.DtClase;
import Excepciones.ClaseExistenteException;
import Logica.Registro;

import java.util.List;

public interface ICClase {
    public void altaClase(DtClase clase) throws ClaseExistenteException;
    public DtClase consultaDictado(String nombre);
    public DtClase retornarClase(String nombre);
    public void registroSocio(DtClase clase, Registro registro);
    public List<DtClase> getClasesRanking();
}
