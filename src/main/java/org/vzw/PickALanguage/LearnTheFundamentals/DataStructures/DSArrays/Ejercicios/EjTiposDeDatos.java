package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSArrays.Ejercicios;
import java.util.Arrays;


public class EjTiposDeDatos {
    public static void main(String[] args) {
        /**
         * Array de booleanos: Crea un array de booleanos con cuatro elementos. Asigna valores verdaderos o
         * falsos y recorre el array imprimiendo cada valor.
         */
        boolean[] boleano = new boolean[]{true, false, true, false,false};
        for (int i = 0; i < boleano.length; i++) {
            System.out.println(boleano[i]);
        }

        /**
         * Array de caracteres: Declara un array de caracteres con las letras del alfabeto y escribe un método que
         * imprima solo las vocales.
         */
        char[] caracter = new char[]{'a', 'b', 'c', 'd', 'e'};
        for (int i = 0 ; i < caracter.length ; i++){
            System.out.println(caracter[i]);
        }

        /**
         * Array de enteros: Crea un array de enteros con los números del 1 al 10. Escribe un método que calcule el
         * promedio de estos números.
         */
        int[] enteros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma = 0;
        for (int i = 0 ; i < enteros.length ; i++){
            suma += enteros[i];
        }
        System.out.println(suma);

        /**
         * Array de flotantes: Declara un array de números flotantes y escribe un método que encuentre el valor
         * máximo en el array.
         */
        float[] flotantes = new float[]{4.643f, 3.45f, 4.23f, 2.445f, 5.32f};
        float maximo = 0;
        for (int i = 0; i < flotantes.length; i++){
            if (flotantes[i] > maximo){
                maximo = flotantes[i];
            }
        }
        System.out.println(maximo);

        /**
         * Array de cadenas: Crea un array de cadenas con los nombres de cinco colores. Ordena el array
         * alfabéticamente e imprímelo.
         */
        String[] cadenas = new String[]{"Blanco", "Amarillo", "Cafe", "Rojo", "verde"};
        Arrays.sort(cadenas);
        for (String cadena : cadenas){
            System.out.println(cadena);
        }


    }
}
