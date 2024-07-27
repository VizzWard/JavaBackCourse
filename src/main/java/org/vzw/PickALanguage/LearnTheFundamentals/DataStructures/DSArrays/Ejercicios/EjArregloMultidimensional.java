package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSArrays.Ejercicios;

import java.util.Arrays;

public class EjArregloMultidimensional {
    public static void main(String[] args) {
        /**
         * Array bidimensional: Declara e inicializa un array bidimensional de enteros (matriz 3x3) y rellénalo con
         * valores secuenciales. Imprime la matriz.
         */
        int[][] enteros = new int[3][3];
        enteros[0][0] = 1;
        enteros[0][1] = 2;
        enteros[0][2] = 3;
        enteros[1][0] = 4;
        enteros[1][1] = 5;
        enteros[1][2] = 6;
        enteros[2][0] = 7;
        enteros[2][1] = 8;
        enteros[2][2] = 9;

        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros[i].length; j++) {
                System.out.print(enteros[i][j] + " ");
            }
            System.out.println(" ");
        }

        /**
         * Suma de filas: Crea un array bidimensional de enteros y escribe un método que calcule la suma de cada fila.
         */
        int[] suma = sumaFila(enteros);
        System.out.println("La suma de cada fila es: " + Arrays.toString(suma));


        /**
         * Matriz identidad: Declara un array bidimensional de enteros y llena la diagonal principal con 1s y el
         * resto con 0s.
         */
        int[][] identidades = new int[3][3];
        identidades[0][0] = 1;
        identidades[0][1] = 0;
        identidades[0][2] = 0;
        identidades[1][0] = 0;
        identidades[1][1] = 1;
        identidades[1][2] = 0;
        identidades[2][0] = 0;
        identidades[2][1] = 0;
        identidades[2][2] = 1;

        for (int i = 0 ; i < identidades.length; i++){
            for (int j = 0; j < identidades[i].length; j++){
                System.out.print(identidades[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        /**
         * Transposición: Escribe un método que reciba un array bidimensional y devuelva su transpuesta.
         */
        int[][] transposicion = transpose(enteros);

        for (int i = 0; i < transposicion.length; i++) {
            for (int j = 0; j < transposicion[i].length; j++) {
                System.out.print(transposicion[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        /**
         * Multiplicación de matrices: Declara dos arrays bidimensionales de enteros y escribe un método que calcule el
         * producto de las matrices.
         */
        // Declaración de dos matrices
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrix2 = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        // Multiplicar las matrices
        int[][] productMatrix = multiplyMatrices(matrix1, matrix2);

        // Imprimir la matriz resultante
        if (productMatrix != null) {
            for (int[] row : productMatrix) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Las matrices no se pueden multiplicar.");
        }
    }

    //Metodo para sumar filas de una matriz
    public static int[] sumaFila(int[][] enteros) {
        int[] suma = new int[enteros.length];
        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros[i].length; j++) {
                suma[i] += enteros[i][j];
            }
        }
        return suma;
    }

    //Transposicion
    public static int[][] transpose(int[][] enteros) {
        int[][] transpose = new int[enteros.length][enteros[0].length];
        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros[i].length; j++) {
                transpose[j][i] = enteros[i][j];
            }
        }
        return transpose;
    }

    //Producto de dos matrices
    /**
     * Multiplica dos matrices y devuelve la matriz resultante.
     * @param matrix1 La primera matriz.
     * @param matrix2 La segunda matriz.
     * @return La matriz resultante de la multiplicación, o null si las matrices no se pueden multiplicar.
     */
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        // Verificar si las matrices se pueden multiplicar
        if (cols1 != rows2) {
            return null; // Las matrices no se pueden multiplicar
        }

        // Crear la matriz resultante
        int[][] result = new int[rows1][cols2];

        // Realizar la multiplicación de matrices
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }
}
