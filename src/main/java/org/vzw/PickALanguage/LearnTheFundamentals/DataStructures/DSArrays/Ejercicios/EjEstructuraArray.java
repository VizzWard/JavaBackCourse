package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSArrays.Ejercicios;

public class EjEstructuraArray {
    public static void main(String[] args) {
        /**
         * Crear un array: Declara un array de enteros con cinco elementos y asigna valores a cada posición.
         * Imprime todos los elementos.
         */
        //Creacion
        int[] enteros = new int[]{1, 2, 3, 4, 5};
        //Imprimir
        for (int i = 0; i < enteros.length; i++) {
            System.out.println(enteros[i]);
        }

        /**
         * Modificar un array: Crea un array de cadenas con tres elementos.
         * Modifica el segundo elemento e imprime el array.
         */
        String[] cadena = new String[]{"Pera", "Manzana", "Coco"};
        cadena[1] = "Uva";
        for (int i = 0; i < cadena.length; i++) {
            System.out.println(cadena[i]);
        }

        /**
         * Copiar un array: Escribe un programa que copie los elementos de un array de enteros en
         * otro array de igual tamaño.
         */
        int[] datos = new int[]{1, 2, 3, 4, 5};
        int[] copyDatos = new int[datos.length];
        for (int i = 0; i < datos.length; i++) {
            copyDatos[i] = datos[i];
            System.out.println(copyDatos[i]);
        }

        /**
         * Imprimir en reversa: Crea un array de caracteres y escribe un método que
         * imprima los elementos del array en orden inverso.
         */
        int[] reverse = new int[]{5, 4, 3, 2, 1};
        System.out.println(reverse.length);
        for (int i = 0; i < reverse.length; i++) {
            System.out.println(reverse[reverse.length - 1 - i]);
        }

        /**
         * Suma de elementos: Declara un array de dobles y escribe un método que calcule la suma de todos sus elementos.
         */
        double[] dobles = new double[]{34.234, 6.4653453, 23.2423, 5.3242, 7.321};
        double suma = 0;
        for (int i = 0; i < dobles.length; i++) {
            suma += dobles[i];
        }
        System.out.println(suma);

    }
}
