package Controlador;

import Controlador.Interfaces.ICUsuario;
import Datatypes.DtProfesor;
import Datatypes.DtSocio;
import Datatypes.DtUsuario;
import Excepciones.EmailExistenteException;
import Excepciones.UsuarioExistenteException;
import Excepciones.UsuarioNoExisteException;
import Logica.Profesor;
import Logica.Socio;
import Logica.Usuario;
import Manejadores.ManejadorUsuario;

import java.util.ArrayList;
import java.util.List;


public class CUsuario implements ICUsuario {

    @Override
    public void altaUsuario(DtUsuario usuario) throws UsuarioExistenteException, EmailExistenteException {

        ManejadorUsuario mJUsuario = ManejadorUsuario.getInstancia();

        //Buscamos si el usuario ingresado ya existe
        boolean userBuscar = mJUsuario.existeUsuario(usuario.getNickname());
        
        if(userBuscar) throw new UsuarioExistenteException("Ya hay un usuario con el mismo nickname!.");
        
        boolean emailBuscar = mJUsuario.existeMail(usuario.getMail());
        
        if(emailBuscar) throw new EmailExistenteException("Ya hay un usuario con el mismo mail!.");
        
        mJUsuario.agregarUsuario(usuario);
    }

    @Override
    public void modificarDatos(DtUsuario dtUsuario) throws UsuarioNoExisteException {
        //Nickname y email son unicos, no se pueden modificar
        ManejadorUsuario mU = ManejadorUsuario.getInstancia();
        Usuario usuario = mU.buscarUsuario(dtUsuario.getNickname());

        if(usuario == null) {
            throw new UsuarioNoExisteException("No existe usuario con este nickname");
        }

        usuario.setNombre(dtUsuario.getNombre());
        usuario.setApellido(dtUsuario.getApellido());
        usuario.setFechaNac(dtUsuario.getFechaNac());

        mU.modificarUsuario(usuario);
    }
    
    @Override
    public List<DtUsuario> retornarUsuarios()
    {
        ManejadorUsuario mJUsuario = ManejadorUsuario.getInstancia();
        
        List<Usuario> listaUsuarios = mJUsuario.getUsuarios();
        List<DtUsuario> listaDts = new ArrayList<>();
        
        for(Usuario s : listaUsuarios)
        {
            
            if(s instanceof Profesor)
            {
                listaDts.add(new DtProfesor(s.getNickname(), s.getNombre(), s.getApellido(), s.getMail(), s.getFechaNac(), ((Profesor) s).getInstitucion(), ((Profesor) s).getDescripcion(), ((Profesor) s).getSitioWeb(), ((Profesor) s).getBiografia()));
            }
            else if (s instanceof Socio)
            {
                listaDts.add(new DtSocio(s.getNickname(), s.getNombre(), s.getApellido(), s.getMail(), s.getFechaNac()));
            }
            
        }
        
        return listaDts;
    }
}
