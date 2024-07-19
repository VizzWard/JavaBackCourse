package org.vzw.PickALanguage.LearnTheFundamentals.Functions;

/** <h1>Java Recursion</h1> */
public class JavaRecursion {
    /**
     * La recursión es la técnica que consiste en hacer que una función
     * se llame a sí misma. Esta técnica permite descomponer problemas
     * complicados en problemas sencillos más fáciles de resolver.
     *
     * Ejemplo de Recursion:
     */
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
    /**
     * Explicacion:
     * Cuando se llama a la función sum(), ésta suma el parámetro k a la suma
     * de todos los números menores que k y devuelve el resultado. Cuando k se
     * convierte en 0, la función simplemente devuelve 0. Al ejecutarse, el
     * programa sigue estos pasos:
     *
     * 10 + sum(9)
     * 10 + ( 9 + sum(8) )
     * 10 + ( 9 + ( 8 + sum(7) ) )
     * ...
     * 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
     * 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
     *
     * Como la función no se llama a sí misma cuando k es 0, el programa se detiene ahí y devuelve el resultado.
     */

    /**
     * <h2>Halting Condition</h2>
     * Al igual que los bucles pueden encontrarse con el problema del bucle infinito,
     * las funciones recursivas pueden encontrarse con el problema de la recursividad
     * infinita. La recursividad infinita es cuando la función nunca deja de llamarse
     * a sí misma. Cada función recursiva debe tener una condición de parada, que es
     * la condición en la que la función deja de llamarse a sí misma. En el ejemplo
     * anterior, la condición de parada es cuando el parámetro k se convierte en 0.
     *
     * Es útil ver varios ejemplos diferentes para comprender mejor el concepto.
     * En este ejemplo, la función suma un rango de números entre un inicio y un fin.
     * La condición de parada de esta función recursiva es que el final no sea mayor que el inicio:
     */
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
