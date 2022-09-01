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
    public void agregarClase(Clase clase) {
        clases.add(clase);
    }

    public Clase buscarClase(String nombre) {
        Clase aretornar = null;
        for (Clase c : clases) {
            if (c.getNombre().equals(nombre)) {
                aretornar = c;
            }
        }
        return aretornar;
    }
}
