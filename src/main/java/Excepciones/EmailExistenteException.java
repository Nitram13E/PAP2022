package Excepciones;

import java.io.Serial;

public class EmailExistenteException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public EmailExistenteException(String string) {
        super(string);
    }
}
