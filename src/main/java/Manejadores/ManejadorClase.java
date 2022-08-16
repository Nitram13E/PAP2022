package Manejadores;

public class ManejadorClase {
    private static ManejadorClase instancia = null;
    private ManejadorClase(){}

    public static ManejadorClase getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorClase();
        }
        return instancia;
    }

}
