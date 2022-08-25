package Controlador;

import Controlador.Interfaces.ICClase;
import DataType.DtClase;
import Logica.Clase;
import Manejadores.ManejadorClase;

public class CClase implements ICClase {
    
    	
    public CClase() {
       
    }
        public void altaClase(DtClase clase){
        Clase nuevoDictadoClase = null;
        
        nuevoDictadoClase = new Clase(clase.getNombre(),clase.getFecha(),clase.getHoraInicio(),clase.getUrl(),clase.getFechaReg());
        
        ManejadorClase mc = ManejadorClase.getInstancia();
         mc.agregarClase(nuevoDictadoClase);
        
    }

   
    @Override
    public void registroDictado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    @Override
    public void rankingDictado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
    public DtClase consultaDictado(String nombre) {
     
            ManejadorClase mc = ManejadorClase.getInstancia();
            Clase clase = mc.buscarClase(nombre);
            DtClase dtClase = clase.getDtClase();
            return dtClase;
    }
        
}