package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Abstraccion.Interfaces;

/**
 * Ejemplo 3: Uso de Interfaz para Definir Métodos de Movimiento
 */

interface Movable {
    void move();
}

class Car implements Movable {
    public void move() {
        System.out.println("The car is moving.");
    }
}

class Bicycle implements Movable {
    public void move() {
        System.out.println("The bicycle is moving.");
    }
}

public class InterfaceExample3 {
    public static void main(String[] args) {
        Movable car = new Car();
        Movable bicycle = new Bicycle();

        car.move();
        bicycle.move();
    }
}

/**
 * La interfaz Movable define un método move.
 *
 * Las clases Car y Bicycle implementan la interfaz
 * proporcionando su propia implementación del método move.
 */