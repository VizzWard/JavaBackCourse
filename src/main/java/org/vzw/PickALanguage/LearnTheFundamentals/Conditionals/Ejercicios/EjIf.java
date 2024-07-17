package org.vzw.PickALanguage.LearnTheFundamentals.Conditionals.Ejercicios;

public class EjIf {
    public static void main(String[] args) {
        /**
         * Ejercicio 1: Escribe un programa que determine si un número entero es positivo, negativo o cero.
         */
        int numero = 12;
        
        if (numero > 0) {
            System.out.println("El numero " + numero + " es positivo");
        } else if (numero == 0) {
            System.out.println("El numero " + numero + " es cero");
        } else {
            System.out.println("El numero " + numero + " es negativo");
        }

        /**
         * Ejercicio 2: Escribe un programa que determine si un año es bisiesto. Un año es bisiesto
         * si es divisible por 4, pero no por 100, a menos que también sea divisible por 400.
         */
        int year = 2024;

        if (year % 4 == 0 && (year % 100 != 0  || year % 400 == 0) && year > 0) {
            System.out.println("El año " + year + " es bisiesto");
        } else {
            System.out.println("El año " + year + " no es bisiesto");
        }

        /**
         * Ejercicio 3: Escribe un programa que determine si una persona es mayor de edad (18 años o más).
         */
        int edad = 17;

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else if (edad > 0 && edad < 18) {
            System.out.println("Es menor de edad");
        } else {
            System.out.println("Ingrese un valor valido");
        }

        /**
         * Ejercicio 4: Escribe un programa que verifique si un número es par o impar.
         */
        numero = 33537;

        if (numero % 2 == 0){
            System.out.println("El numero " + numero + " es par");
        } else {
            System.out.println("El numero " + numero + " es impar");
        }

        /**
         * Ejercicio 5: Escribe un programa que determine el mayor de dos números enteros.
         */
        int num1 = 16 , num2 = 15;

        if (num1 > num2) {
            System.out.println("El numero " + num1 + " es mayor");
        } else {
            System.out.println("El numero " + num2 + " es mayor");
        }

        /**
         * Ejercicio 6: Escribe un programa que determine el menor de tres números enteros.
         */
        int num3 = 21;

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero " + num1 + " es mayor");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero " + num2 + " es mayor");
        } else {
            System.out.println("El numero " + num3 + " es mayor");
        }

        /**
         * Ejercicio 7: Escribe un programa que determine si un carácter es una vocal.
         */
        char letra = 'b';

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("La letra " + letra + " es vocal");
        } else {
            System.out.println("La letra " + letra + " no es vocal");
        }

        /**
         * Ejercicio 8: Escribe un programa que verifique si una contraseña ingresada por el usuario es correcta.
         */
        String password = "1234qwer";

        if (password.equals("1234qwerty")) {
            System.out.println("Acceso exitoso");
        } else {
            System.out.println("Contraseña incorrecta");
        }

        /**
         * Ejercicio 9: Escribe un programa que determine si una persona puede votar, considerando
         * que la edad mínima para votar es 18 años.
         */
        edad = 18;

        if (edad >= 18) {
            System.out.println("Puede votar");
        } else if (edad > 0 && edad < 18) {
            System.out.println("No puede votar");
        } else {
            System.out.println("Ingrese un valor valido");
        }

        /**
         * Ejercicio 10: Escribe un programa que determine si un número es divisible por 5.
         */
        numero = 15;

        if (numero % 5 == 0){
            System.out.println("El numero " + numero + " es divisible entre 5");
        }
    }
}
