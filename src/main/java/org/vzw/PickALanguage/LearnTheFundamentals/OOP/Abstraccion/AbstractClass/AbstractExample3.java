package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Abstraccion.AbstractClass;

/**
 * Ejemplo 3: Clase Abstracta para Definir Animales y sus Sonidos
 *
 * En este ejemplo, una clase abstracta se utiliza para definir animales y el sonido que producen.
 */

// Clase abstracta Animal que define un método abstracto makeSound()
abstract class Animal {
    abstract void makeSound(); // Método abstracto que las subclases deben implementar

    void sleep() { // Método no abstracto
        System.out.println("The animal is sleeping");
    }
}

// Clase Dog que hereda de Animal e implementa el método makeSound()
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog says: Woof Woof");
    }
}

// Clase Cat que hereda de Animal e implementa el método makeSound()
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat says: Meow");
    }
}

public class AbstractExample3 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myDog.sleep();

        myCat.makeSound();
        myCat.sleep();
    }
}

/**
 * La clase abstracta Animal tiene un método abstracto makeSound()
 * que las subclases Dog y Cat deben implementar.
 *
 * El método sleep() es común a todas las subclases y no necesita ser sobrescrito.
 */