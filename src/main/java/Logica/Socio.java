package Logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Shifter
 */
public class Socio extends Usuario {
    
    private List<Registro> registros;
    
    public Socio(String nickname, String nombre, String apellido, String mail, Date fechaNac) {
        super(nickname, nombre, apellido, mail, fechaNac);
        this.registros = new ArrayList<Registro>();
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Registro> registros) {
        this.registros = registros;
    }
    
}
