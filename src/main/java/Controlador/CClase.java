package Controlador;

import Controlador.Interfaces.ICClase;
import Datatypes.DtClase;
import Excepciones.ClaseExistenteException;
import Logica.Clase;
import Logica.Registro;
import Manejadores.ManejadorClase;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.*;

public class CClase implements ICClase {
    ManejadorClase manejadorClase;

    public CClase() {
        this.manejadorClase = ManejadorClase.getInstancia();
    }

    @Override
    public void altaClase(DtClase clase) throws ClaseExistenteException{
        if (manejadorClase.buscarClase(clase.getNombre()) != null)
            throw new ClaseExistenteException("El nombre ya existe");

        LocalTime horaInicio = LocalDateTime.ofInstant(clase.getHoraInicio().toInstant(),ZoneId.systemDefault()).toLocalTime();

        manejadorClase.agregarClase(new Clase(clase.getNombre(), clase.getFecha(), horaInicio, clase.getUrl(), clase.getFechaReg()));
    }

    @Override
    public DtClase consultaDictado(String nombre) {
        Clase clase = manejadorClase.buscarClase(nombre);
        Date horainicio = Date.from(clase.getHoraInicio().atDate(LocalDate.of(clase.getFecha().getYear(), clase.getFecha().getMonth(), clase.getFecha().getDate())).atZone(ZoneId.systemDefault()).toInstant());

        return new DtClase(clase.getNombre(), clase.getFecha(), horainicio, clase.getUrl(), clase.getFechaReg());
    }

    @Override
    public DtClase retornarClase(String nombre) {
        Clase clase = manejadorClase.buscarClase(nombre);
        Date horainicio = Date.from(clase.getHoraInicio().atDate(LocalDate.of(clase.getFecha().getYear(), clase.getFecha().getMonth(), clase.getFecha().getDate())).atZone(ZoneId.systemDefault()).toInstant());

        return new DtClase(clase.getNombre(), clase.getFecha(), horainicio, clase.getUrl(), clase.getFechaReg());
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
        clases.forEach(clase -> listaClases.add(new DtClase(clase.getNombre(), clase.getFecha(), Date.from(clase.getHoraInicio().atDate(LocalDate.of(clase.getFecha().getYear(), clase.getFecha().getMonth(), clase.getFecha().getDate())).atZone(ZoneId.systemDefault()).toInstant()), clase.getUrl(), clase.getFechaReg())));

        return listaClases;
    }
}
