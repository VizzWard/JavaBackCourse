package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Ejercicios;

/**
 * Ejercicio 2:
 * Escribe un programa que convierta una lista de cadenas a números
 * enteros y maneje posibles excepciones como NumberFormatException
 * y ArrayIndexOutOfBoundsException.
 *
 * Instrucciones:
 * Modifica el código para manejar NumberFormatException y
 * ArrayIndexOutOfBoundsException usando bloques de catch múltiples.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String[] numbers = {"10", "20", "30a", "40", "50"};
        int index = getIndexFromUser();

        try {
            int number = Integer.parseInt(numbers[index]);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("El elemento en el indice " + index + " no es un entero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice " + index + " no existe");
        }

    }

    public static int getIndexFromUser() {
        // Simula obtener un índice del usuario
        return 2; // Puedes cambiar esto para probar otros valores
    }
}
