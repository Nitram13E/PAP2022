package Logica;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Shifter
 */
public class Profesor extends Usuario {

    private String descripcion;
    private String biografia;
    private String sitioWeb;
    private InstitucionDeportiva institucion;
    private List <Clase> clases;

    public Profesor(String descripcion, String biografia, String sitioWeb, InstitucionDeportiva institucion, String nickname, String nombre, String apellido, String mail, Date fechaNac) {
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

    public void setClases(List<Clase> clases) {
        this.clases = clases;
    }
    
    
}
