package org.vzw.PickALanguage.LearnTheFundamentals.Loops;

/**
 * <h1>Do-while Loop</h1>
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        /**
         * El bucle do-while se utiliza para iterar una parte del programa repetidamente,
         * hasta que la condición especificada sea verdadera. Si el número de iteraciones no es
         * fijo y debe ejecutar el bucle al menos una vez, se recomienda utilizar un bucle do-while.
         *
         * El bucle do-while se denomina bucle de control de salida. Por lo tanto, a diferencia
         * de los bucles while y for, el bucle do-while comprueba la condición al final del cuerpo
         * del bucle. El bucle Java do-while se ejecuta al menos una vez porque la condición se
         * comprueba después del cuerpo del bucle.
         *
         *              do{
         *                  //codigo a ejecutar / loop body
         *                  //update statement
         *              }while (Condicion);
         *
         * Las diferentes partes del bucle do-while:
         * 1. Condición: Es una expresión que se comprueba. Si la condición es verdadera, el cuerpo
         *    del bucle se ejecuta y el control pasa a actualizar la expresión. En cuanto la condición es
         *    falsa, el bucle se rompe automáticamente. (Ejemplo: i <=100)
         * 2. Expresión de actualización: Cada vez que se ejecuta el cuerpo del bucle, esta expresión
         *    incrementa o decrementa la variable del bucle. (Ejemplo: i++)
         */
        //
        int i=1;

        do{
            System.out.println(i); //Codigo a ejecutar
            i++; //Incremento
        }while(i<=10); //Condicional


        /**
         * <h2>Infinitive do-while Loop</h2>
         * Si pasas true en el bucle do-while, será un bucle do-while infinito.
         */

        do{
            System.out.println("infinitive do while loop");
        }while(true);
    }
}
