package Excepciones;

import java.io.Serial;

public class ActividadExistenteException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;
    public ActividadExistenteException(String string){
        super(string);
    }
    
}
