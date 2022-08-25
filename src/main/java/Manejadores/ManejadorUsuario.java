package Manejadores;

import Datatypes.DtProfesor;
import Datatypes.DtSocio;
import Datatypes.DtUsuario;
import Logica.Profesor;
import Logica.Usuario;
import java.util.ArrayList;
import java.util.List;

public class ManejadorUsuario {

    private static ManejadorUsuario instancia = null;
    //Lista de todos los usuarios en el sistema
    private List<Usuario> usuarios = new ArrayList<>();

    private ManejadorUsuario() {
    }

    public static ManejadorUsuario getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorUsuario();
        }
        return instancia;
    }

    public void agregarUsuario(DtUsuario usuario) 
    {
        if(usuario instanceof DtProfesor)
        {
            
  
        }
        
        if(usuario instanceof DtSocio)
        {
        
        }
        
    }//End agregarUsuario

    public Usuario buscarUsuario(String nickname) 
    {
        Usuario usuario = null;
        
        //Recorre la lista de usuarios del sistema en busqueda del mismo nickname
        for (Usuario s : usuarios) 
        {
            if(s.getNickname() == nickname)
            {
                usuario = s;
            }
        }
        
        return usuario;
    }//End buscarUsuario

}
