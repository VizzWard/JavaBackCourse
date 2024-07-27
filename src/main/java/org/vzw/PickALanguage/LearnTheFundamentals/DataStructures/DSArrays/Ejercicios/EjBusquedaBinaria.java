package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSArrays.Ejercicios;

import java.util.Arrays;

public class EjBusquedaBinaria {
    public static void main(String[] args) {
        /**
         * Implementar búsqueda binaria: Escribe un método que implemente la búsqueda binaria en un array de enteros.
         */
        int[] enteros = new int[]{345, 224, 843, 234, 578, 125, 767, 235, 756, 77, 345, 246, 75, 789, 54, 57 ,865, 57};
        int valor = 843;
        int pos = buscar(enteros, valor);
        if (pos > 0) {
            System.out.println("El numero " + valor + " esta en la posicion " + pos);
        } else {
            System.out.println("El numero " + valor + " no esta en la matriz");
        }
        System.out.println(" ");
        /**
         * Ordenar y buscar: Declara un array de enteros desordenado, ordénalo usando Arrays.sort y luego busca un
         * elemento usando búsqueda binaria.
         */
        int[] ordenar = new int[]{1, 4, 6, 9 ,2 ,5, 7};
        Arrays.sort(ordenar);
        System.out.println(Arrays.toString(ordenar));
        int key = 4;
        int index = Arrays.binarySearch(ordenar, key);
        if (index >= 0) {
            System.out.println("El numero " + key + " esta en la posicion " + index);
        }
        System.out.println(" ");

        /**
         * Buscar cadena: Declara un array de cadenas, ordénalo y usa búsqueda binaria para encontrar una cadena
         * específica.
         */
        String[] cadenas = new String[]{"Perro", "Hoja", "perro", "hoja"};
        Arrays.sort(cadenas);
        System.out.println(Arrays.toString(cadenas));
        String llave = "perro";
        int indice = Arrays.binarySearch(cadenas, llave);
        if (indice >= 0) {
            System.out.println("La palabra " + llave + " se encuentra en la posicion " + indice);
        }
        System.out.println(" ");


        /**
         * Insertar ordenadamente: Escribe un método que inserte un elemento en su posición correcta en un array
         * ordenado.
         */
        int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18, 19, 20, 21, 22, 23};
        int elemento = 15;

        int[] NuevoArray = inserttarElementoOrdenado(numeros, elemento);
        System.out.println(Arrays.toString(NuevoArray));

        /**
         * Buscar en matriz: Declara una matriz ordenada de enteros y escribe un método que implemente búsqueda
         * binaria en cada fila para encontrar un elemento.
         */
        int[][] matriz = {
                {7, 8, 4, 5, 7},
                {9, 10, 8, 3, 6, 11},
                {11, 12, 45, 67, 23, 86, 23}
        };
        int numero = 11;
        int[] resultado = buscarBinaria(matriz, numero);
        System.out.println(Arrays.toString(resultado));

    }
    //Metodo para ordenar y buscar en un array de enteros
    public static int buscar(int[] enteros, int key){
        Arrays.sort(enteros);
        int index = Arrays.binarySearch(enteros, key);
        System.out.println(Arrays.toString(enteros));
        return index;
    }

    //Metodo para detectar posicion correcta de un elemento
    public static int posicion(int[] enteros, int key){
        int index = Arrays.binarySearch(enteros, key);
        return index < 0 ? -index - 1 : index;
    }

    //Metodo para insertar elemento en la posicion correcta
    public static int[] inserttarElementoOrdenado(int[] enteros, int key){
        int[] newArray = new int[enteros.length + 1];
        int index = 0;

        //Buscar la posicion correcta
        while (index < enteros.length && enteros[index] < key){
            newArray[index] = enteros[index];
            index++;
        }

        //Insertar el elemento
        newArray[index] = key;

        //Insertar los elementos restantes
        while (index < enteros.length){
            newArray[index + 1] = enteros[index];
            index++;
        }

        //Retornar el array
        return newArray;
    }

    //Metodo para buscar un elemento en una matriz
    public static int[] buscarBinaria(int[][] enteros, int key){
        int[] index = new int[2];

        busqueda:  //etiqueta para poder terminar el ciclo cuando se cumpla la condicion
        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros[i].length; j++) {
                if (enteros[i][j] == key){
                    index[0] = i;
                    index[1] = j;
                    break busqueda; //rompemos el ciclo con el uso de la etiqueta
                }
            }
        }

        return index;
    }
}
