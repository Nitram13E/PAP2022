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
        return this.nombre;
    }

    public String getUrl() {
        return this.url;
    }

    public String getDesc() {
        return this.desc;
    }

    @Override
    public String toString()
    {
        return this.nombre;
    }
}
