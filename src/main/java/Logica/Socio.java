package Logica;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Socio extends Usuario {
    @OneToMany
    private List<Registro> registros = new ArrayList<>();

    public Socio() {
    }

    public Socio(String nickname, String nombre, String apellido, String contrasenia, String mail, Date fechaNac, byte[] foto) {
        super(nickname, nombre, apellido, contrasenia, mail, fechaNac, foto);
        this.registros = new ArrayList<Registro>();
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public void agregarRegistro(Registro registro){
        this.registros.add(registro);
    }
}
