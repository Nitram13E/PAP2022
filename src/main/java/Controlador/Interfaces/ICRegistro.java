package Controlador.Interfaces;

import Excepciones.RegistroExistenteException;
import Logica.Clase;
import Logica.Registro;

import java.util.List;

public interface ICRegistro {
    public void altaRegistro(Registro registro) throws RegistroExistenteException;
    public List<Registro> obtenerRegistros();
    public List<Registro> obtenerRegistrosClase(Clase clase);
}
