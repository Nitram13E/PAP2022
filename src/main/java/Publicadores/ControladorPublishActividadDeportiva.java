package Publicadores;

import Configuraciones.WebServiceConfig;
import Controlador.Interfaces.Fabrica;
import Controlador.Interfaces.ICActDeportiva;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.ws.Endpoint;

@WebService
@SOAPBinding(style= SOAPBinding.Style.RPC)
public class ControladorPublishActividadDeportiva {
    private Fabrica fabrica;
    private ICActDeportiva icActDeportiva;
    private WebServiceConfig config;
    private Endpoint endpoint;

    public ControladorPublishActividadDeportiva() {
        fabrica = Fabrica.getInstancia();

        ICActDeportiva icActDeportiva = fabrica.getICActDeportiva();
        try {
            this.config = new WebServiceConfig();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @WebMethod(exclude = true)
    public void publicar() {
        String address = "http://" + config.getConfigOf("WS_IP") + ":" + config.getConfigOf("WS_PORT") + "/controladorActividadDeportiva";

        endpoint = Endpoint.publish(address, this);
        System.out.println(address);
    }

    @WebMethod(exclude = true)
    public Endpoint getEndpoint() {
        return endpoint;
    }

    @WebMethod
    public String returnString() {
        return "test";
    }
}
