package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.InstanceOf;

class Animal2 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class DowncastingWithInstanceofExample1 {
    public static void main(String[] args) {
        Animal2 a = new Dog2();

        // Verificar si 'a' es una instancia de Dog antes de hacer downcasting
        if (a instanceof Dog2) {
            Dog2 d = (Dog2) a; // Downcasting seguro
            d.bark();
        }
    }
}

/*
Aquí, a es un Animal, pero también es un Dog. instanceof verifica esto
antes de realizar el downcasting, permitiendo un acceso seguro al método bark().
 */