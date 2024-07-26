package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Ejercicios.CustomExceptions;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
