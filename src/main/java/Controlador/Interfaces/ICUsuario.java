package Controlador.Interfaces;


import Datatypes.*;
import Logica.Registro;
import Excepciones.EmailExistenteException;
import Excepciones.UsuarioExistenteException;
import Excepciones.UsuarioNoExisteException;

import java.util.List;

public interface ICUsuario {
    public void altaUsuario(DtUsuario usuario) throws UsuarioExistenteException,EmailExistenteException;
    public void modificarDatos(DtUsuario dtUsuario) throws UsuarioNoExisteException;
    public List<DtUsuario> retornarUsuarios();
    public List<DtSocio> getSocios();

    public void registroClase(DtUsuario socio, Registro registro);
    public List<DtProfesor> retornarProfesoresInstitucion(DtInstitucionDeportiva institucion);
    public void agregarClaseAProfesor(DtProfesor profesor, DtClase clase);
}
