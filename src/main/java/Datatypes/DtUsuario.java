package Datatypes;

import java.util.Date;

public class DtUsuario {
    private String nickname;
    private String nombre;
    private String apellido;
    private String contrasenia;
    private String mail;
    private Date fechaNac;
    private byte[] foto;

    public DtUsuario(){}

    public DtUsuario(String nickname, String nombre, String apellido, String contrasenia, String mail, Date fechaNac, byte[] foto)
    {
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasenia = contrasenia;
        this.mail = mail;
        this.fechaNac = fechaNac;
        this.foto = foto;
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

    public String getContrasenia() {
        return contrasenia;
    }
    
    public String getMail() {
        return mail;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public byte[] getFoto() {
        return foto;
    }

    @Override
    public String toString()
    {
        return this.nickname;
    }
}
