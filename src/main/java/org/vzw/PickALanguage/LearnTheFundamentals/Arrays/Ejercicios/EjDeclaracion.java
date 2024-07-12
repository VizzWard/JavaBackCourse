package org.vzw.PickALanguage.LearnTheFundamentals.Arrays.Ejercicios;

import java.util.Arrays;
import java.lang.Math;

public class EjDeclaracion {
    public static void main(String[] args) {
        /**
         * Declaración e Inicialización: Declara e inicializa un array de enteros en una sola línea. Imprime el array.
         */
        int[] enteros = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(enteros));//Uso de toString para imprimir el array

        /**
         * Inicialización en bloque: Crea un array de cadenas y usa la inicialización en bloque para asignar valores.
         * Recorre el array e imprime cada elemento.
         */
        String[] cadenas = new String[]{"Casa", "Fruta", "Agua"};
        for (String cadena : cadenas) {
            System.out.println(cadena);
        }

        /**
         * Creación dinámica: Declara un array vacío y luego asigna su tamaño en tiempo de ejecución. Llena el array
         * con números aleatorios.
         */
        int[] numeros;
        numeros = new int[10];
        for (int i = 0 ; i < numeros.length; i++){
            numeros[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(numeros));

        /**
         * Inicialización parcial: Declara un array de enteros con tamaño 5 e inicializa solo los
         * primeros tres elementos. Imprime el array para ver los valores predeterminados de los
         * elementos no inicializados.
         */
        int[] parcial = new int[5];
        parcial[0] = 1;
        parcial[1] = 2;
        parcial[2] = 3;
        System.out.println(Arrays.toString(parcial));

        /**
         * Redimensionar array: Escribe un método que reciba un array y lo redimensione (por ejemplo, duplica su
         * tamaño), copiando los elementos existentes.
         */
        int[] original = new int[]{1, 2, 3, 4, 5};

        int[] redimension = resizeArray(original, original.length * 2);
        System.out.println(Arrays.toString(redimension));

    }

    //Metodo para redimensionar array
    public static int[] resizeArray(int[] array, int newLength){
        int[] newArray = new int[newLength];
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }
}
