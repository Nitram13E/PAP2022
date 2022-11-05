package Manejadores;

import Logica.Clase;
import Logica.Registro;
import Persistencia.Conexion;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class ManejadorClase {
    private static ManejadorClase instancia = null;
    private static EntityManager entityManager;

    private ManejadorClase(){}

    public static ManejadorClase getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorClase();

            Conexion conexion = Conexion.getInstancia();
            entityManager = conexion.getEntityManager();
        }
        return instancia;
    }

    public void agregarClase(Clase clase) {
        entityManager.getTransaction().begin();

        entityManager.persist(clase);

        entityManager.getTransaction().commit();
    }

    public List<Clase> obtenerClases() {
        Query query = entityManager.createQuery("select c from Clase c");

        return (List<Clase>) query.getResultList();
    }
    public Clase buscarClase(String nombre) {
        return entityManager.find(Clase.class, nombre);
    }

    public void agregarRegistro(Clase clase, Registro registro) {
        clase.agregarRegistro(registro);

        entityManager.getTransaction().begin();
        entityManager.persist(clase);
        entityManager.getTransaction().commit();
    }
}
