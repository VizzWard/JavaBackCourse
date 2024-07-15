package org.vzw.PickALanguage.LearnTheFundamentals.Conditionals.Ejercicios;

public class EjOperadores {
    public static void main(String[] args) {
        /** OPERADORES ARITMETICOS */

        /**
         *  Ejercicio 1: Escribe un programa que calcule el área de un círculo dado su radio.
         */
        int radio = 5;
        float pi = 3.14f;
        float area = pi * (radio * radio);
        System.out.println("Area: " + area);

        System.out.println(" ");
        /**
         *  Ejercicio 2: Escribe un programa que convierta una temperatura dada en grados Celsius a grados Fahrenheit
         */
        float celcius = 27;
        float farenheit = (celcius * 9/5) + 32;
        System.out.println("Farenheit: " + farenheit);

        System.out.println(" ");
        /**
         *  Ejercicio 3: Escribe un programa que calcule el perímetro de un rectángulo dados su ancho y altura.
         */
        float altura = 20;
        float base = 10;
        float perimetro = (altura * 2) + (base * 2);
        System.out.println("Perimetro: " + perimetro);

        System.out.println(" ");
        /** OPERADORES RELACIONALES */

        /**
         *  Ejercicio 1: Escribe un programa que compare dos números y determine si son iguales.
         */
        int num1 = 3;
        int num2 = 3;
        boolean comparar = num1 == num2;
        System.out.println("Comparar: " + comparar);

        System.out.println(" ");
        /**
         *  Ejercicio 2: Escribe un programa que determine si una persona es adolescente (entre 13 y 19 años).
         */
        int edad = 14;
        boolean adolecente = edad >= 13 && edad <= 19;
        System.out.println("adolecente: " + adolecente);

        System.out.println(" ");
        /**
         *  Ejercicio 3: Escribe un programa que verifique si un número está dentro de un rango (10 a 20 inclusive).
         */
        int numero = 21;
        boolean rango = numero >= 10 && numero <= 20;
        System.out.println("Rango: " + rango);

        System.out.println(" ");
        /** OPERADORES LOGICOS*/

        /**
         *  Ejercicio 1: Escribe un programa que determine si una persona puede recibir un descuento.
         *  El descuento se aplica si la persona tiene más de 65 años o es estudiante.
         */
        int age = 21;
        String occupation = "Student";

        boolean descuento = age > 65 || occupation == "Student";
        System.out.println("Descuento: " + descuento);

        System.out.println(" ");
        /**
         *  Ejercicio 2: Escribe un programa que determine si un año es bisiesto. Un año es bisiesto
         *  si es divisible por 4, pero no por 100, a menos que también sea divisible por 400.
         */
        int year = 2024;
        boolean bisiesto = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        System.out.println("Bisiesto: " + bisiesto);

        System.out.println(" ");
        /**
         *  Ejercicio 3: Escribe un programa que verifique si una contraseña ingresada es correcta y
         *  si el usuario ha activado la autenticación de dos factores.
         */
        String password = "1234qwerty";
        boolean a2f = false;
        boolean verificacion = password.equals("1234qwerty") && a2f;
        System.out.println("Verificacion: " + verificacion);
    }
}
