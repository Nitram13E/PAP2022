package Publicadores;

import Configuraciones.WebServiceConfig;
import Controlador.Interfaces.Fabrica;
import Controlador.Interfaces.ICInstDeportiva;
import Datatypes.DtActividadDeportiva;
import Datatypes.DtInstitucionDeportiva;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.ws.Endpoint;

import java.util.List;

@WebService
@SOAPBinding(style= SOAPBinding.Style.RPC)
public class ControladorPublishInstitucionDeportiva {
    private final ICInstDeportiva icInstDeportiva;
    private WebServiceConfig config;
    private Endpoint endpoint;

    public ControladorPublishInstitucionDeportiva() {
        Fabrica fabrica = Fabrica.getInstancia();
        icInstDeportiva = fabrica.getICInstDeportiva();

        try {
            this.config = new WebServiceConfig();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @WebMethod(exclude = true)
    public void publicar() {
        String address = "http://" + config.getConfigOf("WS_IP") + ":" + config.getConfigOf("WS_PORT") + "/controladorInstitucionDeportiva";

        endpoint = Endpoint.publish(address, this);
        System.out.println(address);
    }

    @WebMethod(exclude = true)
    public Endpoint getEndpoint() {
        return endpoint;
    }

    @WebMethod
    public DtInstitucionDeportiva[] getInstitucionesDeportivas() {
        List<DtInstitucionDeportiva> dtInstitucionesDeportivas = icInstDeportiva.getInstituciones();

        return dtInstitucionesDeportivas.toArray(new DtInstitucionDeportiva[0]);
    }

    @WebMethod
    public DtActividadDeportiva[] getActividadesDeInstitucion(DtInstitucionDeportiva dtInstitucionDeportiva) {
        List<DtActividadDeportiva> dtActividadesDeportivas = icInstDeportiva.getActividadesDeInstitucion(dtInstitucionDeportiva.getNombre());

        return dtActividadesDeportivas.toArray(new DtActividadDeportiva[0]);
    }
}
