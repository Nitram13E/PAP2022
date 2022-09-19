package Controlador;

import Controlador.Interfaces.ICRegistro;
import Excepciones.RegistroExistenteException;
import Logica.Clase;
import Logica.Registro;
import Manejadores.ManejadorRegistro;

import java.util.List;

public class CRegistro implements ICRegistro {
    ManejadorRegistro manejadorRegistro;

    public CRegistro() {
        this.manejadorRegistro = ManejadorRegistro.getInstancia();
    }
    @Override
    public void altaRegistro(Registro registro) throws RegistroExistenteException {
        if(!manejadorRegistro.existeRegistro(registro))
        {
            manejadorRegistro.agregarRegistro(registro);
        }
        else {
            throw new RegistroExistenteException("Socio ya registado.");
        }
    }

    @Override
    public List<Registro> obtenerRegistros() {
        return null;
    }

    @Override
    public List<Registro> obtenerRegistrosClase(Clase clase) {
        return null;
    }
}
