package Controlador;

import Controlador.Interfaces.ICUsuario;
import Datatypes.DtProfesor;
import Datatypes.DtRegistro;
import Datatypes.DtSocio;
import Datatypes.DtUsuario;
import Logica.Profesor;
import Logica.Socio;
import Logica.Usuario;
import Manejadores.ManejadorClase;
import Manejadores.ManejadorUsuario;
import java.util.ArrayList;
import java.util.List;

public class CUsuario implements ICUsuario {

    @Override
    public void altaUsuario(DtUsuario usuario) {

        ManejadorUsuario mJUsuario = ManejadorUsuario.getInstancia();

        //Buscamos si el usuario ingresado ya existe
        boolean userBuscar = mJUsuario.existeUsuario(usuario.getNickname());
        
        if (userBuscar == false) {
            mJUsuario.agregarUsuario(usuario);
        }

    }

    @Override
    public DtUsuario consultaUsuario(String usuarioEncontrar) {

        ManejadorUsuario mJUsuario = ManejadorUsuario.getInstancia();

        DtUsuario userBuscar = mJUsuario.buscarUsuario(usuarioEncontrar);

        return userBuscar;
    }

    @Override
    public void modificarDatos() {

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

    @Override
    public void registroClase(DtUsuario socio, DtRegistro registro){
        ManejadorUsuario manejador = ManejadorUsuario.getInstancia();

        for(Usuario usuario : manejador.getUsuarios()){
            if(usuario instanceof Socio && usuario.getNickname().equals(socio.getNickname())) ((Socio) usuario).agregarRegistro(registro);
        }
    }
}
