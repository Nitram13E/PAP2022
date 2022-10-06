package Publicadores;

import Configuraciones.WebServiceConfig;
import Controlador.Interfaces.Fabrica;
import Controlador.Interfaces.ICInstDeportiva;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.ws.Endpoint;

@WebService
@SOAPBinding(style= SOAPBinding.Style.RPC)
public class ControladorPublishInstitucionDeportiva {
    private Fabrica fabrica;

    private ICInstDeportiva icInstDeportiva;
    private WebServiceConfig config;
    private Endpoint endpoint;

    public ControladorPublishInstitucionDeportiva() {
        fabrica = Fabrica.getInstancia();
        ICInstDeportiva icInstDeportiva = fabrica.getICInstDeportiva();

        try {
            this.config = new WebServiceConfig();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @WebMethod(exclude = true)
    public void publicar() {
        endpoint = Endpoint.publish("https://" + config.getConfigOf("WS_IP") + ":" + config.getConfigOf("WS_PORT") + "/controladorInstitucionDeportiva", this);
        System.out.println("https://" + config.getConfigOf("WS_IP") + ":" + config.getConfigOf("WS_PORT") + "/controladorInstitucionDeportiva");
    }

    @WebMethod(exclude = true)
    public Endpoint getEndpoint() {
        return endpoint;
    }
}
