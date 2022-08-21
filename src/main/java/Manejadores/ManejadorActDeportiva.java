package Manejadores;

import Logica.ActividadDeportiva;

public class ManejadorActDeportiva {
    private static ManejadorActDeportiva instancia = null;
    private ManejadorActDeportiva(){}

    public static ManejadorActDeportiva getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorActDeportiva();
        }
        return instancia;
    }

    public ActividadDeportiva buscarActividad(String nombre){
        return null;
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
