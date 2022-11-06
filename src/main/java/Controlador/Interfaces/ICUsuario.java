package Controlador.Interfaces;


import Datatypes.*;
import Excepciones.EmailExistenteException;
import Excepciones.RegistroExistenteException;
import Excepciones.UsuarioExistenteException;
import Excepciones.UsuarioNoExisteException;
import Logica.Registro;

import java.util.List;

public interface ICUsuario {
    public void altaUsuario(DtUsuario usuario) throws UsuarioExistenteException,EmailExistenteException;
    public void modificarDatos(DtUsuario dtUsuario) throws UsuarioNoExisteException;
    public DtUsuario buscarUsuario(String nickname) throws UsuarioNoExisteException;
    public List<DtUsuario> retornarUsuarios();
    public List<DtSocio> getSocios();
    public void registroClase(DtUsuario socio, Registro registro) throws RegistroExistenteException;
    public List<DtProfesor> retornarProfesoresInstitucion(DtInstitucionDeportiva institucion);
    public void agregarClaseAProfesor(DtProfesor profesor, DtClase clase);
    public DtInstitucionDeportiva getInstitucionProfesor(DtProfesor dtProfesor);
    public List<DtClase> getClasesProfesor(List<DtClase> dtClases, DtProfesor dtProfesor);
    public List<String> getClasesSocio(DtSocio dtSocio);
}
