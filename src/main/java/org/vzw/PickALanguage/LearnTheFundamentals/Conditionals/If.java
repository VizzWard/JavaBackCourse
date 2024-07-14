package org.vzw.PickALanguage.LearnTheFundamentals.Conditionals;

/**
 * Condicional IF
 *
 *
 */

public class If {
    public static void main(String[] args) {
        /**
         * a declaración if en Java se utiliza para ejecutar un bloque de código solo
         * si una condición especificada es true. La sintaxis básica es la siguiente:
         */

        int numero = 10;

        if (numero > 0) {
            System.out.println("El número es positivo.");
        }

        /**
         * La declaración if-else en Java extiende la declaración if permitiendo
         * la ejecución de un bloque de código alternativo si la condición es falsa.
         */

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo o cero.");
        }

        /**
         * La declaracion if nos permite usar mas de una condicional.
         * Ejemplo de uso de múltiples condicionales y diferentes operadores en Java.
         *
         * Este método demuestra cómo utilizar las declaraciones `if`, `else if` y `else`
         * con diferentes operadores de comparación y lógicos.
         */

        int a = 5;
        int b = 10;
        int c = 15;

        if (a > b) {
            System.out.println("a es mayor que b");
        } else if (a < b && b < c) {
            System.out.println("a es menor que b y b es menor que c");
        } else if (a == 5 || c == 15) {
            System.out.println("a es igual a 5 o c es igual a 15");
        } else {
            System.out.println("Ninguna de las condiciones anteriores se cumple");
        }
    }
}
