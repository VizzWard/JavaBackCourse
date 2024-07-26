package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Ejercicios;


/**
 *  Ejercicio 5:
 *  Crea un programa que valide una entrada de edad.
 *  Si la edad es menor que cero, lanza una excepción IllegalArgumentException
 *  con un mensaje adecuado.
 *
 *  Instrucciones:
 * Completa el método validateAge para lanzar una excepción IllegalArgumentException
 * si la edad es menor que cero.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int age = -5; // Simula una entrada de edad

        try {
            validateAge(age);
        } catch (IllegalArgumentException e){
            System.out.println("Edad incorrecta ingresada ");
        }
    }

    public static void validateAge(int age) throws IllegalArgumentException {
        // Lanza una excepción si la edad es inválida
        if (age < 0) {
            throw new IllegalArgumentException("La edad introducida debe ser mayor que 0");
        }
    }
}
