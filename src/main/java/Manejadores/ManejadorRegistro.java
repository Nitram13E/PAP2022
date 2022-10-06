package Manejadores;

import Logica.Clase;
import Logica.Registro;
import Logica.RegistroId;
import Logica.Socio;
import Persistencia.Conexion;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class ManejadorRegistro {
    private static ManejadorRegistro instancia = null;
    private static EntityManager entityManager;

    private ManejadorRegistro() {}

    public static ManejadorRegistro getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorRegistro();

            Conexion conexion = Conexion.getInstancia();
            entityManager = conexion.getEntityManager();
        }
        return instancia;
    }

    public void agregarRegistro(Registro registro) {
        entityManager.getTransaction().begin();
        entityManager.persist(registro);
        entityManager.getTransaction().commit();
    }

    public Boolean existeRegistro(Registro registro){
        return entityManager.find(Registro.class, new RegistroId(registro.getSocio(), registro.getClase())) != null;
    }

    public List<Registro> obtenerRegistros() {
        Query query = entityManager.createQuery("select c from Registro c");

        return (List<Registro>) query.getResultList();
    }

    public List<Registro> obtenerRegistrosClase(Clase clase) {
        return (List<Registro>) entityManager.find(Registro.class, clase);
    }

    public List<Registro> obtenerRegistrosSocio(Socio socio) {
        return (List<Registro>) entityManager.find(Registro.class, socio);
    }
}
