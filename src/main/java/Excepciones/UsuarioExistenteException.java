/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.io.Serial;

public class UsuarioExistenteException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public UsuarioExistenteException(String string) {
        super(string);
    }
}
