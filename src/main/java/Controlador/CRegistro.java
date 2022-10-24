package Controlador;

import Controlador.Interfaces.ICRegistro;
import Datatypes.DtClase;
import Datatypes.DtSocio;
import Excepciones.RegistroExistenteException;
import Logica.Clase;
import Logica.Registro;
import Logica.Socio;
import Manejadores.ManejadorClase;
import Manejadores.ManejadorRegistro;
import Manejadores.ManejadorUsuario;

import java.util.List;

public class CRegistro implements ICRegistro {
    ManejadorRegistro manejadorRegistro;
    ManejadorUsuario manejadorUsuario;
    ManejadorClase manejadorClase;

    public CRegistro() {
        this.manejadorRegistro = ManejadorRegistro.getInstancia();
        this.manejadorUsuario = ManejadorUsuario.getInstancia();
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
        return manejadorRegistro.obtenerRegistros();
    }

    @Override
    public List<Registro> obtenerRegistrosSocio(DtSocio dtSocio) {
        Socio socio = (Socio) manejadorUsuario.buscarUsuario(dtSocio.getNickname());

        return manejadorRegistro.obtenerRegistrosSocio(socio);
    }

    @Override
    public List<Registro> obtenerRegistrosClase(DtClase dtClase) {
        Clase clase = manejadorClase.buscarClase(dtClase.getNombre());

        return manejadorRegistro.obtenerRegistrosClase(clase);
    }
}
