package Controlador.Interfaces;

import Datatypes.DtUsuario;

import java.util.Date;

public interface ICUsuario {
    public void altaUsuario();
    public void consultaUsuario();
    public void modificarDatos(DtUsuario dtUsuario);

}
