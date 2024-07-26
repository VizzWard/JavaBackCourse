package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras;

// clase que representa la excepción personalizada
class MyCustomException extends Exception {

}

// clase que utiliza la excepción personalizada MyCustomException
public class TestCustomException2 {
    // main method
    public static void main() {
        try {
            // lanzar un objeto de excepción definido por el usuario
            throw new MyCustomException();
        }
        catch (MyCustomException ex) {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }

        System.out.println("rest of the code...");
    }
}
