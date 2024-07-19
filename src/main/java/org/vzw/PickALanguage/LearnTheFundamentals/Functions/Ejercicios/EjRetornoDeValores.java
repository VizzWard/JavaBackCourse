package org.vzw.PickALanguage.LearnTheFundamentals.Functions.Ejercicios;

/**
 * Crea un método llamado multiplicar que tome dos parámetros a y b y devuelva el producto de ambos.
 */
public class EjRetornoDeValores {
    public static void main(String[] args) {
        int resultado = multiplicar(4, 6);
        System.out.println(resultado);
    }

    static int multiplicar(int a, int b) {
        return a * b;
    }
    static float multiplicar(float a, float b) {
        return a * b;
    }
}
