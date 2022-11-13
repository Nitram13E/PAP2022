package Publicadores;

import Configuraciones.WebServiceConfig;
import Controlador.Interfaces.Fabrica;
import Controlador.Interfaces.ICActDeportiva;
import Controlador.Interfaces.ICClase;
import Controlador.Interfaces.ICUsuario;
import Datatypes.DtActividadDeportiva;
import Datatypes.DtClase;
import Datatypes.DtProfesor;
import Datatypes.DtUsuario;
import Excepciones.ClaseExistenteException;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.ws.Endpoint;

import java.text.ParseException;
import java.time.Instant;
import java.util.Date;
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
    public void agregarClase(DtClase dtClase, DtProfesor dtProfesor, DtActividadDeportiva dtActividadDeportiva, String fechaHora) throws ClaseExistenteException, ParseException {
        dtClase.setFecha(fechaHora);
        dtClase.setHoraInicio(fechaHora.substring(11,19));
        dtClase.setFechaReg(new Date());

        icClase.altaClase(dtClase);
        icUsuario.agregarClaseAProfesor(dtProfesor, dtClase);
        icActDeportiva.agregarClaseAActividadDeportiva(dtClase, dtActividadDeportiva);

        System.out.println("Clase " + dtClase.getNombre() + "agregada a la actividad " + dtActividadDeportiva.getNombre() + "del profesor" + dtProfesor.getNickname());
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
