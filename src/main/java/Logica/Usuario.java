package Logica;
import jakarta.persistence.*;

import java.io.InputStream;
import java.sql.Blob;
import java.util.Date;


@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Entity
public abstract class Usuario {
    @Id
    private String nickname;
    private String nombre;
    private String apellido;
    private String contrasenia;
    @Column(unique = true)
    private String mail;

    @Temporal(TemporalType.DATE)
    private Date fechaNac;

    private byte[] foto;

    public Usuario() {
    }

    protected Usuario(String nickname, String nombre, String apellido, String contrasenia, String mail, Date fechaNac, byte[] foto)
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

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }


    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
