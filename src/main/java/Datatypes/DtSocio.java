package Datatypes;

import java.util.Date;

public class DtSocio extends DtUsuario {
    public DtSocio(String nickname, String nombre, String apellido, String contrasenia, String mail, Date fechaNac, byte[] foto){
        super(nickname, nombre, apellido, contrasenia, mail, fechaNac, foto);
    }
}
