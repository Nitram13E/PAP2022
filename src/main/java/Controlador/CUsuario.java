package Controlador;

import Controlador.Interfaces.ICUsuario;
import Datatypes.DtUsuario;
import Logica.Usuario;
import Manejadores.ManejadorUsuario;

import java.util.Date;

public class CUsuario implements ICUsuario {
    @Override
    public void altaUsuario() {

    }

    @Override
    public void consultaUsuario() {

    }

    @Override
    public void modificarDatos(DtUsuario dtUsuario) {
        //Nickname y email son unicos, no se pueden modificar
        ManejadorUsuario mU = ManejadorUsuario.getInstancia();
        Usuario usuario = mU.buscarUsuario(dtUsuario.getNickname());

        usuario.setNombre(dtUsuario.getNombre());
        usuario.setApellido(dtUsuario.getApellido());
        usuario.setFechaNac(dtUsuario.getFechaNac());

        mU.modificarUsuario(usuario);
    }
}
