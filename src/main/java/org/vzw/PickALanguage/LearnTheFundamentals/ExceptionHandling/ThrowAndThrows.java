package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling;

/**
 * <title>Diferencia entre final, finally y finalize</title>
 * Doc: https://www.notion.so/Java-Exception-Handling-cc033cd9e6bb4a5688f3ff79f4d0910b?pvs=4
 */
public class ThrowAndThrows {
    public static void main(String args[]) {
        try {
            method();
        }
        catch(ArithmeticException e) {
            System.out.println("caught in main() method");
        }
    }


    // Definir un método definido por el usuario que lanza una ArithmeticException
    static void method() throws ArithmeticException {
        System.out.println("Inside the method()");
        throw new ArithmeticException("throwing ArithmeticException");
    }
}
