package Controlador.Interfaces;

import Datatypes.DtClase;
import Datatypes.DtRegistro;

public interface ICClase {
    public void altaClase();
    public void registroDictado();
    public void consultaDictado();
    public void rankingDictado();
    public void registroSocio(DtClase clase, DtRegistro registro);
}
