package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSArrays;

/**
 * La declaración de un arreglo en Java es el proceso mediante el cual se define un arreglo y se reserva espacio en
 * memoria para almacenar sus elementos.
 *  La sintaxis para declarar un arreglo es sencilla: se especifica el tipo de dato de los elementos que el arreglo
 *  almacenará, seguido de corchetes para indicar que se trata de un arreglo, y finalmente el nombre del arreglo.
 *
 *  1. Declaracion: Define el arreglo y su tipo de dato.
 *  2. Creacion: Se utiliza la palabra clave new para crear el arreglo y reservar espacio en memoria.
 *  3. Inicializacion: Se asignan valores a los elementos del arreglo.
 *
 *  La creación de arrays en Java es un proceso que empieza con el uso del operador new.
 *  El operador new no solo reserva espacio en memoria, sino que también asegura que cada elemento del array se
 *  inicialice con un valor predeterminado, dependiendo del tipo de datos del array.
 *
 *  - Arrays de enteros: Se inicializan con ceros.
 *  - Arrays de booleanos: Se inicializan con el valor false.
 *  - Arrays de objetos: Cada elemento se inicializa como null.
 *
 */
public class Declaracion {
    public static void main(String[] args) {
        //1. Declaracion
        int[] enteros;

        //2. Creacion
        enteros = new int[10];

        //3. Inicializacion
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
        //Visualizamos un elemento del arreglos
        System.out.println("Elemento en el indice 0: " + enteros[0]);


        /**
         * La sintaxis de inicialización de un array permite llenarlo con valores específicos en el momento de su
         * creación.  Esta capacidad es especialmente útil cuando ya conocemos los datos que queremos almacenar.
         */
        // Inicialización sin el operador new
        int[] miArray = {1, 2, 3, 4, 5};

        // Inicialización con el operador new
        int[] miArray2;
        miArray2 = new int[]{1, 2, 3, 4, 5};


        /**
         * Asignación de valores
         * La asignación de valores a un array en Java es un proceso que se puede realizar de varias maneras,
         * dependiendo de si el array ya ha sido inicializado o no. Este proceso es esencial para manipular los datos
         * almacenados en el array y adaptarlos a las necesidades del programa.
         *
         * - Uso de índices: Independientemente de cómo se haya inicializado el array, siempre puedes asignar o
         *   modificar sus valores utilizando índices. Por ejemplo, miArray[0] = 10; asigna el valor 10 al primer
         *   elemento del array.
         * -Bucles para asignación: Para asignar valores a un array de manera más eficiente, especialmente cuando es
         *  grande, se pueden utilizar bucles. Un bucle for, por ejemplo, puede recorrer el array y asignar valores a
         *  cada posición.
         */

        //Uso de indices
        miArray[0] = 10;

        //Uso de Bucles
        for (int i = 0 ; i < miArray.length ; i++){
            miArray[i] = i;
            System.out.println(miArray[i]);
        }
    }
}
