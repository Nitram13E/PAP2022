package Datatypes;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.time.LocalTime;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class DtClase {
    private String nombre;
    private Date fecha;
    private LocalTime horaInicio;
    private String url;
    private Date fechaReg;

    public DtClase() {
    }

    public DtClase(String nombre, Date fecha, LocalTime horaInicio, String url, Date fechaReg) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.url = url;
        this.fechaReg = fechaReg;
    }

    public String getUrl() {
        return url;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public LocalTime getHoraInicio() { //TODO: Cambiar
        return horaInicio;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
}
