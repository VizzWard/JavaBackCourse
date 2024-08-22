package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.InstanceInitializerBlock;

/** Ejemplo Básico de Instance Initializer Block */

class Example1 {
    int value;

    // Instance initializer block
    {
        value = 10;  // Se ejecuta cada vez que se crea un objeto
        System.out.println("Instance Initializer Block 1: value initialized to " + value);
    }

    Example1() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        Example1 obj = new Example1();  // Se ejecuta el bloque de inicialización antes del constructor
    }
}