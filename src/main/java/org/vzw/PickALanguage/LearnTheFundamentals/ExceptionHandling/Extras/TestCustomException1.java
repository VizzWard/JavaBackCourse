package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras;

// clase que representa la excepción personalizada
class InvalidAgeException  extends Exception {
    public InvalidAgeException (String str) {
        // llamando al constructor de la Excepción padre
        super(str);
    }
}

// clase que utiliza la excepción personalizada InvalidAgeException
public class TestCustomException1 {
    // method para comprobar la edad
    static void validate (int age) throws InvalidAgeException{
        if(age < 18){

            // lanzar un objeto de excepción definido por el usuario
            throw new InvalidAgeException("age is not valid to vote");
        }
        else {
            System.out.println("welcome to vote");
        }
    }

    // main method
    public static void main() {
        try {
            // llamando al método
            validate(13);
        }
        catch (InvalidAgeException ex) {
            System.out.println("Caught the exception");

            // imprimir el mensaje del objeto InvalidAgeException
            System.out.println("Exception occured: " + ex);
        }

        System.out.println("rest of the code...");
    }
}
