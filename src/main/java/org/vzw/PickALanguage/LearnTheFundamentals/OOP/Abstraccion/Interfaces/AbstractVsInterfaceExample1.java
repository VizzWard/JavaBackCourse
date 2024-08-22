package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Abstraccion.Interfaces;

/**
 * Ejemplo 1: Clase Abstracta vs Interfaz con Implementaciones Compartidas
 */

abstract class Animal {
    abstract void sound(); // Método abstracto

    void sleep() { // Método no abstracto
        System.out.println("The animal is sleeping");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

interface AnimalInterface {
    void sound();
    void sleep();
}

class DogInterface implements AnimalInterface {
    public void sound() {
        System.out.println("Bark");
    }

    public void sleep() {
        System.out.println("The dog is sleeping");
    }
}

class CatInterface implements AnimalInterface {
    public void sound() {
        System.out.println("Meow");
    }

    public void sleep() {
        System.out.println("The cat is sleeping");
    }
}

public class AbstractVsInterfaceExample1 {
    public static void main(String[] args) {
        // Usando clase abstracta
        Animal dog = new Dog();
        dog.sound();
        dog.sleep();

        // Usando interfaz
        AnimalInterface cat = new CatInterface();
        cat.sound();
        cat.sleep();
    }
}

/**
 * Clase Abstracta: Animal tiene un método abstracto sound() y un método
 * no abstracto sleep(). Las subclases como Dog y Cat implementan sound() y
 * heredan sleep() tal como está.
 *
 * Interfaz: AnimalInterface requiere que las clases que la implementen
 * proporcionen implementaciones para sound() y sleep(). A diferencia de
 * la clase abstracta, no se proporciona ninguna implementación en la interfaz.
 */