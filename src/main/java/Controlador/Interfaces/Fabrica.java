package Controlador.Interfaces;

import Controlador.*;

public class Fabrica {

    private static Fabrica instancia = null;
    private Fabrica() {
    }

    public static Fabrica getInstancia() {
        if (instancia == null) {
            instancia = new Fabrica();
        }
        return instancia;
    }

    public ICActDeportiva getICActDeportiva(){
        return new CActDeportiva();
    }

    public ICClase getICClase(){
        return new CClase();
    }

    public ICInstDeportiva getICInstDeportiva(){
        return new CInstDeportiva();
    }

    public ICUsuario getICUsuario(){
        return new CUsuario();
    }

    public ICRegistro getICRegistro() {
        return new CRegistro();
    }
}
