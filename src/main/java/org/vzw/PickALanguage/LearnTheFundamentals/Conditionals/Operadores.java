package org.vzw.PickALanguage.LearnTheFundamentals.Conditionals;

public class Operadores {
    public static void main(String[] args) {
        /**
         * Los operadores en Java son símbolos especiales que se utilizan para realizar
         * operaciones sobre variables y valores. Java proporciona varios tipos de operadores:
         * aritméticos, relacionales, lógicos, de asignación, y más.
         *
         * Aquí tienes una lista de los diferentes operadores en Java:
         */

        /** Operadores Aritméticos: */

         int a = 10;
         int b = 5;
         int suma = a + b;           // Operador de suma: +
         int resta = a - b;          // Operador de resta: -
         int multiplicacion = a * b; // Operador de multiplicación: *
         int division = a / b;       // Operador de división: /
         int modulo = a % b;         // Operador de módulo (resto de división): %
         int incremento = ++a;       // Operador de incremento: ++
         int decremento = --a;       // Operador de decremento: --


        /** Operadores Relacionales: */

         int c = 10;
         int d = 5;
         boolean igual = (c == d);      // Operador de igualdad: ==
         boolean diferente = (c != d);  // Operador de desigualdad: !=
         boolean mayor = (c > d);       // Operador de mayor que: >
         boolean menor = (c < d);       // Operador de menor que: <
         boolean mayorOIgual = (c >= d);// Operador de mayor o igual que: >=
         boolean menorOIgual = (c <= d);// Operador de menor o igual que: <=


        /** Operadores Lógicos: */

         boolean e = true;
         boolean f = false;
         boolean yLogico = (e && f);    // Operador AND lógico: &&
         boolean oLogico = (e || f);    // Operador OR lógico: ||
         boolean noLogico = !e;         // Operador NOT lógico: !


        /** Operadores de Asignación: */

         int g = 10;
         g += 5;   // Operador de asignación suma: += (equivale a a = a + 5)
         g -= 5;   // Operador de asignación resta: -= (equivale a a = a - 5)
         g *= 5;   // Operador de asignación multiplicación: *= (equivale a a = a * 5)
         g /= 5;   // Operador de asignación división: /= (equivale a a = a / 5)
         g %= 5;   // Operador de asignación módulo: %= (equivale a a = a % 5)


        /** Operadores de Comparación Bit a Bit: */

         int h = 5; // 0101 en binario
         int i = 3; // 0011 en binario
         int yBit = h & i; // AND bit a bit: 0001 (1 en decimal)
         int oBit = h | i; // OR bit a bit: 0111 (7 en decimal)
         int xorBit = h ^ i; // XOR bit a bit: 0110 (6 en decimal)
         int complemento = ~h; // Complemento bit a bit: 1010 (en binario, -6 en decimal, considerando el bit de signo)
         int desplazaIzq = h << 1; // Desplazamiento a la izquierda: 1010 (10 en decimal)
         int desplazaDer = h >> 1; // Desplazamiento a la derecha: 0010 (2 en decimal)
    }
}
