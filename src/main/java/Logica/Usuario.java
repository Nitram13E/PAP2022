package Logica;
import jakarta.persistence.*;

import java.util.Date;


@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Entity
public abstract class Usuario {
    @Id
    private String nickname;
    private String nombre;
    private String apellido;
    @Column(unique = true)
    private String mail;

    @Temporal(TemporalType.DATE)
    private Date fechaNac;

    public Usuario() {
    }

    protected Usuario(String nickname, String nombre, String apellido, String mail, Date fechaNac)
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
    
    
}
