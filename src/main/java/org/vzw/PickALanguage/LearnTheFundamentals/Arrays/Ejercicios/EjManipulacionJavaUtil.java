package org.vzw.PickALanguage.LearnTheFundamentals.Arrays.Ejercicios;

import java.util.Arrays;

public class EjManipulacionJavaUtil {
    public static void main(String[] args) {
        /**
         * Rellenar array: Usa el método fill de la clase Arrays para llenar un array de enteros con un valor específico.
         */
        int[] rellenar = new int[10];
        Arrays.fill(rellenar, 1);

        System.out.println(Arrays.toString(rellenar));
        System.out.println(" ");

        /**
         * Comparar arrays: Declara dos arrays de enteros y usa el método equals de la clase Arrays para compararlos.
         */
        int[] compara = new int[]{3, 4, 5};
        int[] compara2 = new int[]{3, 4, 5};

        boolean comparar = Arrays.equals(compara, compara2);
        if (comparar) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }


        /**
         * Copiar array: Usa el método copyOf de la clase Arrays para crear una copia de un array existente.
         */
        int[] copia = Arrays.copyOf(rellenar, rellenar.length);
        System.out.println(Arrays.toString(copia));
        System.out.println(" ");

        /**
         * Convertir a cadena: Declara un array de enteros y usa el método toString de la clase Arrays para imprimir
         * el array como una cadena.
         */
        int[] convertir = new int[]{12, 32, 56, 43, 65, 23, 65};
        System.out.println(Arrays.toString(convertir));
        System.out.println(" ");

        /**
         * Buscar elemento: Usa el método binarySearch de la clase Arrays para buscar un elemento en un array ordenado.
         */
        int[] ordenar = new int[]{34, 54, 24, 79, 36, 69, 23, 68, 27};
        Arrays.sort(ordenar);
        System.out.println(Arrays.toString(ordenar));

        int buscar = 23;
        int index = Arrays.binarySearch(ordenar, buscar);

        if (index >= 0) {
            System.out.println("El valor " + buscar + " se encuentra en el índice: " + index);
        } else {
            System.out.println("El valor " + buscar + " no se encuentra en el array.");
        }
    }
}
