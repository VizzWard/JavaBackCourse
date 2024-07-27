package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSArrays.Ejercicios;

import java.util.Arrays;

public class EjAccesoAElementos {
    public static void main(String[] args) {
        /**
         * Acceso directo: Declara un array de enteros y accede a los elementos por sus índices.
         * Imprime el primer y último elemento.
         */
        int[] enteros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(enteros[0]);
        System.out.println(enteros[enteros.length - 1]);

        /**
         * Iteración con bucle: Crea un array de cadenas y usa un bucle for para imprimir cada elemento.
         */
        String[] cadenas = new String[]{"Perro", "Gato", "Huron", "Ballena", "Manati", "Conejo"};
        for (int i = 0 ; i < cadenas.length ; i++){
            System.out.println(cadenas[i]);
        }

        /**
         * Suma de índices pares: Escribe un método que recorra un array de enteros y sume solo los elementos en
         * índices pares.
         */
        int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int resultado = sumaArray(numeros);
        System.out.println("La suma de los indices pares es: " + resultado);

        /**
         * Elemento mayor: Declara un array de dobles y escribe un método que encuentre el valor mayor en el array.
         */
        double[] dobles = new double[]{34.234, 6.4653453, 23.2423, 5.3242, 7.321};
        double mayor = 0;
        for (int i = 0; i < dobles.length; i++) {
            if (dobles[i] > mayor){
                mayor = dobles[i];
            }
        }
        System.out.println(mayor);

        /**
         * Reemplazar elementos: Crea un array de enteros y escribe un método que reemplace todos los valores
         * negativos por cero.
         */
        int[] negativos = new int[]{1, 2, 3, -4, 5, -6, 7, 8, -9, 10};
        int[] reemplazo = reemplazar(negativos);
        System.out.println(Arrays.toString(reemplazo));

    }

    //Metodo para sumar enteros en indices pares
    public static int sumaArray(int[] enteros) {
        int suma = 0;
        for (int entero : enteros) {
            if (entero % 2 == 0) {
                suma += entero;
            }
        }
        return suma;
    }

    //Metodo para reemplazar numeros enteros negativos
    public static int[] reemplazar(int[] enteros){
        int[] reemplazados = new int[enteros.length];
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] < 0){
                reemplazados[i] = 0;
            } else{
                reemplazados[i] = enteros[i];
            }
        }
        return reemplazados;
    }
}
