package Manejadores;

import Datatypes.DtProfesor;
import Datatypes.DtSocio;
import Datatypes.DtUsuario;
import Logica.Profesor;
import Logica.Socio;
import Logica.Usuario;
import java.util.ArrayList;
import java.util.List;

public class ManejadorUsuario {

    private static ManejadorUsuario instancia = null;
    //Lista de todos los usuarios en el sistema
    private final List<Usuario> usuarios = new ArrayList<>();

    private ManejadorUsuario() {
    }

    public static ManejadorUsuario getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorUsuario();
        }
        return instancia;
    }

    public void agregarUsuario(DtUsuario usuario) {
        Usuario usuarioAgregar = null;

        if (usuario instanceof DtProfesor) {
            usuarioAgregar = new Profesor(usuario.getNickname(), usuario.getNombre(), usuario.getApellido(), usuario.getMail(), usuario.getFechaNac(), ((DtProfesor) usuario).getDescripcion(), ((DtProfesor) usuario).getSitioWeb(), ((DtProfesor) usuario).getBiografia(), ((DtProfesor) usuario).getInstitucion());

        } else if (usuario instanceof DtSocio) {
            usuarioAgregar = new Socio(usuario.getNickname(), usuario.getNombre(), usuario.getApellido(), usuario.getMail(), usuario.getFechaNac());
        }

        usuarios.add(usuarioAgregar);

    }//End agregarUsuario

    public DtUsuario buscarUsuario(String nickname) {
        DtUsuario usuarioReturn = null;

        //Recorre la lista de usuarios del sistema en busqueda del mismo nickname
        for (Usuario s : usuarios) {
            if (s.getNickname().equals(nickname)) {
                
                if(s instanceof Profesor)
                {
                    usuarioReturn = new DtProfesor(s.getNickname(), s.getNombre(), s.getApellido(), s.getMail(), s.getFechaNac(), ((Profesor) s).getInstitucion(), ((Profesor) s).getDescripcion(), ((Profesor) s).getSitioWeb(), ((Profesor) s).getBiografia());
                }
                else if(s instanceof Socio)
                {
                    usuarioReturn = new DtSocio(s.getNickname(), s.getNombre(), s.getApellido(), s.getMail(), s.getFechaNac());
                }
            }
        }

        return usuarioReturn;
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

    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

}
