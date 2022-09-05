package Controlador.Interfaces;

import Datatypes.DtClase;
import Logica.Registro;

public interface ICClase {
    public void altaClase(DtClase clase);
    public void registroDictado();
    public DtClase consultaDictado(String nombre);
    public void rankingDictado();
    public void registroSocio(DtClase clase, Registro registro);
}
