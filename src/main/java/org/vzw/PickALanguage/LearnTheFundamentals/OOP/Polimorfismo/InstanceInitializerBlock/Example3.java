package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.InstanceInitializerBlock;

/** Instance Initializer Block con Variables Estáticas y No Estáticas */

class Example3 {
    static int staticValue;
    int instanceValue;

    // Instance initializer block
    {
        instanceValue = 20;
        System.out.println("Instance Initializer Block: instanceValue initialized to " + instanceValue);
    }

    // Static initializer block (para comparación)
    static {
        staticValue = 50;
        System.out.println("Static Initializer Block: staticValue initialized to " + staticValue);
    }

    Example3() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        Example3 obj1 = new Example3();  // Se ejecuta el bloque estático una vez, luego el bloque de instancia y el constructor
        Example3 obj2 = new Example3();  // Solo se ejecuta el bloque de instancia y el constructor, no el bloque estático
    }
}