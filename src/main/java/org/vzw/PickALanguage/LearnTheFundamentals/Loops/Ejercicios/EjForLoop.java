package org.vzw.PickALanguage.LearnTheFundamentals.Loops.Ejercicios;

public class EjForLoop {
    //Usar el metodo public para ejecutar los metodos de cada ejercicio
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        ejercicio5();
    }

    static void ejercicio1() {
        /** <h2>Simple for Loop</h2>
         * Imprime los números del 1 al 10.
         */
        for (int i = 0 ; i < 10 ; i++ ){
            System.out.println(i);
        }
    }

    static void ejercicio2() {
        /** <h2>Nested for Loop</h2>
         *  Imprime una tabla de multiplicar del 1 al 5.
         */
        for (int i = 1 ; i <= 10 ; i++ ){
            for (int j = 1 ; j <= 10 ; j++ ){
                System.out.println(i + " * " + j + " = " +  i * j);
            }
            System.out.println(" ");
        }
    }

    static void ejercicio3() {
        /** <h2>For Each Loop</h2>
         * Imprime todos los elementos de un array de enteros.
         */
        int[] enteros = new int[100];
        //For para llenar el array:
        for(int i = 0 ; i < enteros.length ; i++){
            enteros[i] = i;
        }

        //For Each
        for (int numero : enteros){
            System.out.println(numero);
        }
    }

    static void ejercicio4() {
        /** <h2>Labeled For Loop</h2>
         * Usa un labeled loop para salir de dos loops anidados.
         */
        loop1:
        for (int i = 1 ; ; i++ ){
            loop2:
            for (int j = 1 ; j <= 10; j++ ){
                if (i * j == 100){
                    break loop1;
                } else if (i * j == i + j + 2) {
                    break loop2;
                }

                System.out.println(i + " * " + j + " = " +  i * j);
            }
            System.out.println(" ");
        }
    }

    static void ejercicio5() {
        /** <h2>Infinitive for Loop</h2>
         * Crear un loop infinito que imprima "Hello, World!".
         */
        for( ; ; ){
            System.out.println("Hello World");
        }
    }
}
