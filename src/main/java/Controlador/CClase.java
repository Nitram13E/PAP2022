package Controlador;

import Controlador.Interfaces.ICClase;
import Datatypes.DtClase;
import Excepciones.ClaseExistenteException;
import Logica.Registro;
import Logica.Clase;
import Manejadores.ManejadorClase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CClase implements ICClase {
    ManejadorClase manejadorClase;

    public CClase() {
        this.manejadorClase = ManejadorClase.getInstancia();
    }

    @Override
    public void altaClase(DtClase clase) throws ClaseExistenteException{
        if (manejadorClase.buscarClase(clase.getNombre()) != null)
            throw new ClaseExistenteException("El nombre ya existe");

        manejadorClase.agregarClase(new Clase(clase.getNombre(), clase.getFecha(), clase.getHoraInicio(), clase.getUrl(), clase.getFechaReg()));
    }

    @Override
    public DtClase consultaDictado(String nombre) {
        Clase clase = manejadorClase.buscarClase(nombre);

        return new DtClase(clase.getNombre(), clase.getFecha(), clase.getHoraInicio(), clase.getUrl(), clase.getFechaReg());
    }

    @Override
    public DtClase retornarClase(String nombre) {
        Clase clase = manejadorClase.buscarClase(nombre);

        return new DtClase(clase.getNombre(), clase.getFecha(), clase.getHoraInicio(), clase.getUrl(), clase.getFechaReg());
    }

    @Override
    public void registroSocio(DtClase dtClase, Registro registro) {
        Clase clase = manejadorClase.buscarClase(dtClase.getNombre());
        manejadorClase.agregarRegistro(clase, registro);
    }

    @Override
    public List<DtClase> getClasesRanking() {
        List<DtClase> listaClases = new ArrayList<>();
        List<Clase> clases = manejadorClase.obtenerClases();

        clases.sort(Comparator.comparingInt(clase -> clase.getRegistros().size()));
        Collections.reverse(clases);
        clases.forEach(clase -> listaClases.add(new DtClase(clase.getNombre(), clase.getFecha(), clase.getHoraInicio(), clase.getUrl(), clase.getFechaReg())));

        return listaClases;
    }
}
