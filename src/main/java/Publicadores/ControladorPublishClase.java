package Publicadores;

import Configuraciones.WebServiceConfig;
import Controlador.Interfaces.Fabrica;
import Controlador.Interfaces.ICClase;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.ws.Endpoint;

@WebService
@SOAPBinding(style= SOAPBinding.Style.RPC)
public class ControladorPublishClase {
    private Fabrica fabrica;
    private ICClase icClase;
    private WebServiceConfig config;
    private Endpoint endpoint;

    public ControladorPublishClase() {
        fabrica = Fabrica.getInstancia();
        ICClase icClase = fabrica.getICClase();

        try {
            this.config = new WebServiceConfig();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @WebMethod(exclude = true)
    public void publicar() {
        endpoint = Endpoint.publish("https://" + config.getConfigOf("WS_IP") + ":" + config.getConfigOf("WS_PORT") + "/controladorClase", this);
        System.out.println("https://" + config.getConfigOf("WS_IP") + ":" + config.getConfigOf("WS_PORT") + "/controladorClase");
    }

    @WebMethod(exclude = true)
    public Endpoint getEndpoint() {
        return endpoint;
    }
}
