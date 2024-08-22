package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Abstraccion.Interfaces;

/**
 * Ejemplo: Interfaz Anidada para Definir Acciones de un Vehículo
 */

class Vehicle {
    // Interfaz anidada dentro de la clase Vehicle
    interface Control {
        void accelerate();
        void brake();
    }

    // Clase que implementa la interfaz anidada
    class Car implements Control {
        public void accelerate() {
            System.out.println("Car is accelerating.");
        }

        public void brake() {
            System.out.println("Car is braking.");
        }
    }

    // Clase que implementa la interfaz anidada
    class Bicycle implements Control {
        public void accelerate() {
            System.out.println("Bicycle is accelerating.");
        }

        public void brake() {
            System.out.println("Bicycle is braking.");
        }
    }

    void testControls() {
        Control carControl = new Car();
        carControl.accelerate();
        carControl.brake();

        Control bicycleControl = new Bicycle();
        bicycleControl.accelerate();
        bicycleControl.brake();
    }
}

public class NestedInterfaceExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.testControls();
    }
}

/**
 * La clase Vehicle tiene una interfaz anidada Control que define los métodos accelerate y brake.
 *
 * Las clases internas Car y Bicycle implementan la interfaz Control, proporcionando sus propias
 * implementaciones para los métodos.
 *
 * El método testControls dentro de Vehicle crea instancias de estas clases y las usa para simular
 * las acciones de un vehículo.
 */