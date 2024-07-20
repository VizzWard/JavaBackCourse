package org.vzw.PickALanguage.LearnTheFundamentals.Loops;

/**
 * <h1>Java While Loop</h1>
 */
public class WhileLoop {
    public static void main(String[] args) {
        /**
         * El bucle while de Java se utiliza para iterar una parte del programa repetidamente
         * hasta que la condición booleana especificada sea verdadera. Tan pronto como la
         * condición booleana se convierte en falsa, el bucle se detiene automáticamente.
         *
         *              while (condition){
         *                  //Codigo a ejecutar
         *                  Incremento / Decremento statement
         *              }
         */
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }


        /**
         * <h2>Infinitive While Loop</h2>
         * Si pasas true en el bucle while, será un bucle while infinitivo.
         *
         *              while(true){
         *                  //Codigo a ejecutar
         *              }
         */
        while(true){
            System.out.println("infinitive while loop");
        }
    }
}
