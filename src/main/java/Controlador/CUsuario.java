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
}
