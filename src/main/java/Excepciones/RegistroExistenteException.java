package Excepciones;


import java.io.Serial;

public class RegistroExistenteException extends Exception{
    @Serial
    private static final long serialVersionUID = 1L;
    public RegistroExistenteException(String string) {
        super(string);
    }
}
