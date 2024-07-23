package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling;

/**
 * <title>Java finally block</title>
 * Doc: https://www.notion.so/Java-Exception-Handling-cc033cd9e6bb4a5688f3ff79f4d0910b?pvs=4
 */

public class FinallyBlock {
    public static void main(String[] args) {
        /**
         * <h1>Usos de Finall</h1>
         */

        /**
         * <h2>Caso 1: Cuando no se produce una excepción</h2>
         * Veamos el siguiente ejemplo donde el programa Java no lanza ninguna excepción, y
         * el bloque finally se ejecuta después del bloque try.
         */
        try{
            //el siguiente código no lanza ninguna excepción
            int data=25/5;
            System.out.println(data);
        }
        //catch no se ejecutará
        catch(NullPointerException e){
            System.out.println(e);
        }
        //ejecutado independientemente de que se haya producido o no una excepción
        finally {
            System.out.println("finally block is always executed");
        }



        /**
         * <h2>Caso 2: Cuando se produce una excepción pero no es tratada por el bloque catch</h2>
         * Aquí, el código lanza una excepción, pero el bloque catch no puede manejarla.
         * A pesar de esto, el bloque finally se ejecuta después del bloque try y entonces el
         * programa termina anormalmente.
         */
        try {
            System.out.println("Inside the try block");

            //el siguiente código lanza una excepción de división por cero
            int data=25/0;
            System.out.println(data);
        }
        //no puede manejar la excepción de tipo Aritmética
        //sólo puede aceptar excepciones de tipo Null Pointer
        catch(NullPointerException e){
            System.out.println(e);
        }

        //se ejecuta independientemente de que se produzca o no una excepción
        finally {
            System.out.println("finally block is always executed");
        }


        /**
         * <h2>Caso 3: Cuando se produce una excepción y es tratada por el bloque catch</h2>
         * el código Java lanza una excepción y el bloque catch maneja la excepción.
         * Posteriormente se ejecuta el bloque finally después del bloque try-catch.
         * Además, el resto del código también se ejecuta normalmente.
         */
        try {

            System.out.println("Inside try block");

            //el siguiente código lanza una excepción de división por cero
            int data=25/0;
            System.out.println(data);
        }

        //gestiona la excepción aritmética / de división por cero
        catch(ArithmeticException e){
            System.out.println("Exception handled");
            System.out.println(e);
        }

        //se ejecuta independientemente de que se produzca o no una excepción
        finally {
            System.out.println("finally block is always executed");
        }
    }
}
