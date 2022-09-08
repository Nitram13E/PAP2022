package Manejadores;

import Logica.InstitucionDeportiva;
import Persistencia.Conexion;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.ArrayList;
import java.util.List;

public class ManejadorInstDeportiva {
    private static ManejadorInstDeportiva instancia = null;
    private static EntityManager entityManager;

    private ManejadorInstDeportiva(){}
    
    public static ManejadorInstDeportiva getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorInstDeportiva();

            Conexion conexion = Conexion.getInstancia();
            entityManager = conexion.getEntityManager();
        }
        return instancia;
    }

    public void agregarInstitucionDeportiva(InstitucionDeportiva institucion){
        entityManager.getTransaction().begin();
        entityManager.persist(institucion);
        entityManager.getTransaction().commit();
    }

    public List<InstitucionDeportiva> getInstituciones() {
        Query query = entityManager.createQuery("select c from InstitucionDeportiva c");

        return (List<InstitucionDeportiva>) query.getResultList();
    }

    public Boolean existeInstitucion(String nombre){
        return entityManager.find(InstitucionDeportiva.class, nombre) != null;
    }

    public InstitucionDeportiva buscarInstitucion(String nombre) {
        return entityManager.find(InstitucionDeportiva.class, nombre);
    }

    /*
    public List<DtActividadDeportiva> getActividadesDeportivas(InstitucionDeportiva institucion){
        for (InstitucionDeportiva institucion : instituciones){
            if(institucion.getNombre().equals(nombre)) return institucion;
        }
    }*/

    public void modificarInstitucion(InstitucionDeportiva institucion) {
        entityManager.getTransaction().begin();
        entityManager.persist(institucion);
        entityManager.getTransaction().commit();
    }
}


