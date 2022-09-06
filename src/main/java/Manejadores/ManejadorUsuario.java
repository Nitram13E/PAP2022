package Manejadores;


import Logica.Clase;
import Logica.Usuario;
import Persistencia.Conexion;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class ManejadorUsuario {
    private static ManejadorUsuario instancia = null;
    private static Conexion conexion;
    private static EntityManager entityManager;

    private ManejadorUsuario() {}

    public static ManejadorUsuario getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorUsuario();
        }
        return instancia;
    }

    public void agregarUsuario(Usuario usuario) {
        conexion = Conexion.getInstancia();
        entityManager = conexion.getEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(usuario);

        entityManager.getTransaction().commit();
    }//End agregarUsuario

    public Usuario buscarUsuario(String nickname) {
        conexion = Conexion.getInstancia();
        entityManager = conexion.getEntityManager();

        return entityManager.find(Usuario.class, nickname);
    }//End buscarUsuario
    
    public boolean existeUsuario(String nickname)
    {
        conexion = Conexion.getInstancia();
        entityManager = conexion.getEntityManager();

        return entityManager.find(Usuario.class, nickname) != null;
    }
    
    public boolean existeMail(String mail)
    {
        conexion = Conexion.getInstancia();
        entityManager = conexion.getEntityManager();

        Query query = entityManager.createQuery("select c from Usuario c where c.mail = :mail").setParameter("mail", mail);

        return !query.getResultList().isEmpty();
    }

    public void modificarUsuario(Usuario usuario){
        conexion = Conexion.getInstancia();
        entityManager = conexion.getEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(usuario);

        entityManager.getTransaction().commit();
    }

    public List<Usuario> getUsuarios() {
        conexion = Conexion.getInstancia();
        entityManager = conexion.getEntityManager();

        Query query = entityManager.createQuery("select c from Usuario c");

        return (List<Usuario>) query.getResultList();
    }

}
