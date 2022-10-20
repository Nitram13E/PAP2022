package Publicadores;

import Configuraciones.WebServiceConfig;
import Controlador.Interfaces.Fabrica;
import Controlador.Interfaces.ICClase;
import Datatypes.DtClase;
import Excepciones.ClaseExistenteException;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.ws.Endpoint;

import java.util.List;

@WebService
@SOAPBinding(style= SOAPBinding.Style.RPC)
public class ControladorPublishClase {
    private Fabrica fabrica;
    private final ICClase icClase;
    private WebServiceConfig config;
    private Endpoint endpoint;

    public ControladorPublishClase() {
        fabrica = Fabrica.getInstancia();
        icClase = fabrica.getICClase();

        try {
            this.config = new WebServiceConfig();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @WebMethod(exclude = true)
    public void publicar() {
        String address = "http://" + config.getConfigOf("WS_IP") + ":" + config.getConfigOf("WS_PORT") + "/controladorClase";

        endpoint = Endpoint.publish(address, this);
        System.out.println(address);
    }

    @WebMethod(exclude = true)
    public Endpoint getEndpoint() {
        return endpoint;
    }

    @WebMethod
    public void agregarClase(DtClase dtClase) throws ClaseExistenteException {
        icClase.altaClase(dtClase);
    }

    @WebMethod
    public DtClase buscarClase(String nombre) {
        return icClase.retornarClase(nombre);
    }

    @WebMethod
    public DtClase[] getClasesRanking() {
        List<DtClase> clases = icClase.getClasesRanking();

        return clases.toArray(new DtClase[0]);
    }
}
