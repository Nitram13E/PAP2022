package Logica;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Socio extends Usuario {
    @OneToMany
    private List<Registro> registros;

    public Socio() {
    }

    public Socio(String nickname, String nombre, String apellido, String mail, Date fechaNac) {
        super(nickname, nombre, apellido, mail, fechaNac);
        this.registros = new ArrayList<Registro>();
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public void agregarRegistro(Registro registro){
        this.registros.add(registro);
    }
}
