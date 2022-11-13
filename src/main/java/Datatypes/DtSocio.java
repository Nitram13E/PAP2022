package Datatypes;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class DtSocio extends DtUsuario {
    public DtSocio() {}

    public DtSocio(String nickname, String nombre, String apellido, String contrasenia, String mail, Date fechaNac, byte[] foto){
        super(nickname, nombre, apellido, contrasenia, mail, fechaNac, foto);
    }
}
