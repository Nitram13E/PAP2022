package Manejadores;


import Logica.Clase;
import Logica.Registro;
import Logica.Socio;
import Logica.Usuario;
import Persistencia.Conexion;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class ManejadorUsuario {
    private static ManejadorUsuario instancia = null;
    private static EntityManager entityManager;

    private ManejadorUsuario() {}

    public static ManejadorUsuario getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorUsuario();

            Conexion conexion = Conexion.getInstancia();
            entityManager = conexion.getEntityManager();
        }
        return instancia;
    }

    public void agregarUsuario(Usuario usuario) {
        entityManager.getTransaction().begin();
        entityManager.persist(usuario);
        entityManager.getTransaction().commit();
    }//End agregarUsuario

    public Usuario buscarUsuario(String nickname) {
        return entityManager.find(Usuario.class, nickname);
    }//End buscarUsuario
    
    public boolean existeUsuario(String nickname)
    {
        return entityManager.find(Usuario.class, nickname) != null;
    }
    
    public boolean existeMail(String mail)
    {
        Query query = entityManager.createQuery("select c from Usuario c where c.mail = :mail").setParameter("mail", mail);

        return !query.getResultList().isEmpty();
    }

    public void modificarUsuario(Usuario usuario){
        entityManager.getTransaction().begin();
        entityManager.persist(usuario);
        entityManager.getTransaction().commit();
    }

    public List<Usuario> getUsuarios() {
        Query query = entityManager.createQuery("select c from Usuario c");

        return (List<Usuario>) query.getResultList();
    }

    public void agregarRegistroSocio(Socio socio, Registro registro) {
        socio.agregarRegistro(registro);

        entityManager.getTransaction().begin();
        //TODO: Buscar mejor forma de hacerlo!
        //if(entityManager.find(Registro.class, registro) == null) entityManager.persist(registro);
        entityManager.persist(socio);
        entityManager.getTransaction().commit();
    }
}
