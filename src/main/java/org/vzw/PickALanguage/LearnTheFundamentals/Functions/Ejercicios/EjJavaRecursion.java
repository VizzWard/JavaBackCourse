package org.vzw.PickALanguage.LearnTheFundamentals.Functions.Ejercicios;

/**
 * Crea un método recursivo llamado factorial que calcule el factorial de un número.
 */
public class EjJavaRecursion {
    public static void main(String[] args) {
        int numFactorial = factorial(15);
        System.out.println(numFactorial);
    }

    static int factorial(int n) {
        if (n > 0){ //Condicion para no entrar en un bucle infinito
            return n + factorial(n -1);
        } else {
            return 0;
        }
    }
    /**
     * Asegúrate de que el método recursivo factorial tenga una condición de
     * detención adecuada para evitar la recursión infinita.
     */
}
