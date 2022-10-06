package Logica;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Profesor extends Usuario {
    private String descripcion;
    private String biografia;
    private String sitioWeb;

    @ManyToOne
    private InstitucionDeportiva institucion;

    @OneToMany(cascade = {jakarta.persistence.CascadeType.ALL})
    private List<Clase> clases = new ArrayList<>();

    public Profesor() {

    }

    public Profesor(String nickname, String nombre, String apellido, String mail, Date fechaNac,String descripcion, String sitioWeb, String biografia, InstitucionDeportiva institucion) {
        super(nickname, nombre, apellido, mail, fechaNac);
        this.descripcion = descripcion;
        this.biografia = biografia;
        this.sitioWeb = sitioWeb;
        this.institucion = institucion;
        this.clases = new ArrayList<Clase>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public InstitucionDeportiva getInstitucion() {
        return institucion;
    }

    public void setInstitucion(InstitucionDeportiva institucion) {
        this.institucion = institucion;
    }

    public List<Clase> getClases() {
        return clases;
    }

    public void setClases(Clase clase) {
        this.clases.add(clase);
    }
    
    
}
