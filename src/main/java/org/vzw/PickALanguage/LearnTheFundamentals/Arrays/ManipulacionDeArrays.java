package org.vzw.PickALanguage.LearnTheFundamentals.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Manipulación de Arreglos con java.util.Arrays
 */

public class ManipulacionDeArrays {
    public static void main(String[] args) {
        /**
         * <h1>Métodos de copia</h1>
         * El métodos copyOf, permite crear una copia de un array con un nuevo tamaño, el cual puede ser mayor
         * o menor que el original. Si es mayor, los nuevos elementos se inicializan con valores predeterminados.
         *
         * <ul>
         *     <li>copyOfRange: Este método es especialmente útil cuando solo se necesita una porción del array.
         *     Permite especificar el índice de inicio y fin para la copia.</li>
         *     <li>fill: Para inicializar todos los elementos de un array con un valor específico, el método fill es la
         *     solución perfecta.</li>
         * </ul>
         *
         **** ES NECESARIO IMPORTAR LA LIBRERIA PARA PODER USARLO ****
         * import java.util.Arrays;
         */

        /** Metodo copyOfRange */
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Copiando un rango del array original (de la posición 2 a la 5)
        int[] copiedArray = Arrays.copyOfRange(originalArray, 2, 6);

        // Imprimir el array copiado
        System.out.println("Array Copiado: " + Arrays.toString(copiedArray));


        /** Metodo fill */
        int[] arrayToFill = new int[10];

        // Llenando el array con el valor 5
        Arrays.fill(arrayToFill, 5);

        // Imprimir el array lleno
        System.out.println("Array Lleno: " + Arrays.toString(arrayToFill));


        /**
         * <h1>Busqueda en Arreglos</h1>
         * El metodo binarySearch requiere que el array esté previamente ordenado y devuelve la posición del elemento
         * buscado. Si el elemento no se encuentra, devuelve un valor negativo que indica su punto de inserción
         * potencial.
         *
         * <ul>
         *     <li>Preordenamiento: Antes de realizar una búsqueda binaria, es crucial ordenar el array utilizando sort.</li>
         *     <li>binarySearch: Realizar la búsqueda del elemento deseado en el array ordenado.</li>
         * </ul>
         */


        /** Preordenamiento */
        int[] array = {5, 3, 8, 1, 9, 2};

        // Ordenar el array
        Arrays.sort(array);

        // Imprimir el array ordenado
        System.out.println("Array Ordenado: " + Arrays.toString(array));

        /** Uso de binarySearch */
        int key = 5;
        int index = Arrays.binarySearch(array, key); //arroja el valor entero en el que se encuentra el elemento

        // Imprimir el resultado de la búsqueda
        if (index >= 0) {
            System.out.println("El valor " + key + " se encuentra en el índice: " + index);
        } else {
            System.out.println("El valor " + key + " no se encuentra en el array.");
        }


        /**
         * <h1>Conversión a List</h1>
         * La conversión de un array a una lista es una operación común en la programación Java, facilitada por el
         * método asList de java.util.Arrays. Esta conversión es particularmente útil cuando se necesita un acceso más
         * flexible a los elementos del array, como la capacidad de utilizar iteradores o realizar operaciones
         * específicas de colecciones.
         *
         * <ul>
         *     <li>asList: Crea una lista fija respaldada por el array original, permitiendo operaciones como la
         *     búsqueda o el ordenamiento sin modificar la estructura del array.</li>
         *     <li>Modificaciones: Aunque la lista resultante no permite agregar o eliminar elementos, sí permite
         *     modificar los elementos existentes, reflejando los cambios en el array original.</li>
         * </ul>
         */
        // Crear un array
        String[] arrayList = {"manzana", "naranja", "plátano", "fresa"};

        // Convertir el array a una lista
        List<String> list = Arrays.asList(arrayList);

        // Imprimir la lista
        System.out.println("Lista: " + list);

        /**
         * Importante:
         * La lista devuelta por Arrays.asList es una vista fija del array original, lo que significa que no puedes
         * cambiar el tamaño de la lista.
         * Cualquier cambio en los elementos de la lista se reflejará en el array original y viceversa.
         *
         * Si necesitas una lista mutable (donde puedas agregar o eliminar elementos), puedes crear una nueva instancia
         * de ArrayList a partir de la lista devuelta por Arrays.asList.
         */
        // Crear un array
        String[] arrayList2 = {"manzana", "naranja", "plátano", "fresa"};

        // Convertir el array a una lista y luego a una ArrayList
        List<String> lista = new ArrayList<>(Arrays.asList(arrayList2));

        // Imprimir la lista
        System.out.println("ArrayList: " + lista);

        // Modificar la ArrayList (agregar un nuevo elemento)
        lista.add("uva");
        System.out.println("ArrayList después de agregar uva: " + lista);

    }
}
