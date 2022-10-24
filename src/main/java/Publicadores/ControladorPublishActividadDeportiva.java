package Publicadores;

import Configuraciones.WebServiceConfig;
import Controlador.Interfaces.Fabrica;
import Controlador.Interfaces.ICActDeportiva;
import Datatypes.DtActividadDeportiva;
import Datatypes.DtClase;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.ws.Endpoint;

import java.util.List;

@WebService
@SOAPBinding(style= SOAPBinding.Style.RPC)
public class ControladorPublishActividadDeportiva {
    private final ICActDeportiva icActDeportiva;
    private WebServiceConfig config;
    private Endpoint endpoint;

    public ControladorPublishActividadDeportiva() {
        Fabrica fabrica = Fabrica.getInstancia();
        icActDeportiva = fabrica.getICActDeportiva();

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
    public DtActividadDeportiva[] getActividadesDeportivas() {
        List<DtActividadDeportiva> dtActividadesDeportivas = icActDeportiva.getActividades();

        return dtActividadesDeportivas.toArray(new DtActividadDeportiva[0]);
    }

    @WebMethod
    public DtClase[] getClases(DtActividadDeportiva dtActividadDeportiva) {
        List<DtClase> dtClases = icActDeportiva.getClases(dtActividadDeportiva);

        return dtClases.toArray(new DtClase[0]);
    }
}
