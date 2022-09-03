package Manejadores;

import Datatypes.DtInstitucionDeportiva;
import Excepciones.InstitucionExistenteException;
import Logica.InstitucionDeportiva;
import Persistencia.Conexion;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.ArrayList;
import java.util.List;

public class ManejadorInstDeportiva {
    private static ManejadorInstDeportiva instancia = null;
    private final List<InstitucionDeportiva> instituciones;
    private Conexion conexion;
    private EntityManager entityManager;
    private ManejadorInstDeportiva(){
        instituciones = new ArrayList<>();
    }
    
    public static ManejadorInstDeportiva getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorInstDeportiva();
        }
        return instancia;
    }

    public void agregarInstitucionDeportiva(InstitucionDeportiva institucion){
        conexion = Conexion.getInstancia();
        entityManager = conexion.getEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(institucion);

        entityManager.getTransaction().commit();
    }

    public List<InstitucionDeportiva> getInstituciones() {
        conexion = Conexion.getInstancia();
        entityManager = conexion.getEntityManager();

        Query query = entityManager.createQuery("select c from InstitucionDeportiva c");


        return (List<InstitucionDeportiva>) query.getResultList();
    }

    public Boolean existeInstitucion(String nombre){
        conexion = Conexion.getInstancia();
        entityManager = conexion.getEntityManager();

        return entityManager.find(InstitucionDeportiva.class, nombre) != null;
    }

    public InstitucionDeportiva buscarInstitucion(String nombre) {
        conexion = Conexion.getInstancia();
        entityManager = conexion.getEntityManager();

        return entityManager.find(InstitucionDeportiva.class, nombre);

        //throw new RuntimeException();
    }

    /*
    public List<DtActividadDeportiva> getActividadesDeportivas(InstitucionDeportiva institucion){
        for (InstitucionDeportiva institucion : instituciones){
            if(institucion.getNombre().equals(nombre)) return institucion;
        }
    }*/

    public void modificarInstitucion(InstitucionDeportiva institucion) {
        conexion = Conexion.getInstancia();
        entityManager = conexion.getEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(institucion);

        entityManager.getTransaction().commit();
    }
}


