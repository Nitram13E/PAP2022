package Datatypes;

public class DtInstitucionDeportiva {
    private String nombre;
    private String url;
    private String desc;


    public DtInstitucionDeportiva(String nombre, String url, String desc) {
        this.nombre = nombre;
        this.url = url;
        this.desc = desc;
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
