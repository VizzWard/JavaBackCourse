package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.InstanceOf;

class Animal3 {
}

class Dog3 extends Animal3 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal3 {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class DowncastingWithInstanceofExample2 {
    public static void main(String[] args) {
        Animal3[] animals = {new Dog3(), new Cat()};

        for (Animal3 a : animals) {
            if (a instanceof Dog3) {
                Dog3 d = (Dog3) a; // Downcasting a Dog
                d.bark();
            } else if (a instanceof Cat) {
                Cat c = (Cat) a; // Downcasting a Cat
                c.meow();
            }
        }
    }
}

/*
En este ejemplo, se utiliza un array de Animal, y se verifica cada
elemento con instanceof antes de realizar el downcasting para llamar
a los métodos específicos de Dog o Cat.
 */