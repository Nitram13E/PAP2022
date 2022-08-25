package Controlador;

import Controlador.Interfaces.ICUsuario;
import Datatypes.DtProfesor;
import Datatypes.DtSocio;
import Datatypes.DtUsuario;
import Logica.Usuario;
import Manejadores.ManejadorUsuario;

public class CUsuario implements ICUsuario {

    @Override
    public void altaUsuario(DtUsuario usuario) {

        ManejadorUsuario mJUsuario = ManejadorUsuario.getInstancia();

        //Buscamos si el usuario ingresado ya existe
        Usuario userBuscar = mJUsuario.buscarUsuario(usuario.getNickname());

        if(userBuscar == null)
        {
            mJUsuario.agregarUsuario(usuario);
        }
        
    }

    @Override
    public void consultaUsuario() {

    }

    @Override
    public void modificarDatos() {

    }
}
