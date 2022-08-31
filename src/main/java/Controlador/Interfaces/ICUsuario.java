package Controlador.Interfaces;

import Datatypes.DtRegistro;
import Datatypes.DtUsuario;
import java.util.List;

public interface ICUsuario {
    public void altaUsuario(DtUsuario usuario);
    public DtUsuario consultaUsuario(String usuarioEncontrar);
    public void modificarDatos();
    public List<DtUsuario> retornarUsuarios();

    public void registroClase(DtUsuario socio, DtRegistro registro);
}
