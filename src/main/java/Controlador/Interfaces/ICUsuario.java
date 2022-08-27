package Controlador.Interfaces;

import Datatypes.DtUsuario;
import Excepciones.UsuarioNoExisteException;

import java.util.List;

public interface ICUsuario {
    public void altaUsuario(DtUsuario usuario);
    public DtUsuario consultaUsuario(String usuarioEncontrar);
    public void modificarDatos(DtUsuario dtUsuario) throws UsuarioNoExisteException;
    public List<DtUsuario> retornarUsuarios();

}
