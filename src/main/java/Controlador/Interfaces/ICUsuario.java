package Controlador.Interfaces;

import java.util.Date;

public interface ICUsuario {
    public void altaUsuario();
    public void consultaUsuario();
    public void modificarDatos(String nickname, String nombre, String apellido, Date fechaNac);

}
