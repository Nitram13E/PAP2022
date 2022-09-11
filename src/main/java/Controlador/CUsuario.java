package Controlador;

import Controlador.Interfaces.ICUsuario;
import Datatypes.*;
import Excepciones.RegistroExistenteException;
import Logica.*;
import Excepciones.EmailExistenteException;
import Excepciones.UsuarioExistenteException;
import Excepciones.UsuarioNoExisteException;
import Manejadores.ManejadorClase;
import Manejadores.ManejadorInstDeportiva;
import Manejadores.ManejadorUsuario;
import Presentacion.Actividad;

import java.util.ArrayList;
import java.util.List;


public class CUsuario implements ICUsuario {

    @Override
    public void altaUsuario(DtUsuario usuario) throws UsuarioExistenteException, EmailExistenteException {
        ManejadorUsuario mJUsuario = ManejadorUsuario.getInstancia();
        ManejadorInstDeportiva manejadorInstDeportiva = ManejadorInstDeportiva.getInstancia();

        //Buscamos si el usuario ingresado ya existe
        boolean userBuscar = mJUsuario.existeUsuario(usuario.getNickname());
        
        if(userBuscar) throw new UsuarioExistenteException("Ya hay un usuario con el mismo nickname!.");
        
        boolean emailBuscar = mJUsuario.existeMail(usuario.getMail());
        
        if(emailBuscar) throw new EmailExistenteException("Ya hay un usuario con el mismo mail!.");

        if (usuario instanceof DtProfesor) {
            InstitucionDeportiva  institucionDeportiva = manejadorInstDeportiva.buscarInstitucion(((DtProfesor) usuario).getInstitucion().getNombre());
            mJUsuario.agregarUsuario(new Profesor(usuario.getNickname(), usuario.getNombre(), usuario.getApellido(), usuario.getMail(), usuario.getFechaNac(), ((DtProfesor) usuario).getDescripcion(), ((DtProfesor) usuario).getSitioWeb(), ((DtProfesor) usuario).getBiografia(), institucionDeportiva));
        } else if (usuario instanceof DtSocio) {
            mJUsuario.agregarUsuario(new Socio(usuario.getNickname(), usuario.getNombre(), usuario.getApellido(), usuario.getMail(), usuario.getFechaNac()));
        }
    }

    @Override
    public void modificarDatos(DtUsuario dtUsuario) throws UsuarioNoExisteException {
        //Nickname y email son unicos, no se pueden modificar
        ManejadorUsuario mU = ManejadorUsuario.getInstancia();
        Usuario usuario = mU.buscarUsuario(dtUsuario.getNickname());

        if(usuario == null) {
            throw new UsuarioNoExisteException("No existe usuario con este nickname");
        }

        usuario.setNombre(dtUsuario.getNombre());
        usuario.setApellido(dtUsuario.getApellido());
        usuario.setFechaNac(dtUsuario.getFechaNac());

        mU.modificarUsuario(usuario);
    }
    
    @Override
    public List<DtUsuario> retornarUsuarios()
    {
        ManejadorUsuario mJUsuario = ManejadorUsuario.getInstancia();
        
        List<Usuario> listaUsuarios = mJUsuario.getUsuarios();
        List<DtUsuario> listaDts = new ArrayList<>();
        
        for(Usuario s : listaUsuarios)
        {
            if(s instanceof Profesor)
            {
                InstitucionDeportiva institucion = ((Profesor) s).getInstitucion();
                DtInstitucionDeportiva dtInstitucion = new DtInstitucionDeportiva(institucion.getNombre(), institucion.getDesc(), institucion.getUrl());

                listaDts.add(new DtProfesor(s.getNickname(), s.getNombre(), s.getApellido(), s.getMail(), s.getFechaNac(), dtInstitucion, ((Profesor) s).getDescripcion(), ((Profesor) s).getSitioWeb(), ((Profesor) s).getBiografia()));
            }
            else if (s instanceof Socio)
            {
                listaDts.add(new DtSocio(s.getNickname(), s.getNombre(), s.getApellido(), s.getMail(), s.getFechaNac()));
            }
            
        }
        
        return listaDts;
    }

    public List<DtSocio> getSocios(){
        ManejadorUsuario manejadorUsuario = ManejadorUsuario.getInstancia();

        List<DtSocio> socios = new ArrayList<>();

        for(Usuario usuario : manejadorUsuario.getUsuarios())
        {
            if(usuario instanceof Socio) socios.add(new DtSocio(usuario.getNickname(), usuario.getNombre(), usuario.getApellido(), usuario.getMail(), usuario.getFechaNac()));
        }

        return socios;
    }

    @Override
    public void registroClase(DtUsuario dtSocio, Registro registro) throws RegistroExistenteException {
        ManejadorUsuario manejador = ManejadorUsuario.getInstancia();
        Socio socio = (Socio) manejador.buscarUsuario(dtSocio.getNickname());

        for(Registro reg : socio.getRegistros())
        {
            if (reg.getClase().equals(registro.getClase())) throw new RegistroExistenteException("Socio ya registado.");
        }

        manejador.agregarRegistroSocio(socio, registro);
    }

    @Override
    public List<DtProfesor> retornarProfesoresInstitucion(DtInstitucionDeportiva institucion)
    {
       ManejadorUsuario mJUsuario = ManejadorUsuario.getInstancia();
       List<Usuario> listaUsuarios = mJUsuario.getUsuarios();
       List<DtProfesor> resultado = new ArrayList<>();
       
       for(Usuario s:listaUsuarios)
       {
           if(s instanceof Profesor)
           {
               if(((Profesor) s).getInstitucion().getNombre().equals(institucion.getNombre()))
               {
                   resultado.add(new DtProfesor(s.getNickname(), s.getNombre(), s.getApellido(), s.getMail(), s.getFechaNac(), institucion, ((Profesor) s).getDescripcion(), ((Profesor) s).getSitioWeb(), ((Profesor) s).getBiografia()));
               }
           }
       }
       
       return resultado;
    }
    
    @Override
    public void agregarClaseAProfesor(DtProfesor dtProfesor, DtClase clase)
    {
        ManejadorUsuario mJUsuario = ManejadorUsuario.getInstancia();
        ManejadorClase manejadorClase = ManejadorClase.getInstancia();
        Profesor profesor = (Profesor) mJUsuario.buscarUsuario(dtProfesor.getNickname());

        mJUsuario.agregarClaseProfesor((Profesor) profesor, manejadorClase.buscarClase(clase.getNombre()));
    }

    @Override
    public DtInstitucionDeportiva getInstitucionProfesor(DtProfesor dtProfesor) {
        ManejadorUsuario manejadorUsuario = ManejadorUsuario.getInstancia();

        Profesor profesor = (Profesor) manejadorUsuario.buscarUsuario(dtProfesor.getNickname());

        InstitucionDeportiva institucionDeportiva = profesor.getInstitucion();

        return new DtInstitucionDeportiva(institucionDeportiva.getNombre(), institucionDeportiva.getDesc(), institucionDeportiva.getUrl());
    }

    @Override
    public List<DtClase> getClasesProfesor(List<DtClase> dtClases, DtProfesor dtProfesor) {
        ManejadorUsuario manejadorUsuario = ManejadorUsuario.getInstancia();

        Profesor profesor = (Profesor) manejadorUsuario.buscarUsuario(dtProfesor.getNickname());
        List<DtClase> clases = new ArrayList<>();

        for(DtClase dtClase : dtClases) {
            for(Clase clase : profesor.getClases()){
                if(dtClase.getNombre().equals(clase.getNombre())) clases.add(dtClase);
            }
        }

        return clases;
    }

    @Override
    public List<String> getClasesSocio(DtSocio dtSocio) {
        ManejadorUsuario manejadorUsuario = ManejadorUsuario.getInstancia();

        Socio socio = (Socio) manejadorUsuario.buscarUsuario(dtSocio.getNickname());
        List<String> clases = new ArrayList<>();

        socio.getRegistros().forEach(registro -> clases.add(registro.getClase()));

        return clases;
    }
}
