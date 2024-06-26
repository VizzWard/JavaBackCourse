package org.vzw.FundamentosDeProgramacion.SintaxisBasica;

/**
 * Un array es un objeto contenedor que contiene un número fijo de valores de un mismo tipo.
 * La longitud de una matriz se establece cuando se crea la matriz. Tras su creación, su longitud es fija.
 * Cada elemento de una matriz se denomina elemento, y se accede a cada elemento por su índice numérico.
 *
 * Mas informacion: https://devdoc.net/javaxe/JavaTutorial_20160719/java/nutsandbolts/arrays.html
 */

public class Arrays {
    public static void main(String[] args) {
        // Declarar un array
        int[] enteros;

        // Asignar longitud del array
        enteros = new int[10];
        //Tambien se puede declarar e inicilizar
        char[] letras = new char[10];

        // Asignar valor a los elementos
        enteros[0] = 1;
        enteros[1] = 2;
        enteros[2] = 3;
        enteros[3] = 4;
        enteros[4] = 5;
        enteros[5] = 6;
        enteros[6] = 7;
        enteros[7] = 8;
        enteros[8] = 9;
        enteros[9] = 10;

        System.out.println("Elemento en el indice 0: " + enteros[0]);

        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        /**
         * De igual forma se puede copiar un array en otro
         *
         * @param
         *  src – the source array.
         *  srcPos – starting position in the source array.
         *  dest – the destination array.
         *  destPos – starting position in the destination data.
         *  length – the number of array elements to be copied.
         */
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));

        //Funcion similar:
        char[] copia = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println(new String(copia));
    }
}
