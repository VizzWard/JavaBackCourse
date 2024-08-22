package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.InstanceOf;

interface Animal1 {
}

class Dog1 implements Animal1 {
}

public class InstanceofExample2 {
    public static void main(String[] args) {
        Animal1 a = new Dog1();

        // Verificar si 'a' es una instancia de Dog
        if (a instanceof Dog1) {
            System.out.println("a es una instancia de Dog");
        }

        // Verificar si 'a' es una instancia de Animal
        if (a instanceof Animal1) {
            System.out.println("a es una instancia de Animal");
        }
    }
}

/*
Aquí, a es una instancia de Dog, que implementa la interfaz Animal.
Por lo tanto, a instanceof Dog y a instanceof Animal son true.
 */