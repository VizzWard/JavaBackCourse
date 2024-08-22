package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Association;

/**
 * Ejemplo de "is-a" (Herencia)
 *
 * Este tipo de asociación representa una relación de herencia,
 * donde una clase es un tipo específico de otra clase.
 */

// Clase base
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Clase derivada que hereda de Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class IsAExample {
    public static void main(String[] args) {
        // Crear un objeto de la clase Dog
        Dog dog = new Dog();

        // Aquí se aplica la relación "is-a"
        // Un Dog "is-a" Animal
        dog.eat(); // Heredado de Animal
        dog.bark(); // Método específico de Dog
    }
}

/**
 * is-a": La clase Dog es un tipo de Animal.
 * Esto se conoce como una relación de herencia,
 * donde Dog hereda los atributos y métodos de Animal.
 * Por lo tanto, Dog "is-a" Animal.
 */