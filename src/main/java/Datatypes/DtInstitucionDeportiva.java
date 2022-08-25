package Datatypes;

public class DtInstitucionDeportiva {
    private String nombre;
    private String desc;
    private String url;

    public DtInstitucionDeportiva(String nombre, String desc, String url) {
        this.nombre = nombre;
        this.desc = desc;
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDesc() {
        return desc;
    }

    public String getUrl() {
        return url;
    }
    
    @Override
    public String toString()
    {
        return this.nombre;
    }
}
