package Publicadores;

import Configuraciones.WebServiceConfig;
import Controlador.Interfaces.Fabrica;
import Controlador.Interfaces.ICActDeportiva;
import Controlador.Interfaces.ICClase;
import Controlador.Interfaces.ICUsuario;
import Datatypes.DtActividadDeportiva;
import Datatypes.DtClase;
import Datatypes.DtProfesor;
import Excepciones.ClaseExistenteException;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.ws.Endpoint;

import java.util.List;

@WebService
@SOAPBinding(style= SOAPBinding.Style.RPC)
public class ControladorPublishClase {
    private final ICClase icClase;
    private final ICActDeportiva icActDeportiva;
    private final ICUsuario icUsuario;
    private WebServiceConfig config;
    private Endpoint endpoint;

    public ControladorPublishClase() {
        Fabrica fabrica = Fabrica.getInstancia();
        icClase = fabrica.getICClase();
        icActDeportiva = fabrica.getICActDeportiva();
        icUsuario = fabrica.getICUsuario();

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
    public void agregarClase(DtClase dtClase, DtProfesor dtProfesor, DtActividadDeportiva dtActividadDeportiva) throws ClaseExistenteException {
        icClase.altaClase(dtClase);
        icUsuario.agregarClaseAProfesor(dtProfesor, dtClase);
        icActDeportiva.agregarClaseAActividadDeportiva(dtClase, dtActividadDeportiva);
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
