package Controlador.Interfaces;

import Datatypes.DtUsuario;
import Excepciones.EmailExistenteException;
import Excepciones.UsuarioExistenteException;
import Excepciones.UsuarioNoExisteException;

import java.util.List;

public interface ICUsuario {
    public void altaUsuario(DtUsuario usuario) throws UsuarioExistenteException,EmailExistenteException;
    public void modificarDatos(DtUsuario dtUsuario) throws UsuarioNoExisteException;
    public List<DtUsuario> retornarUsuarios();
}
