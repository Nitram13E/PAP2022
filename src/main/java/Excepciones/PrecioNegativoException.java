package Excepciones;

import java.io.Serial;

public class PrecioNegativoException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public PrecioNegativoException(String string){
        super(string);
    }
}
