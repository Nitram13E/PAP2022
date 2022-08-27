package Controlador.Interfaces;

import Datatypes.DtUsuario;

public interface ICUsuario {
    public void altaUsuario(DtUsuario usuario);
    public DtUsuario consultaUsuario(String usuarioEncontrar);
    public void modificarDatos();

}
