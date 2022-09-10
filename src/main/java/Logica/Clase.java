package Logica;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Clase {
    @Id
    private String nombre;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Temporal(TemporalType.TIME)
    private LocalTime horaInicio;
    private String url;

    @Temporal(TemporalType.DATE)
    private Date fechaReg;

    @OneToMany
    private List<Registro> registros = new ArrayList<>();

    public Clase(){}

    public Clase(String nombre, Date fecha, LocalTime horaInicio, String url, Date fechaReg) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.url = url;
        this.fechaReg = fechaReg;
        this.registros = new ArrayList<Registro>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public void agregarRegistro(Registro registro){
        this.registros.add(registro);
    }
}
