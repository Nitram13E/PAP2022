package Controlador;

import Controlador.Interfaces.ICRegistro;
import Datatypes.DtClase;
import Excepciones.RegistroExistenteException;
import Logica.Clase;
import Logica.Registro;
import Manejadores.ManejadorClase;
import Manejadores.ManejadorRegistro;

import java.util.List;

public class CRegistro implements ICRegistro {
    ManejadorRegistro manejadorRegistro;
    ManejadorClase manejadorClase;

    public CRegistro() {
        this.manejadorRegistro = ManejadorRegistro.getInstancia();
        this.manejadorClase = ManejadorClase.getInstancia();
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
    public List<Registro> obtenerRegistrosClase(DtClase dtClase) {
        Clase clase = manejadorClase.buscarClase(dtClase.getNombre());

        return manejadorRegistro.obtenerRegistrosClase(clase);
    }
}
