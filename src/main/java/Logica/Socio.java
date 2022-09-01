package Logica;

import Datatypes.DtRegistro;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Shifter
 */
public class Socio extends Usuario {
    
    private List<DtRegistro> registros;
    
    public Socio(String nickname, String nombre, String apellido, String mail, Date fechaNac) {
        super(nickname, nombre, apellido, mail, fechaNac);
        this.registros = new ArrayList<DtRegistro>();
    }

    public List<DtRegistro> getRegistros() {
        return registros;
    }

    /* TODO: Eliminar
    public void setRegistros(List<DtRegistro> registros) {
        this.registros = registros;
    }
    */

    public void agregarRegistro(DtRegistro registro){
        this.registros.add(registro);
    }
}
