package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras;

// La clase representa una excepción definida por el usuario
public class UserDefinedException extends Exception
{
    public UserDefinedException(String str)
    {
        // Llamada al constructor padre (Excepción)
        super(str);
    }
}
