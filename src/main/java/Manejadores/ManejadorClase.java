package Manejadores;

import Logica.Clase;

import java.util.ArrayList;
import java.util.List;

public class ManejadorClase {
    private static ManejadorClase instancia = null;
    private final List<Clase> clases;

    private ManejadorClase(){
        clases = new ArrayList<>();
    }

    public static ManejadorClase getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorClase();
        }
        return instancia;
    }

    public List<Clase> obtenerClases() {
        return clases;
    }
}
