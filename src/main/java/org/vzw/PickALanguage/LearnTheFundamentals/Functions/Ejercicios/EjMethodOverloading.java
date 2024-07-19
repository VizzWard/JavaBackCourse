package org.vzw.PickALanguage.LearnTheFundamentals.Functions.Ejercicios;

/**
 * Crea dos métodos llamados imprimir que tomen diferentes tipos de
 * parámetros, uno que tome un String y otro que tome un int.
 */
public class EjMethodOverloading {
    public static void main(String[] args) {
        int num = imprimir(3);
        System.out.println(num);

        String cadena = imprimir("Si");
        System.out.println(cadena);
    }
    static int imprimir(int a){
        return a + 1;
    }
    static String imprimir(String a){
        return a + ", no";
    }
}
