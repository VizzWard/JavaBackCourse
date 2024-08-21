package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Herencia;

/**
 * Single Inheritance (Herencia Simple)
 *
 * La herencia simple es el tipo más básico de herencia, donde una clase hija (subclase) hereda directamente de una
 * sola clase padre (superclase). Esto significa que la subclase obtiene todas las propiedades (atributos) y
 * comportamientos (métodos) de la superclase.
 */

class SingleInheritance {
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        miPerro.comer();  // Método heredado de la clase Animal
        miPerro.ladrar(); // Método propio de la clase Perro
    }
}

// Clase Padre
class Animal {
    void comer() {
        System.out.println("El animal está comiendo");
    }
}

// Clase Hija
class Perro extends Animal {
    void ladrar() {
        System.out.println("El perro está ladrando");
    }
}

/*
 * En la herencia simple, `Perro` hereda de `Animal`.
 * Esto significa que `Perro` puede usar los métodos y atributos de `Animal`.
 */
