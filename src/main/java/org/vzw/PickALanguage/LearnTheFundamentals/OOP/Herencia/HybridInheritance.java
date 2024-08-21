package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Herencia;

/**
 *  Hybrid Inheritance (Herencia Híbrida)
 *
 *  La herencia híbrida es una combinación de más de un tipo de herencia.
 *  Aunque Java no soporta herencia múltiple de clases, se puede combinar
 *  la herencia jerárquica y la implementación múltiple de interfaces.
 */

public class HybridInheritance {
    public static void main(String[] args) {
        Chihuahua miChihuahua = new Chihuahua();

        miChihuahua.comer();       // Método heredado de la clase Animal
        miChihuahua.ladrar();      // Método heredado de la clase Perro
        miChihuahua.serDomestico();// Método implementado de la interfaz Domestico
    }
}

// Clase Padre
class Animal3 {
    void comer() {
        System.out.println("El animal está comiendo");
    }
}

// Clase Hija 1
class Perro3 extends Animal3 {
    void ladrar() {
        System.out.println("El perro está ladrando");
    }
}

// Clase Hija 2
class Gato1 extends Animal3 {
    void maullar() {
        System.out.println("El gato está maullando");
    }
}

// Interface
interface Domestico {
    void serDomestico();
}

// Clase Nieta que hereda y también implementa una interfaz
class Chihuahua extends Perro3 implements Domestico {
    public void serDomestico() {
        System.out.println("El chihuahua es un perro doméstico");
    }
}

/*
 * En la herencia híbrida, `Chihuahua` hereda de `Perro` (que a su vez hereda de `Animal`)
 * y también implementa la interfaz `Domestico`. Esto permite que `Chihuahua` combine herencia jerárquica
 * con herencia múltiple de interfaces.
 */
