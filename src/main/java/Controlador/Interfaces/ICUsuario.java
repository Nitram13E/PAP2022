package Controlador.Interfaces;


import Datatypes.DtRegistro;
import Datatypes.DtClase;
import Datatypes.DtInstitucionDeportiva;
import Datatypes.DtProfesor;
import Datatypes.DtUsuario;
import Excepciones.EmailExistenteException;
import Excepciones.UsuarioExistenteException;
import Excepciones.UsuarioNoExisteException;

import java.util.List;

public interface ICUsuario {
    public void altaUsuario(DtUsuario usuario) throws UsuarioExistenteException,EmailExistenteException;
    public void modificarDatos(DtUsuario dtUsuario) throws UsuarioNoExisteException;
    public List<DtUsuario> retornarUsuarios();


    public void registroClase(DtUsuario socio, DtRegistro registro);
    public List<DtProfesor> retornarProfesoresInstitucion(DtInstitucionDeportiva institucion);
    public void agregarClaseAProfesor(DtProfesor profesor, DtClase clase);

}
