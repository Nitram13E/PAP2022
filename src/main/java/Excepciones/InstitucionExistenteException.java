package Excepciones;

import java.io.Serial;

public class InstitucionExistenteException extends Exception{
    @Serial
    private static final long serialVersionUID = 1L;
    public InstitucionExistenteException(String string) {
        super(string);
    }
}
