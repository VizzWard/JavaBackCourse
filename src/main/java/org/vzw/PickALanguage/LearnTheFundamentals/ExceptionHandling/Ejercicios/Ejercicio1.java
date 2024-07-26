package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 1:
 * Tienes una lista de números enteros. Debes dividir cada número
 * entre un divisor proporcionado por el usuario y manejar cualquier
 * excepción que pueda ocurrir, como ArithmeticException si el divisor es cero.
 */
public class Ejercicio1 {
    static Scanner scanner = new Scanner(System.in);
    static String dato;

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        bucle:
        while (true){
            int divisor = 0;

            InputDatos:
            try {
                try {
                    dato = getDataFromUser();

                    //Uso de excepcion personalizada
                    if (dato.equals("esc")){
                        throw new Exit("Saliendo del programa");
                    }

                    divisor = Integer.parseInt(dato);

                //Manejar excepcion cuando el dato es diferen de Int
                } catch (NumberFormatException e){
                    System.out.println("Debes ingresar un numero entero");
                    scanner.nextLine(); // Vacía el buffer del scanner
                    break InputDatos;

                //Manejar Excepcion para cerrar el programa
                } catch (Exit x){
                    System.out.println(x.getMessage());
                    break bucle;
                }

                //Lanzar excepcion cuando el dato ingresado sea 0
                if (divisor == 0) {
                    throw new ArithmeticException();
                }

                for (int number : numbers) {
                    float result = (float) number / divisor;
                    System.out.println("Result: " + result);
                }
            //Manejar expcion en caso de que el divisor sea 0
            } catch (ArithmeticException e) {
                System.out.println("No puedes ingresar un valor de 0");
            }
        }
        scanner.close();
    }

    //Metodo para obtener datos del usuario
    public static String getDataFromUser() {
        System.out.println("Ingresa el numero divisor:");
        String dato = scanner.next();
        return dato;
    }
}

//Excepcion para cerrar el programa
class Exit extends Exception {
    public Exit (String str) {
        // llamando al constructor de la Excepción padre
        super(str);
    }
}