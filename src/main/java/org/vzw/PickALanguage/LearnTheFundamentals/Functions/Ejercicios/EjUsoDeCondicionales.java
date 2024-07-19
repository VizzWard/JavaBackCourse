package org.vzw.PickALanguage.LearnTheFundamentals.Functions.Ejercicios;

/**
 * Crea un método llamado esPar que tome un número entero como parámetro y
 * devuelva true si el número es par, y false si es impar.
 */
public class EjUsoDeCondicionales {
    public static void main(String[] args) {
        boolean par = esPar(5);
        if (par){
            System.out.println("Es Par");
        } else {
            System.out.println("Es Impar");
        }
    }

    static boolean esPar(int numero){
        return numero % 2 == 0;
    }
}
