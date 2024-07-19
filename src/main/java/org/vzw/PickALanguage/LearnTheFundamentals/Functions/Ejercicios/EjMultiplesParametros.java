package org.vzw.PickALanguage.LearnTheFundamentals.Functions.Ejercicios;

/**
 * Crea un método llamado suma que tome dos parámetros a y b y devuelva la suma de ambos.
 */
public class EjMultiplesParametros {

    //Metodo main
    public static void main(String[] args) {
        float resultado = suma(4.5f ,3.2f);
        System.out.println(resultado);

        int resultado2 = suma(4, 3204972);
        System.out.println(resultado2);
    }

    //Metodos de suma
    static int suma(int a, int b) {
        return a + b;
    }
    static float suma(float a, float b) {
        return a + b;
    }
}
