package org.vzw.PickALanguage.LearnTheFundamentals.Functions.Ejercicios;

/**
 * Crea un método incrementar que incremente un contador declarado fuera del método.
 */
public class EjMethodScope {
    static int contador = 0; //Variable de alcance a toda la clase

    public static void main(String[] args) {
        incremento();
        incremento();

        System.out.println(contador);
    }

    static void incremento() {
        contador++;
    }
}
