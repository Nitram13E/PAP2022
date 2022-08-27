package Controlador.Interfaces;

import Datatypes.DtUsuario;
import java.util.List;

public interface ICUsuario {
    public void altaUsuario(DtUsuario usuario);
    public DtUsuario consultaUsuario(String usuarioEncontrar);
    public void modificarDatos();
    public List<DtUsuario> retornarUsuarios();

}
