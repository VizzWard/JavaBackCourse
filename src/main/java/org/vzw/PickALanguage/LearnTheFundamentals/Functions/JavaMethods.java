package org.vzw.PickALanguage.LearnTheFundamentals.Functions;

/**
 * <h1>Java Methods</h1>
 * Un metodo es un bloque de codigo que solo se ejecuta cuando es llamado.
 * Puedes darles datos, conocidos como parametros.
 * Los métodos se utilizan para realizar determinadas acciones, y también se conocen como funciones.
 */
public class JavaMethods { //Clase Principal
    /**
     * <h2>Crea un metodo</h2>
     * Un metodo debe declararse dentro de una clase.
     *  Se define con el nombre del método, seguido de un paréntesis().
     */

    static void MiMetodo(){
        System.out.println("MiMetodo");
    }
    /**
     * static -> significa que el método pertenece a la clase Main y no a un objeto de la clase Main.
     * void ->  significa que este método no tiene valor de retorno.
     * MiMetodo() -> es el nombre del metodo.
     */

    /**
     * <h2>LLama al metodo</h2>
     * Para llamar al metodo escribes el nombre del metodo, seguido de los parentesis '()'.
     */
    public static void main(String[] args) {
        MiMetodo();
    }
}
