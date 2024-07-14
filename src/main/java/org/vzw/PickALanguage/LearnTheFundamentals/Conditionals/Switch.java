package org.vzw.PickALanguage.LearnTheFundamentals.Conditionals;

public class Switch {
    public static void main(String[] args) {
        /**
         * La declaración switch en Java se utiliza para ejecutar uno de varios bloques de código
         * según el valor de una expresión. Es una alternativa a utilizar múltiples declaraciones
         * if-else if cuando se necesita evaluar la misma variable contra diferentes valores.
         *
         * La sintaxis básica de switch es:
         *
         * <pre>
         * {@code
         * switch (expresión) {
         *     case valor1:
         *         // Bloque de código para el caso valor1
         *         break;
         *     case valor2:
         *         // Bloque de código para el caso valor2
         *         break;
         *     // Puedes tener tantos casos como necesites
         *     default:
         *         // Bloque de código si ninguno de los casos anteriores coincide
         * }
         * }
         * </pre>
         *
         * A continuación se presentan dos ejemplos de uso de switch: uno con una sola condición y
         * otro con varias condiciones.
         */


         // Ejemplo 1: Uso básico de switch con una sola condición.
         int dia = 3;

         switch (dia) {
             case 1:
                 System.out.println("Lunes");
                 break;
             case 2:
                 System.out.println("Martes");
                 break;
             case 3:
                 System.out.println("Miércoles");
                 break;
             case 4:
                 System.out.println("Jueves");
                 break;
             case 5:
                 System.out.println("Viernes");
                 break;
             case 6:
                 System.out.println("Sábado");
                 break;
             case 7:
                 System.out.println("Domingo");
                 break;
             default:

         }

         //Ejemplo 2: Uso de switch con múltiples condiciones en un caso.

        int calificacion = 4;

        switch (calificacion) {
            case 10:
            case 9:
                System.out.println("Excelente");
                break;
            case 8:
            case 7:
                System.out.println("Bueno");
                break;
            case 6:
            case 5:
                System.out.println("Suficiente");
                break;
            default:
                System.out.println("Insuficiente");
        }

    }
}
