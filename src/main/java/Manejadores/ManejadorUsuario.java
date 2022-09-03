package Manejadores;


import Datatypes.DtProfesor;
import Datatypes.DtSocio;
import Datatypes.DtUsuario;
import Logica.Profesor;
import Logica.Socio;
import Logica.Usuario;
import Persistencia.Conexion;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class ManejadorUsuario {

    private static ManejadorUsuario instancia = null;
    //Lista de todos los usuarios en el sistema
    private final List<Usuario> usuarios = new ArrayList<>();
    private Conexion conexion;
    private EntityManager entityManager;

    private ManejadorUsuario() {
        conexion = Conexion.getInstancia();
        entityManager = conexion.getEntityManager();
    }

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
        //usuarios.add(usuarioAgregar);

    }//End agregarUsuario

    public Usuario buscarUsuario(String nickname) {

        //Recorre la lista de usuarios del sistema en busqueda del mismo nickname
        for (Usuario s : usuarios) {
            if (s.getNickname().equals(nickname)) {
                return s;
            }
        }

        return null;
    }//End buscarUsuario
    
    public boolean existeUsuario(String nickname)
    {
        //Recorre la lista de usuarios del sistema en busqueda del mismo nickname
        for (Usuario s : usuarios) {
            if (s.getNickname().equals(nickname)) {
                return true;
            }
        }
        
        return false;
    }
    
    public boolean existeMail(String mail)
    {
        //Recorre la lista de usuarios del sistema en busqueda del mismo nickname
        for (Usuario s : usuarios) {
            if (s.getMail().equals(mail)) {
                return true;
            }
        }
        
        return false;
    }

    public void modificarUsuario(Usuario usuario){
        Conexion conexion = Conexion.getInstancia();
        EntityManager em = conexion.getEntityManager();
        em.getTransaction().begin();

        em.persist(usuario);

        em.getTransaction().commit();

    }

    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

}
