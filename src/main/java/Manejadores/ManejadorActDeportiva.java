package Manejadores;



import Logica.ActividadDeportiva;
import Logica.Clase;
import Persistencia.Conexion;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class ManejadorActDeportiva {
    private static ManejadorActDeportiva instancia = null;
    private static EntityManager entityManager;

    private ManejadorActDeportiva(){}

    public static ManejadorActDeportiva getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorActDeportiva();

            Conexion conexion = Conexion.getInstancia();
            entityManager = conexion.getEntityManager();
        }
        return instancia;
    }

    public ActividadDeportiva buscarActividad(String nombre) {
        return entityManager.find(ActividadDeportiva.class, nombre);
    }

    public void agegarActividad(ActividadDeportiva actividad) {
        entityManager.getTransaction().begin();
        entityManager.persist(actividad);
        entityManager.getTransaction().commit();
    }

    public List<ActividadDeportiva> getActividades(){
        Query query = entityManager.createQuery("select c from ActividadDeportiva c");

        return (List<ActividadDeportiva>) query.getResultList();
    }

    public void modificarActividad(ActividadDeportiva actividadDeportiva){
        entityManager.getTransaction().begin();
        entityManager.persist(actividadDeportiva);
        entityManager.getTransaction().commit();
    }

    public void agregarClase(Clase clase, ActividadDeportiva actividadDeportiva){
        actividadDeportiva.agregarClase(clase);

        entityManager.getTransaction().begin();
        entityManager.persist(actividadDeportiva);
        entityManager.getTransaction().commit();
    }
}
