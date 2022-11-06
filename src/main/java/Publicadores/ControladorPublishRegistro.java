package Publicadores;

import Configuraciones.WebServiceConfig;
import Controlador.Interfaces.Fabrica;
import Controlador.Interfaces.ICClase;
import Controlador.Interfaces.ICRegistro;
import Controlador.Interfaces.ICUsuario;
import Datatypes.DtClase;
import Datatypes.DtSocio;
import Excepciones.RegistroExistenteException;
import Excepciones.UsuarioNoExisteException;
import Logica.Registro;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.ws.Endpoint;

import java.util.ArrayList;
import java.util.List;

@WebService
@SOAPBinding(style= SOAPBinding.Style.RPC)
public class ControladorPublishRegistro {
    private final ICRegistro icRegistro;
    private final ICClase icClase;
    private final ICUsuario icUsuario;
    private WebServiceConfig config;
    private Endpoint endpoint;

    public ControladorPublishRegistro() {
        Fabrica fabrica = Fabrica.getInstancia();

        icRegistro = fabrica.getICRegistro();
        icClase = fabrica.getICClase();
        icUsuario = fabrica.getICUsuario();

        try {
            this.config = new WebServiceConfig();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @WebMethod(exclude = true)
    public void publicar() {
        String address = "http://" + config.getConfigOf("WS_IP") + ":" + config.getConfigOf("WS_PORT") + "/controladorRegistro";

        endpoint = Endpoint.publish(address, this);
        System.out.println(address);
    }

    @WebMethod(exclude = true)
    public Endpoint getEndpoint() {
        return endpoint;
    }

    @WebMethod
    public void registrarSocioClase(DtClase dtClase, DtSocio dtSocio) throws RegistroExistenteException {
        Registro registro = new Registro(dtClase.getNombre(), dtSocio.getNombre());

        icClase.registroSocio(dtClase, registro);
        icUsuario.registroClase(dtSocio, registro);
        icRegistro.altaRegistro(registro);
    }

    @WebMethod
    public Registro[] obtenerRegistros() {
        List<Registro> registros = icRegistro.obtenerRegistros();

        return registros.toArray(new Registro[0]);
    }

    @WebMethod
    public Registro[] obtenerRegistrosSocio(DtSocio dtSocio) {
        List<Registro> registros = icRegistro.obtenerRegistrosSocio(dtSocio);

        return registros.toArray(new Registro[0]);
    }

    @WebMethod
    public DtClase[] obtenerClasesSocio(DtSocio dtSocio) {
        List<Registro> registros = icRegistro.obtenerRegistrosSocio(dtSocio);

        List<DtClase> clases = new ArrayList<>();
        registros.forEach(registro -> clases.add(icClase.consultaDictado(registro.getClase())));

        return clases.toArray(new DtClase[0]);
    }

    @WebMethod
    public Registro[] getRegistrosClase(DtClase dtClase) {
        List<Registro> registros = icRegistro.obtenerRegistrosClase(dtClase);

        return registros.toArray(new Registro[0]);
    }

    @WebMethod
    public DtSocio[] obtenerSociosClase(DtClase dtClase) {
        List<Registro> registros = icRegistro.obtenerRegistrosClase(dtClase);
        List<DtSocio> socios = new ArrayList<>();

        for(Registro registro : registros) {
            try {
                socios.add((DtSocio) icUsuario.buscarUsuario(registro.getSocio()));
            } catch (UsuarioNoExisteException e) {
                throw new RuntimeException(e);
            }
        };

        return socios.toArray(new DtSocio[0]);
    }
}
