package Manejadores;



import Logica.ActividadDeportiva;
import Logica.InstitucionDeportiva;
import Persistencia.Conexion;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.ArrayList;
import java.util.List;

public class ManejadorActDeportiva {
    private static ManejadorActDeportiva instancia = null;
    private Conexion conexion;
    private EntityManager entityManager;

    private ManejadorActDeportiva(){}

    public static ManejadorActDeportiva getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorActDeportiva();
        }
        return instancia;
    }

    public ActividadDeportiva buscarActividad(String nombre) {
        conexion = Conexion.getInstancia();
        entityManager = conexion.getEntityManager();

        return entityManager.find(ActividadDeportiva.class, nombre);
    }

    public void agegarActividad(ActividadDeportiva actividad) {
        conexion = Conexion.getInstancia();
        entityManager = conexion.getEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(actividad);

        entityManager.getTransaction().commit();
    }

    public List<ActividadDeportiva> getActividades(){
        conexion = Conexion.getInstancia();
        entityManager = conexion.getEntityManager();

        Query query = entityManager.createQuery("select c from DtActividadDeportiva c");

        return (List<ActividadDeportiva>) query.getResultList();
    }

    public void modificarActividad(ActividadDeportiva actividadDeportiva){
        conexion = Conexion.getInstancia();
        entityManager = conexion.getEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(actividadDeportiva);

        entityManager.getTransaction().commit();
    }
}
