package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Recordatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            propagacion2();
        } catch (ArithmeticException e) {
            System.out.println("Este es un ejemplo de propagacion");
        }

        while (true){
            int divisor = 0;
            int divisor2 = 0;

            TryCatch:
            try {
                try{
                    System.out.println("Ingrese el numero a dividir:");
                    divisor = scanner.nextInt();
                    System.out.println("Ingrese el numero divisor: ");
                    divisor2 = scanner.nextInt();
                } catch (InputMismatchException e){
                    System.out.println("Dato ingresado no valido, vuelva a intentarlo");
                    scanner.nextLine(); // Vacía el buffer del scanner
                    break TryCatch;
                }

                if (divisor == 0 || divisor2 == 0){
                    throw new ArithmeticException("El divisor no puede ser 0");
                }

                try{
                    int division = divisor / divisor2;
                    System.out.println("el resultado de la division de " + divisor + " entre " + divisor2 + " es: " +  division);

                } catch (ArithmeticException e){
                    System.out.println("Numero ingresado no es divisible");
                }


            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Fin del codigo");
            }
        }
    }

    static int propagacion() throws ArithmeticException {
        return 50/0;
    }

    static void propagacion2(){
        System.out.println("funciona");
        int val = propagacion();
    }
}
