package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Association;

/**
 * Ejemplo de "has-a" (Composición)
 *
 * Este tipo de asociación representa una relación de
 * propiedad fuerte donde una clase contiene otra clase.
 */

// Clase Engine que representa un motor
class Engine {
    void start() {
        System.out.println("Engine is starting...");
    }
}

// Clase Car que tiene un motor (composición)
class Car {
    private Engine engine; // Car "has-a" Engine

    Car() {
        // Creando una instancia de Engine dentro de Car
        engine = new Engine();
    }

    void startCar() {
        engine.start(); // Delegando la llamada al método start() de Engine
        System.out.println("Car is starting...");
    }
}

public class HasAExampleComposition {
    public static void main(String[] args) {
        // Crear un objeto de la clase Car
        Car car = new Car();

        // Aquí se aplica la relación "has-a"
        // Un Car "has-a" Engine
        car.startCar();
    }
}

/**
 * "has-a": La clase Car tiene una instancia de Engine, lo que
 * significa que Car "has-a" Engine. Esta es una relación de
 * composición, ya que el motor es parte integral del coche, y
 * el ciclo de vida del motor está completamente controlado por
 * el coche.
 */