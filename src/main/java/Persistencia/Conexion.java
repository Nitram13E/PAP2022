package Persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Conexion {
    private static Conexion instancia = null;
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;

    private Conexion(){}

    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
            entityManagerFactory = Persistence.createEntityManagerFactory("default");
            entityManager = entityManagerFactory.createEntityManager();
        }
        return instancia;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }

}
