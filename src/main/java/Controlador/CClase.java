package Controlador;

import Controlador.Interfaces.ICClase;
import Datatypes.DtClase;
import Logica.Registro;
import Logica.Clase;
import Manejadores.ManejadorClase;

public class CClase implements ICClase {
    ManejadorClase manejador;

    public CClase() {
        this.manejador = ManejadorClase.getInstancia();
    }

    @Override
    public void altaClase(DtClase clase) {
        ManejadorClase mc = ManejadorClase.getInstancia();
        mc.agregarClase(new Clase(clase.getNombre(), clase.getFecha(), clase.getHoraInicio(), clase.getUrl(), clase.getFechaReg()));
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
    public void registroSocio(DtClase dtClase, Registro registro){
        for(Clase clase : manejador.obtenerClases()){
            if(clase.getNombre().equals(dtClase.getNombre())) clase.agregarRegistro(registro);
        }
    }
}
