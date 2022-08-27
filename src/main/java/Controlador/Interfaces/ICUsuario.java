package Controlador.Interfaces;

import Datatypes.DtUsuario;
import Excepciones.EmailExistenteException;
import Excepciones.UsuarioExistenteException;
import java.util.List;

public interface ICUsuario {
    public void altaUsuario(DtUsuario usuario) throws UsuarioExistenteException,EmailExistenteException;
    public void consultaUsuario();
    public void modificarDatos();
    public List<DtUsuario> retornarUsuarios();
}
