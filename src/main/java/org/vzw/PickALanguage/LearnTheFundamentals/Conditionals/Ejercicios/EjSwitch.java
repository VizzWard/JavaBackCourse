package org.vzw.PickALanguage.LearnTheFundamentals.Conditionals.Ejercicios;

public class EjSwitch {
    public static void main(String[] args) {
        /**
         * Ejercicio 1: Escribe un programa que imprima el nombre del día de la semana dado un número del 1 al 7.
         */
        int dia = 4;

        switch (dia) {
            case 1:
                System.out.println("Hoy es  Lunes");
                break;
            case 2:
                System.out.println("Hoy es Martes");
                break;
            case 3:
                System.out.println("Hoy es Miercoles");
                break;
            case 4:
                System.out.println("Hoy es Jueves");
                break;
            case 5:
                System.out.println("Hoy es Viernes");
                break;
            case 6:
                System.out.println("Hoy es Sabado");
                break;
            case 7:
                System.out.println("Hoy es Domingo");
                break;
            default:
                System.out.println("Ingresa un valor valido");
        }

        /**
         * Ejercicio 2: Escribe un programa que imprima el nombre del mes dado un número del 1 al 12.
         */
        int mes = 7;
        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Ingresa un valor valido");
        }

        /**
         *  Ejercicio 3: Escribe un programa que imprima la estación del año
         *  (primavera, verano, otoño, invierno) dado un número del 1 al 4.
         */
        int estacion = 3;

        switch (estacion) {
            case 1:
                System.out.println("Inivierno");
                break;
            case 2:
                System.out.println("Primavera");
                break;
            case 3:
                System.out.println("Verano");
                break;
            case 4:
                System.out.println("Otoño");
                break;
            default:
                System.out.println("Ingresa un valor valido");
        }

        /**
         *  Ejercicio 4: Escribe un programa que imprima la categoría de un alumno
         *  (Excelente, Bueno, Suficiente, Insuficiente) dada su calificación.
         */
        int calificacion = 3;

        if (calificacion > 0 && calificacion <= 10) {
            switch (calificacion) {
                case 10:
                    System.out.println("Excelente");
                    break;
                case 9:
                case 8:
                    System.out.println("Bueno");
                    break;
                case 7:
                case 6:
                    System.out.println("Suficiente");
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                    System.out.println("Insuficiente");
                    break;
                default:
                    System.out.println("Ingresa un valor valido");
            }
        }

        /**
         *  Ejercicio 5: Escribe un programa que imprima el tipo de una fruta (Tipo A, Tipo B, Tipo C)
         *  dado su nombre (Manzana, Pera, Naranja, etc.).
         */
        String fruta = "Manzana";

        switch (fruta) {
            case "Manzana":
            case "Naranja":
            case "Ciruela":
            case "Damasco":
            case "Durazno":
                System.out.println("La fruta " + fruta + " es Tipo A");
                break;
            case "Banana":
            case "Uva":
            case "Higo":
            case "Platano":
                System.out.println("La fruta " + fruta + " es Tipo B");
                break;
            case "Melon":
            case "Kiwi":
            case "Mango":
            case "Papaya":
            case "Piña":
                System.out.println("La fruta " + fruta + " es Tipo C");
                break;
        }

    }
}
