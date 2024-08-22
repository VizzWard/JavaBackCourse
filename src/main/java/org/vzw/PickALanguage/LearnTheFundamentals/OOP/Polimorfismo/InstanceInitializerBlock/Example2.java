package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.InstanceInitializerBlock;

/** Uso de Múltiples Instance Initializer Blocks */

class Example2 {
    int value;

    // Primer instance initializer block
    {
        value = 5;
        System.out.println("Instance Initializer Block 1: value initialized to " + value);
    }

    // Segundo instance initializer block
    {
        value *= 2;
        System.out.println("Instance Initializer Block 2: value doubled to " + value);
    }

    Example2() {
        System.out.println("Constructor called, final value: " + value);
    }

    public static void main(String[] args) {
        Example2 obj = new Example2();  // Ambos bloques de inicialización se ejecutan antes del constructor
    }
}