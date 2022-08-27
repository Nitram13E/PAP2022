package Datatypes;

import java.util.Date;

public class DtUsuario {
    private String nickname;
    private String nombre;
    private String apellido;
    private String mail;
    private Date fechaNac;

    public DtUsuario(String nickname, String nombre, String apellido, String mail, Date fechaNac)
    {
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.fechaNac = fechaNac;
    }

    public String getNickname() {
        return nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMail() {
        return mail;
    }

    public Date getFechaNac() {
        return fechaNac;
    }
    
    @Override
    public String toString()
    {
        return this.nickname;
    }
}
