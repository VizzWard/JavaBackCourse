package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Herencia;

/**
 * Multiple Inheritance (Herencia Múltiple)
 *
 * Java no soporta herencia múltiple a través de clases
 * (es decir, una clase no puede heredar de más de una clase a la vez),
 * pero esto se puede lograr mediante interfaces.
 */

public class MultipleInheritance {
    public static void main(String[] args) {
        Pato miPato = new Pato();
        miPato.volar(); // Método de la interfaz Volador
        miPato.nadar(); // Método de la interfaz Nadador
    }
}


// Interface 1
interface Volador {
    void volar();
}

// Interface 2
interface Nadador {
    void nadar();
}

// Clase que implementa ambas interfaces
class Pato implements Volador, Nadador {
    public void volar() {
        System.out.println("El pato está volando");
    }

    public void nadar() {
        System.out.println("El pato está nadando");
    }
}

/*
 * En herencia múltiple usando interfaces, `Pato` implementa tanto `Volador` como `Nadador`.
 * Esto permite que `Pato` tenga los métodos de ambas interfaces.
 */
