/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.io.Serial;

/**
 *
 * @author Shifter
 */
public class EmailExistenteException extends Exception {
     @Serial
    private static final long serialVersionUID = 1L;

    public EmailExistenteException(String string) {
        super(string);
    }
}
