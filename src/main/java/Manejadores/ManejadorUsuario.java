package Manejadores;

public class ManejadorUsuario {
    private static ManejadorUsuario instancia = null;

    private ManejadorUsuario() {
    }

    public static ManejadorUsuario getInstancia() {
        if (instancia == null) {
            instancia = new ManejadorUsuario();
        }
        return instancia;
    }



}
