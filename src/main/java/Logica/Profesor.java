package Logica;
import Datatypes.DtClase;
import Datatypes.DtInstitucionDeportiva;
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
    private DtInstitucionDeportiva institucion;
    private List <DtClase> clases;

    public Profesor(String nickname, String nombre, String apellido, String mail, Date fechaNac,String descripcion, String sitioWeb, String biografia, DtInstitucionDeportiva institucion) {
        super(nickname, nombre, apellido, mail, fechaNac);
        this.descripcion = descripcion;
        this.biografia = biografia;
        this.sitioWeb = sitioWeb;
        this.institucion = institucion;
        this.clases = new ArrayList<DtClase>();
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

    public DtInstitucionDeportiva getInstitucion() {
        return institucion;
    }

    public void setInstitucion(DtInstitucionDeportiva institucion) {
        this.institucion = institucion;
    }

    public List<DtClase> getClases() {
        return clases;
    }

    public void setClases(List<DtClase> clases) {
        this.clases = clases;
    }
    
    
}
