package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling;
/**
 * <title>Java Catch Multiple Exceptions</title>
 * Doc: https://www.notion.so/Java-Exception-Handling-cc033cd9e6bb4a5688f3ff79f4d0910b?pvs=4
 */

public class MultipleTryCatch {
    public static void main(String[] args) {
        /**
         * Un bloque try puede ir seguido de uno o más bloques catch.
         * Cada bloque catch debe contener un manejador de excepciones diferente.
         * Por lo tanto, si usted tiene que realizar diferentes tareas en la
         * ocurrencia de diferentes excepciones, utilice java multi-catch bloque.
          */

        /** Ejemplo Multiple Try Catch */
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        /**
         *  Output:
         *      Arithmetic Exception occurs
         */



        /** Ejemplo 2 Multiple Try Catch */
        try{
            int a[]=new int[5];

            System.out.println(a[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        /**
         *  Output:
         *      ArrayIndexOutOfBounds Exception occurs
         *
         * > El bloque try contiene dos excepciones. Pero a la vez sólo se produce una
         *   excepción y se ejecuta su correspondiente bloque catch.
         */



        /** Ejemplo 3 Multiple Try Catch */
        try{
            int a[]=new int[5];
            a[5]=30/0;
            System.out.println(a[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        /**
         *  Output:
         *      Arithmetic Exception occurs
         */


        /**
         * Ejemplo 4 Multiple Try Catch - generamos una NullPointerException, pero no
         * proporcionamos la clase de excepción correspondiente. En tal caso, se
         * invocará el bloque catch que contiene la clase de excepción padre Exception.
         */
        try{
            String s=null;
            System.out.println(s.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        /**
         *  Output:
         *      Parent Exception occurs
         */



        /**
         * Ejemplo 5 Multiple Try Catch - Veamos un ejemplo, para tratar la excepción
         * sin mantener el orden de las excepciones (es decir, de la más específica a
         * la más general).
         */
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        //catch(Exception e){System.out.println("common task completed");}
        catch(ArithmeticException e){System.out.println("task1 is completed");}
        catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}
        /**
         *  Output:
         *      Compile-time error
         */

    }
}
