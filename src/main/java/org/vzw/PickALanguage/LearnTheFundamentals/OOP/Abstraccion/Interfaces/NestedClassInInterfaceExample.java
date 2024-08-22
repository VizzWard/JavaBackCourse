package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Abstraccion.Interfaces;

/**
 * Ejemplo: Clase Anidada en una Interfaz
 */

interface Vehicle1 {
    void start();

    // Clase anidada dentro de la interfaz Vehicle
    class Engine {
        void run() {
            System.out.println("Engine is running.");
        }
    }
}

class Car1 implements Vehicle1 {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }
}

public class NestedClassInInterfaceExample {
    public static void main(String[] args) {
        // Crear una instancia de la clase anidada
        Vehicle1.Engine engine = new Vehicle1.Engine();
        engine.run();

        // Crear una instancia de la clase Car que implementa la interfaz Vehicle
        Vehicle1 car = new Car1();
        car.start();
    }
}

/**
 * Interfaz Vehicle: Define un método abstracto start() que debe ser implementado
 * por cualquier clase que implemente la interfaz.
 *
 * Clase Anidada Engine: Es una clase anidada estática dentro de la interfaz Vehicle1.
 * Esta clase tiene un método run() que imprime un mensaje indicando que el motor
 * está funcionando.
 *
 * Clase Car1: Implementa la interfaz Vehicle1 y proporciona una implementación para el método start().
 *
 * Uso en main:
 *  - Se crea una instancia de la clase anidada Engine usando la interfaz Vehicle1 como contenedor.
 *  - Se llama al método run() de la clase Engine.
 *  - Se crea una instancia de Car1, que implementa Vehicle1, y se llama al método start().
 */