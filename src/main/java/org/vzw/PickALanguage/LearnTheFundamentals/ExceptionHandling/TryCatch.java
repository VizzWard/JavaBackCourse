package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling;

/**
 * <title>Java try-catch block</title>
 * Doc: https://www.notion.so/Java-Exception-Handling-cc033cd9e6bb4a5688f3ff79f4d0910b?pvs=4
 */
public class TryCatch {
    public static void main(String[] args) {
        /**
         * <h1>Java try block</h1>
         * El bloque try de Java se utiliza para encerrar el código que puede lanzar una excepción.
         * Debe utilizarse dentro del método.
         * Si se produce una excepción en la declaración particular en el bloque try, el resto del
         * código del bloque no se ejecutará. Por lo tanto, se recomienda no mantener el código que
         * no lanzará una excepción en el bloque try .
         * El bloque try de Java debe ir seguido de un bloque catch o finally.
         *
         * Syntax of Java try-catch:
         *              try{
         *                  //Codigo que podria dar una excepcion/error
         *              }catch(Exception_class_Name ref){}
         *
         * Syntax of try-finally block:
         *              try{
         *                  //Codigo que podria dar una excepcion/error
         *              }finally{}
         */

        /**
         *  Problema sin gestión de excepciones
         *      int data = 50/0; //puede lanzar una excepción
         *      System.out.println("Resto del codigo");
         *
         *  Output:
         *      Exception in thread "main" java.lang.ArithmeticException: / by zero
         *
         *  Como se muestra en el ejemplo anterior, el resto del código no se ejecuta.
         */

        /** Problema con gestion de exepciones */
        try
        {
            int data=50/0; //may throw exception
        } //handling the exception
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Resto del codigo");
        /**
         * Output:
         *      java.lang.ArithmeticException: / by zero
         *      Resto del codigo
         *
         * Como se muestra en el ejemplo anterior, se ejecuta el resto del código,
         * es decir, se imprime el resto de la sentencia de código.
         */


        /** Ejemplo Try Catch */
        try
        {
            int data=50/0; //puede lanzar una excepción

            // si se produce una excepción, la declaración restante no se ejecutará

            System.out.println("Resto del codigo");
        }
        // handling the exception
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        /**
         *  Output:
         *      java.lang.ArithmeticException: / by zero
         *
         *  Aquí podemos ver que si se produce una excepción en el bloque try,
         *  el resto del código del bloque no se ejecutará.
         */



        /** Ejemplo Try Catch */
        try
        {
            int data=50/0; //may throw exception
        }
        // handling the exception
        catch(Exception e)
        {
            // displaying the custom message
            System.out.println("Can't divided by zero");
        }
        /**
         * Output:
         *      Can't divided by zero
         */



        /** Ejemplo Try Catch */
        int i=50;
        int j=0;
        int data;
        try
        {
            data=i/j; //may throw exception
        }
        // handling the exception
        catch(Exception e)
        {
            // resolving the exception in catch block
            System.out.println(i/(j+2));
        }
        /**
         * Output:
         *      25
         */



        /** Ejemplo Try Catch */
        try
        {
            int data1=50/0; //may throw exception

        }
        // handling the exception
        catch(Exception e)
        {
            // generating the exception in catch block
            int data2=50/0; //may throw exception

        }
        /**
         * Output:
         *      Exception in thread "main" java.lang.ArithmeticException: / by zero
         */
    }

}
