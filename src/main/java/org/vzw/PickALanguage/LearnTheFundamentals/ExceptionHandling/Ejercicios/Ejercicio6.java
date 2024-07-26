package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Ejercicios;

/**
 * Ejercicio 6:
 * Diseña un programa con varios métodos que realicen operaciones aritméticas.
 * Haz que una excepción se propague a través de varios métodos hasta el main.
 *
 * Instrucciones:
 * Completa el programa para que la excepción se propague desde method3 hasta
 * el main, y maneja la excepción en el main.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e){
            System.out.println("Division matematicamente imposible");
        }
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        method3();
    }

    public static void method3() {
        int result = 10 / 0; // Lanza una excepción aquí
    }
}
