package org.vzw.PickALanguage.LearnTheFundamentals.Loops.Ejercicios.Extras;

import java.util.Scanner;

public class Calculadora {

    public static Object[] convertirDatos(String input1, String input2) {
        Object[] resultados = new Object[2];
        try {
            resultados[0] = Integer.parseInt(input1);
            resultados[1] = Integer.parseInt(input2);
        } catch (NumberFormatException e1) {
            try {
                resultados[0] = Float.parseFloat(input1);
                resultados[1] = Float.parseFloat(input2);
            } catch (NumberFormatException e2) {
                try {
                    resultados[0] = Double.parseDouble(input1);
                    resultados[1] = Double.parseDouble(input2);
                } catch (NumberFormatException e3) {
                    resultados[0] = null;
                    resultados[1] = null;
                }
            }
        }
        return resultados;
    }

    //Metodos para Enteros
    public static void ejecutarOperacion(int operacion, int num1, int num2) {
        switch (operacion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + ((double) num1 / num2));
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }
    }

    public static void ejecutarOperacion(int operacion, float num1, float num2) {
        switch (operacion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }
    }

    public static void ejecutarOperacion(int operacion, double num1, double num2) {
        switch (operacion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }
    }
}
