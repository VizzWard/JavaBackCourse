package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.InstanceInitializerBlock;

class Example {
    static int staticValue;
    int instanceValue;

    // Static Initializer Block
    static {
        staticValue = 50;
        System.out.println("Static Initializer Block: staticValue initialized to " + staticValue);
    }

    // Instance Initializer Block
    {
        instanceValue = 20;
        System.out.println("Instance Initializer Block: instanceValue initialized to " + instanceValue);
    }

    Example() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        Example obj1 = new Example(); // Se ejecuta primero el bloque estático, luego el bloque de instancia, luego el constructor
        Example obj2 = new Example(); // Se ejecuta solo el bloque de instancia y el constructor (el bloque estático no se repite)
    }
}