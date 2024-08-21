package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Herencia;

/**
 * Hierarchical Inheritance (Herencia Jerárquica)
 *
 * En la herencia jerárquica, una sola clase padre (superclase) es heredada por múltiples
 * clases hijas (subclases). Esto crea una estructura donde varias subclases comparten
 * las características de una única superclase.
 *
 * - Permite que diferentes subclases compartan código común definido en una superclase,
 *   mientras que cada subclase puede tener sus propias características adicionales.
 *
 * - Es útil cuando diferentes clases tienen comportamientos comunes que pueden ser
 *   abstractos en una superclase.
 */

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Perro2 miPerro = new Perro2();
        Gato miGato = new Gato();

        miPerro.comer();  // Método heredado de la clase Animal
        miPerro.ladrar(); // Método propio de la clase Perro

        miGato.comer();   // Método heredado de la clase Animal
        miGato.maullar(); // Método propio de la clase Gato
    }
}

// Clase Padre
class Animal2 {
    void comer() {
        System.out.println("El animal está comiendo");
    }
}

// Clase Hija 1
class Perro2 extends Animal2 {
    void ladrar() {
        System.out.println("El perro está ladrando");
    }
}

// Clase Hija 2
class Gato extends Animal2 {
    void maullar() {
        System.out.println("El gato está maullando");
    }
}

/*
 * En la herencia jerárquica, tanto `Perro` como `Gato` heredan de `Animal`.
 * Esto significa que ambas clases hijas tienen acceso a los métodos de `Animal`.
 */