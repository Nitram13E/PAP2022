package Publicadores;

import Configuraciones.WebServiceConfig;
import Controlador.Interfaces.*;
import Datatypes.DtUsuario;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.ws.Endpoint;

import java.util.List;

@WebService
@SOAPBinding(style= SOAPBinding.Style.RPC)
public class ControladorPublishUsuario {
    private Fabrica fabrica;
    private ICUsuario icUsuario;
    private WebServiceConfig config;
    private Endpoint endpoint;

    public ControladorPublishUsuario() {
        fabrica = Fabrica.getInstancia();
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
    public DtUsuario[] retornarUsuarios() {
        List<DtUsuario> dtUsuarios = icUsuario.retornarUsuarios();

        return dtUsuarios.toArray(new DtUsuario[0]);
    }

    @WebMethod
    public String returnString() {
        return "test";
    }
}
