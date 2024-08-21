package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Herencia;

/**
 * Multilevel Inheritance (Herencia Multinivel)
 *
 * La herencia multinivel ocurre cuando una clase hija hereda de otra clase hija,
 * formando una cadena de herencia. Aquí, una clase es derivada de otra que ya es
 * una subclase.
 *
 * - En este tipo de herencia, las características de una clase son pasadas a otra
 *   clase a lo largo de múltiples niveles.
 *
 * - Permite la extensión gradual de funcionalidades a través de múltiples niveles de herencia.
 */

class MultilevelInheritance {
    public static void main(String[] args) {
        Cachorro miCachorro = new Cachorro();
        miCachorro.comer();  // Método heredado de la clase Animal
        miCachorro.ladrar(); // Método heredado de la clase Perro
        miCachorro.jugar();  // Método propio de la clase Cachorro
    }
}

// Clase Padre
class Animal1 {
    void comer() {
        System.out.println("El animal está comiendo");
    }
}

// Clase Hija
class Perro1 extends Animal1 {
    void ladrar() {
        System.out.println("El perro está ladrando");
    }
}

// Clase Nieta
class Cachorro extends Perro1 {
    void jugar() {
        System.out.println("El cachorro está jugando");
    }
}

/*
 * En la herencia multinivel, `Cachorro` hereda de `Perro`, y `Perro` hereda de `Animal`.
 * Esto permite que `Cachorro` acceda a los métodos de `Animal` y `Perro`.
 */
