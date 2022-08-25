/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datatypes;

import java.util.Date;

/**
 *
 * @author Shifter
 */
public class DtProfesor extends DtUsuario {
    
    private DtInstitucionDeportiva institucion;
    private String descripcion;
    private String sitioWeb;
    private String biografia;
    
    public DtProfesor(String nickname, String nombre, String apellido, String mail, Date fechaNac, DtInstitucionDeportiva institucion, String descripcion, String sitioWeb, String biografia) {
        super(nickname, nombre, apellido, mail, fechaNac);
        this.institucion = institucion;
        this.descripcion = descripcion;
        this.sitioWeb = sitioWeb;
        this.biografia = biografia;
    }

    public DtInstitucionDeportiva getInstitucion() {
        return institucion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public String getBiografia() {
        return biografia;
    }
    
    
}
