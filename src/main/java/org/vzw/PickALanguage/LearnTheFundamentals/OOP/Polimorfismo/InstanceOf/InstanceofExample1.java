package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.InstanceOf;

class Animal {
}

class Dog extends Animal {
}

public class InstanceofExample1 {
    public static void main(String[] args) {
        Animal a = new Dog();

        // Verificar si 'a' es una instancia de Dog
        if (a instanceof Dog) {
            System.out.println("a es una instancia de Dog");
        }

        // Verificar si 'a' es una instancia de Animal
        if (a instanceof Animal) {
            System.out.println("a es una instancia de Animal");
        }
    }
}

/*
En este ejemplo, a es una instancia de Dog, por lo que tanto a
instanceof Dog como a instanceof Animal devuelven true.
 */