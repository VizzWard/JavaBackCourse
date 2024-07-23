package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling;

/**
 * <title>Nested Try Block</title>
 * Doc: https://www.notion.so/Java-Exception-Handling-cc033cd9e6bb4a5688f3ff79f4d0910b?pvs=4
 */

public class NestedTryBlock {
    public static void main(String[] args) {
        /**
         * Ejemplo Try Catch Anidado - Veamos un ejemplo donde colocamos un bloque try
         * dentro de otro bloque try para dos excepciones diferentes.
         */
        //bloque try externo
        try{
            //bloque try interno 1
            try{
                System.out.println("going to divide by 0");
                int b =39/0;
            }
            //bloque catch del bloque try interno 1
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }

            //bloque try interno 2
            try{
                int a[]=new int[5];

                //asignar el valor fuera de los límites del array
                a[5]=4;
            }
            //bloque catch del bloque try interno 2
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
            System.out.println("other statement");
        }
        //bloque catch del bloque try externo
        catch(Exception e)
        {
            System.out.println("handled the exception (outer catch)");
        }

        System.out.println("normal flow..");
        /**
         *  Cuando cualquier bloque try no tiene un bloque catch para una excepción en particular,
         *  entonces el bloque catch del bloque try externo (padre) se comprueba para esa excepción,
         *  y si coincide, se ejecuta el bloque catch del bloque try externo.
         *
         *  Si ninguno de los bloques catch especificados en el código es incapaz de manejar la excepción,
         *  entonces el sistema de ejecución Java manejará la excepción. A continuación, muestra el mensaje
         *  generado por el sistema para esa excepción.
         */



        /**
         * Ejemplo 2 Try Catch Anidado - Consideremos el siguiente ejemplo. Aquí el bloque try dentro del
         * bloque try anidado (bloque try interno 2) no maneja la excepción. El control se transfiere entonces
         * a su bloque try padre (bloque try interno 1). Si no maneja la excepción, entonces el control se
         * transfiere al bloque try principal (bloque try externo) donde el bloque catch apropiado maneja la
         * excepción. Esto se denomina anidamiento.
         */
        // bloque try externo (main)
        try {

            //bloque de pruebas interno 1
            try {

                // intento interior bloque 2
                try {
                    int arr[] = { 1, 2, 3, 4 };

                    //imprimir el elemento de la matriz fuera de sus límites
                    System.out.println(arr[10]);
                }

                // para manejar ArithmeticException
                catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception");
                    System.out.println(" inner try block 2");
                }
            }

            // para manejar ArithmeticException
            catch (ArithmeticException e) {
                System.out.println("Arithmetic exception");
                System.out.println("inner try block 1");
            }
        }

        // para manejar ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e4) {
            System.out.print(e4);
            System.out.println(" outer (main) try block");
        }
        catch (Exception e5) {
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }

    }
}
