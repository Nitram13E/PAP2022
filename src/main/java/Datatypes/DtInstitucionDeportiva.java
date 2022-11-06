package Datatypes;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class DtInstitucionDeportiva {
    private String nombre;
    private String descripcion;
    private String url;


    public DtInstitucionDeportiva() {}

    public DtInstitucionDeportiva(String nombre, String descripcion, String url) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url = url;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getUrl() {
        return this.url;
    }

    public String getDesc() {
        return this.descripcion;
    }

    @Override
    public String toString()
    {
        return this.nombre;
    }
}
