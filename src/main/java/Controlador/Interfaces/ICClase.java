package Controlador.Interfaces;

import Datatypes.DtClase;

public interface ICClase {
    public void altaClase(DtClase clase);
    public void registroDictado();
    public DtClase consultaDictado(String nombre);
    public void rankingDictado();
}
