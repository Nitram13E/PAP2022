package Controlador.Interfaces;

import Datatypes.DtClase;
import Datatypes.DtSocio;
import Excepciones.RegistroExistenteException;
import Logica.Clase;
import Logica.Registro;

import java.util.List;

public interface ICRegistro {
    public void altaRegistro(Registro registro) throws RegistroExistenteException;
    public List<Registro> obtenerRegistros();
    public List<Registro> obtenerRegistrosSocio(DtSocio dtSocio);
    public List<Registro> obtenerRegistrosClase(DtClase dtClase);
}
