package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Ejercicios.CustomExceptions;

//Excepcion para cerrar el programa
public class ExitException extends Exception {
    public ExitException (String str) {
        // llamando al constructor de la Excepción padre
        super(str);
    }
}