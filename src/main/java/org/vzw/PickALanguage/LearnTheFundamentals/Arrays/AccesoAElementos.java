package org.vzw.PickALanguage.LearnTheFundamentals.Arrays;

/**
 *
 */
public class AccesoAElementos {
    public static void main(String[] args) {
        //Creacion del array
        int[] a = new int[10];
        //Llenado automatico del array
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        /**
         * <h1>Utilizando indices</h1>
         *  La manera más directa de acceder a los elementos de un arreglo es mediante el uso de índices.
         *  Un índice no es más que una posición numérica dentro del arreglo, donde el primer elemento tiene un índice
         *  de 0, el segundo un índice de 1, y así sucesivamente.
         */
        System.out.println(a[0]);  //a[0] --> 0 es la posicion a la que se esta accediendo

        //Consulta automatico
        for (int i = 0; i < a.length; i++) { //Se hace uso de un bucle
            System.out.println(a[i]);
        }

        /**
         * <h1>Manejo de indices fuera de rango</h1>
         *
         * Uno de los errores más comunes al trabajar con arrays java es el acceso a índices fuera de su rango válido.
         * Java arroja una excepción ArrayIndexOutOfBoundsException cuando un programa intenta acceder a un índice
         * negativo o a un índice mayor o igual que el tamaño del arreglo.
         * Es crucial realizar chequeos y validaciones para prevenir estos errores.
         *
         * Se puede prevenir el acceso a índices fuera de rango de varias maneras.
         * Una de ellas es utilizando la propiedad length del arreglo para asegurarse de que cualquier índice accedido
         * esté dentro de los límites correctos.
         * Por ejemplo, antes de acceder a un elemento, se puede verificar si el índice está entre 0 y
         * miArreglo.length - 1.
         *
         * <ul>
         *     <li>Verificación de índices: Antes de acceder a un elemento, verifica que el índice esté dentro del rango
         *     válido del arreglo.</li>
         *     <li>Manejo de excepciones: Utiliza bloques try-catch para capturar y manejar la excepción
         *     ArrayIndexOutOfBoundsException, permitiendo que tu programa continúe su ejecución de manera controlada.</li>
         * </ul>
         */
        int[] array = {1, 2, 3, 4, 5};
        int index = 7; // índice fuera de rango

        //Manejo de indices == Verificacion de indices
        if (index >= 0 && index < array.length) { //Condiciones para verificar que esta dentro del rango del array
            System.out.println("El valor en el índice " + index + " es: " + array[index]);
        } else {
            System.out.println("Índice fuera de rango.");
        }

        //Manejo de indices == Uso de Try-Catch
        try {
            System.out.println("El valor en el índice " + index + " es: " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fuera de rango.");
        }

        /**
         * <h1>Bucles y Arreglos</h1>
         *
         * Los bucles representan una de las maneras más eficientes de trabajar con arrays java. Permiten recorrer,
         * acceder y manipular cada elemento del arreglo con facilidad, reduciendo la necesidad de escribir código
         * repetitivo. Los bucles for y for-each son especialmente útiles en este contexto.
         *
         * Utilizar un bucle for tradicional con un índice numérico es una forma directa de recorrer un arreglo.
         * Este método facilita el acceso a cada elemento del arreglo mediante su índice. Por otro lado, el bucle
         * for-each ofrece una sintaxis más limpia y menos propensa a errores, ideal para situaciones donde no
         * necesitas manipular el índice del arreglo directamente.
         */

        //Bucle For
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento en índice " + i + ": " + array[i]);
        }

        //Bucle ForEach
        for (int element : array) {
            System.out.println("Elemento: " + element);
        }
    }
}
