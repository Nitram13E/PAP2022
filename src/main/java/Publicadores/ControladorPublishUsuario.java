package Publicadores;

import Configuraciones.WebServiceConfig;
import Controlador.Interfaces.*;
import Datatypes.DtClase;
import Datatypes.DtProfesor;
import Datatypes.DtUsuario;
import Excepciones.UsuarioNoExisteException;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.ws.Endpoint;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@WebService
@SOAPBinding(style= SOAPBinding.Style.RPC)
public class ControladorPublishUsuario {
    private final ICUsuario icUsuario;
    private WebServiceConfig config;
    private Endpoint endpoint;

    public ControladorPublishUsuario() {
        Fabrica fabrica = Fabrica.getInstancia();
        icUsuario = fabrica.getICUsuario();

        try {
            this.config = new WebServiceConfig();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @WebMethod(exclude = true)
    public void publicar() {
        String address = "http://" + config.getConfigOf("WS_IP") + ":" + config.getConfigOf("WS_PORT") + "/controladorUsuario";

        endpoint = Endpoint.publish(address, this);
        System.out.println(address);
    }

    @WebMethod(exclude = true)
    public Endpoint getEndpoint() {
        return endpoint;
    }

    @WebMethod
    public DtUsuario loginUsuario(String email, String password) throws UsuarioNoExisteException {
        Optional<DtUsuario> usuario = icUsuario.retornarUsuarios().stream().filter(dtUsuario -> dtUsuario.getMail().equals(email) && dtUsuario.getContrasenia().equals(password)).findFirst();

        if(usuario.isPresent()) {
            return usuario.get();
        }
        else {
            throw new UsuarioNoExisteException("Credenciales incorrectas.");
        }
    }

    @WebMethod
    public DtUsuario[] getUsuarios() {
        List<DtUsuario> dtUsuarios = icUsuario.retornarUsuarios();

        return dtUsuarios.toArray(new DtUsuario[0]);
    }

    @WebMethod
    public void modificarUsuario(DtUsuario dtUsuario) throws UsuarioNoExisteException {
        icUsuario.modificarDatos(dtUsuario);
    }

    @WebMethod
    public DtClase[] getClasesProfesor(DtClase[] dtClases, DtProfesor dtProfesor) {
        List<DtClase> clases = icUsuario.getClasesProfesor(Arrays.stream(dtClases).toList(), dtProfesor);

        return clases.toArray(new DtClase[0]);
    }
}
