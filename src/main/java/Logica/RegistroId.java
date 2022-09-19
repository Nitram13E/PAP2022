package Logica;

import java.io.Serializable;
import java.util.Objects;

public class RegistroId implements Serializable {
    private static final long serialVersionUID = 1L;
    private String socio;
    private String clase;

    public RegistroId(){}

    public RegistroId(String socio, String clase) {
        this.socio = socio;
        this.clase = clase;
    }

    public String getSocio() {
        return socio;
    }

    public void setSocio(String socio) {
        this.socio = socio;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistroId that = (RegistroId) o;
        return socio.equals(that.socio) && clase.equals(that.clase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(socio, clase);
    }
}
