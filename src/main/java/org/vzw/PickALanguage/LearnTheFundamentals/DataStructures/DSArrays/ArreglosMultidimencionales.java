package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSArrays;

/**
 * <h1>Definicion y Estructura</h1>
 *
 * En su forma más básica, un array multidimensional en Java puede verse como un «array de arrays», donde cada elemento
 * del array principal es, a su vez, otro array. Esto permite crear estructuras bidimensionales, como matrices, o
 * incluso estructuras tridimensionales o de mayor dimensión, dependiendo de las necesidades del proyecto.
 */

public class ArreglosMultidimencionales {
    public static void main(String[] args) {
        /**
         * Declaracion e inicializacion
         */

        int[][] a = new int[3][3];

        /**
         * Para declarar un array bidimensional en Java, se utiliza la sintaxis tipo[][] nombreArray;, donde tipo es el
         * tipo de datos que almacenará el array.
         *
         *
         *
         * Creacion de arreglos multidimencionales
         *
         * La creación de un array multidimensional implica definir su tipo, tamaño y, en algunos casos, los valores
         * iniciales de sus elementos.
         * Se pueden crear arrays multidimensionales con «filas» de diferentes longitudes, conocidos como arrays
         * irregulares. Esto es particularmente útil cuando se necesitan estructuras de datos flexibles que no se ajustan
         * a una forma rectangular perfecta.
         */
        int[][] datos = new int[6][2];

        //Se pueden crear tantas dimensiones se requiran
        int[][][][] datos2 = new int[6][2][3][2];

        //Llenado del array
        int index = 1;
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j] = index++;
            }
        }

        /**
         * Acceso
         * El acceso se realiza mediante la especificación de índices para cada dimensión del array.
         * Por ejemplo, en un array bidimensional, se necesitan dos índices: uno para las filas y otro para las
         * columnas.
         *
         * Para acceder a un elemento específico, se utiliza la sintaxis "nombreArray[indiceFila][indiceColumna]" para
         * arrays bidimensionales o se añaden más índices para arrays de mayor dimensión.
         *
         * Teniendo acceso a los elementos podemos tanto imprimir los valores como modificarlos
         */
        System.out.println(datos[5][1]);

        //Recorrer un array e imprimir el valor de cada elemento
        for (int[] row : datos) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        //Modificar el valor de un elemento
        datos[1][1] = 7;
        System.out.println(datos[1][1]);
    }
}
