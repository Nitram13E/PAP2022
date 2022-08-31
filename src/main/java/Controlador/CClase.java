package Controlador;

import Controlador.Interfaces.ICClase;
import Datatypes.DtClase;
import Datatypes.DtRegistro;
import Logica.Clase;
import Manejadores.ManejadorClase;

public class CClase implements ICClase {
    ManejadorClase manejador;

    public CClase() {
        this.manejador = ManejadorClase.getInstancia();
    }

    @Override
    public void altaClase() {
        
    }

    @Override
    public void registroDictado() {

    }

    @Override
    public void consultaDictado() {

    }

    @Override
    public void rankingDictado() {

    }

    @Override
    public void registroSocio(DtClase dtClase, DtRegistro registro){
        for(Clase clase : manejador.obtenerClases()){
            if(clase.getNombre().equals(dtClase.getNombre())) clase.agregarRegistro(registro);
        }
    }
}
