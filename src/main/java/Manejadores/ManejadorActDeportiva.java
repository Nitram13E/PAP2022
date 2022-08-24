package Manejadores;

public class ManejadorActDeportiva {
    private static ManejadorActDeportiva instancia = null;
    private ManejadorActDeportiva(){}

    public static ManejadorActDeportiva getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorActDeportiva();
        }
        return instancia;
    }


}
