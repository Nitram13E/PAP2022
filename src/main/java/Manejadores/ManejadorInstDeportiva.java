package Manejadores;

public class ManejadorInstDeportiva {
    private static ManejadorInstDeportiva instancia = null;
    private ManejadorInstDeportiva(){}

    public static ManejadorInstDeportiva getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorInstDeportiva();
        }
        return instancia;
    }



}
