package Controlador;

import Controlador.Interfaces.ICClase;
import Datatypes.DtClase;
import Excepciones.ClaseExistenteException;
import Excepciones.RegistroExistenteException;
import Logica.Registro;
import Logica.Clase;
import Manejadores.ManejadorClase;

public class CClase implements ICClase {
    ManejadorClase manejador;

    public CClase() {
        this.manejador = ManejadorClase.getInstancia();
    }

    @Override
    public void altaClase(DtClase clase) throws ClaseExistenteException{
        if (manejador.buscarClase(clase.getNombre()) != null)
            throw new ClaseExistenteException("El nombre ya existe");

        manejador.agregarClase(new Clase(clase.getNombre(), clase.getFecha(), clase.getHoraInicio(), clase.getUrl(), clase.getFechaReg()));
    }

    @Override
    public void registroDictado() {
    }

    @Override
    public void rankingDictado() {
    }

    @Override
    public DtClase consultaDictado(String nombre) {
        ManejadorClase mc = ManejadorClase.getInstancia();
        Clase clase = mc.buscarClase(nombre);

        return new DtClase(clase.getNombre(), clase.getFecha(), clase.getHoraInicio(), clase.getUrl(), clase.getFechaReg());
    }

    @Override
    public DtClase retornarClase(String nombre) {
        ManejadorClase manejadorClase = ManejadorClase.getInstancia();

        Clase clase = manejadorClase.buscarClase(nombre);

        return new DtClase(clase.getNombre(), clase.getFecha(), clase.getHoraInicio(), clase.getUrl(), clase.getFechaReg());
    }

    @Override
    public void registroSocio(DtClase dtClase, Registro registro) throws RegistroExistenteException {
        Clase clase = manejador.buscarClase(dtClase.getNombre());

        for(Registro reg : clase.getRegistros()) {
            if (reg.getSocio().equals(registro.getSocio())) throw new RegistroExistenteException("Socio ya registado.");
        }

        manejador.agregarRegistro(clase, registro);
    }
}
