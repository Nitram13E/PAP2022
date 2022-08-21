package Manejadores;

import Logica.Usuario;

public class ManejadorUsuario {
    private static ManejadorUsuario instancia = null;

    private ManejadorUsuario() {
    }

    public static ManejadorUsuario getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorUsuario();
        }
        return instancia;
    }

    public Usuario buscarUsuario(String nickname){
        return null;
    }

    public void modificarUsuario(Usuario usuario){
//        Conexion conexion = Conexion.getInstancia();
//        EntityManager em = conexion.getEntityManager();
//        em.getTransaction().begin();
//
//        em.update(usuario);
//
//        em.getTransaction().commit();
    }

}
