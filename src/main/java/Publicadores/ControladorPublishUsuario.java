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
    private ICActDeportiva icActDeportiva;
    private ICClase icClase;
    private ICInstDeportiva icInstDeportiva;
    private ICRegistro icRegistro;
    private ICUsuario icUsuario;
    private WebServiceConfig config;
    private Endpoint endpoint;

    public ControladorPublishUsuario() {
        fabrica = Fabrica.getInstancia();

        ICActDeportiva icActDeportiva = fabrica.getICActDeportiva();
        ICClase icClase = fabrica.getICClase();
        ICInstDeportiva icInstDeportiva = fabrica.getICInstDeportiva();
        ICRegistro icRegistro = fabrica.getICRegistro();
        ICUsuario icUsuario = fabrica.getICUsuario();

        try {
            this.config = new WebServiceConfig();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @WebMethod(exclude = true)
    public void publicar() {
        endpoint = Endpoint.publish("https://" + config.getConfigOf("WS_IP") + ":" + config.getConfigOf("WS_PORT") + "/controladorUsuario", this);
        System.out.println("https://" + config.getConfigOf("WS_IP") + ":" + config.getConfigOf("WS_PORT") + "/controladorUsuario");
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
}
