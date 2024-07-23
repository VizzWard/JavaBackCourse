package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling;

/**
 * <title>Java throw Exception</title>
 * Doc: https://www.notion.so/Java-Exception-Handling-cc033cd9e6bb4a5688f3ff79f4d0910b?pvs=4
 */
public class ThrowKeyword {
    public static void main(String[] args) {
        /**
         * <h2>Ejemplo 1: Lanzar una excepción no verificada</h2>
         * Hemos creado un método llamado validate() que acepta un entero como parámetro.
         * Si la edad es menor de 18 años, lanzamos la ArithmeticException de lo contrario
         * imprimir un mensaje de bienvenida a votar.
         */
        //Llamando a a la funcion

        try {
            validate(13);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("rest of the code...");
        /**
         * El código anterior lanza una excepción no comprobada. Del mismo modo, también
         * podemos lanzar excepciones no comprobadas y definidas por el usuario.
         *
         *      Nota: Si lanzamos una excepción no comprobada desde un método,
         *      es necesario manejar la excepción o declararla en la cláusula throws.
         *
         * Si lanzamos una excepción usando la palabra clave throw, es necesario manejar
         * la excepción usando el bloque catch o el método debe declararla usando la
         * declaración throws.
         */


        /**
         * <h2>Ejemplo 2: Lanzamiento de una excepción definida por el usuario</h2>
         */
        try
        {
            //lanza un objeto de excepción definido por el usuario
            throw new UserDefinedException("This is user-defined exception");
        }
        catch (UserDefinedException ude)
        {
            System.out.println("Caught the exception");
            //Imprime el mensaje del objeto MyException
            System.out.println(ude.getMessage());
        }
    }


    //Metodo - Ejemplo 1
    public static void validate(int age) {
        if(age<18) {
            //throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else {
            System.out.println("Person is eligible to vote!!");
        }
    }
}

// La clase representa una excepción definida por el usuario
class UserDefinedException extends Exception
{
    public UserDefinedException(String str)
    {
        // Llamada al constructor padre (Excepción)
        super(str);
    }
}
