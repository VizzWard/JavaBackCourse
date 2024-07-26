package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Ejercicios;

/**
 * Ejercicio 4:
 * Desarrolla un programa que realice una operación de división y
 * asegúrese de que siempre se imprima un mensaje de despedida,
 * independientemente de si ocurre una excepción o no.
 *
 * Instrucciones:
 * Maneja la excepción ArithmeticException y asegúrate de que el
 * mensaje "Goodbye!" siempre se imprima usando un bloque finally.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            // Mensaje de despedida
            System.out.println("Goodbye!");
        }
    }
}
