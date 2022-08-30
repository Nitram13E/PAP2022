package Controlador;

import Controlador.Interfaces.ICClase;
import Datatypes.DtClase;


import Logica.Clase;
import Manejadores.ManejadorClase;


import Datatypes.DtRegistro;


public class CClase implements ICClase {
    
    public CClase() {
       
    }
    @Override
    public void altaClase(DtClase clase) {
        Clase nuevoDictadoClase = null;

        nuevoDictadoClase = new Clase(clase.getNombre(), clase.getFecha(), clase.getHoraInicio(), clase.getUrl(), clase.getFechaReg());

        ManejadorClase mc = ManejadorClase.getInstancia();
        mc.agregarClase(nuevoDictadoClase);

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
       
       return new DtClase(clase.getNombre(),clase.getFecha(),clase.getHoraInicio(),clase.getUrl(),clase.getFechaReg());
        
    }
     
}    
