package Manejadores;



import Logica.ActividadDeportiva;

import java.util.ArrayList;
import java.util.List;

public class ManejadorActDeportiva {
    private static ManejadorActDeportiva instancia = null;
    private final List<ActividadDeportiva> actividades;
    private ManejadorActDeportiva(){
        this.actividades = new ArrayList<ActividadDeportiva>();
    }

    public static ManejadorActDeportiva getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorActDeportiva();
        }
        return instancia;
    }

    public ActividadDeportiva buscarActividad(String nombre) {
        return null;
    }

    public void agegarActividad(ActividadDeportiva actividad) {
        actividades.add(actividad);
    }

    public List<ActividadDeportiva> getActividades(){
        return actividades;
    }

    public void modificarActividad(ActividadDeportiva actividadDeportiva){
//        Conexion conexion = Conexion.getInstancia();
//        EntityManager em = conexion.getEntityManager();
//        em.getTransaction().begin();
//
//        em.update(actividadDeportiva);
//
//        em.getTransaction().commit();
    }
}
