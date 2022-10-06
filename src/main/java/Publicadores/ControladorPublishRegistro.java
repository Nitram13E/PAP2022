package Publicadores;

import Configuraciones.WebServiceConfig;
import Controlador.Interfaces.Fabrica;
import Controlador.Interfaces.ICRegistro;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.ws.Endpoint;

@WebService
@SOAPBinding(style= SOAPBinding.Style.RPC)
public class ControladorPublishRegistro {
    private Fabrica fabrica;
    private ICRegistro icRegistro;
    private WebServiceConfig config;
    private Endpoint endpoint;

    public ControladorPublishRegistro() {
        fabrica = Fabrica.getInstancia();
        ICRegistro icRegistro = fabrica.getICRegistro();

        try {
            this.config = new WebServiceConfig();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @WebMethod(exclude = true)
    public void publicar() {
        endpoint = Endpoint.publish("https://" + config.getConfigOf("WS_IP") + ":" + config.getConfigOf("WS_PORT") + "/controladorRegistro", this);
        System.out.println("https://" + config.getConfigOf("WS_IP") + ":" + config.getConfigOf("WS_PORT") + "/controladorRegistro");
    }

    @WebMethod(exclude = true)
    public Endpoint getEndpoint() {
        return endpoint;
    }
}
