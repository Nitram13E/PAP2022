package Manejadores;

import Logica.ActividadDeportiva;
import Logica.Clase;
import Persistencia.Conexion;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.ArrayList;
import java.util.List;

public class ManejadorClase {
    private static ManejadorClase instancia = null;
    private Conexion conexion;
    private EntityManager entityManager;

    private ManejadorClase(){}

    public static ManejadorClase getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorClase();
        }
        return instancia;
    }

    public void agregarClase(Clase clase) {
        conexion = Conexion.getInstancia();
        entityManager = conexion.getEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(clase);

        entityManager.getTransaction().commit();
    }

    public List<Clase> obtenerClases() {
        conexion = Conexion.getInstancia();
        entityManager = conexion.getEntityManager();

        Query query = entityManager.createQuery("select c from Clase c");

        return (List<Clase>) query.getResultList();
    }
    public Clase buscarClase(String nombre) {
        conexion = Conexion.getInstancia();
        entityManager = conexion.getEntityManager();

        return entityManager.find(Clase.class, nombre);
    }
}
