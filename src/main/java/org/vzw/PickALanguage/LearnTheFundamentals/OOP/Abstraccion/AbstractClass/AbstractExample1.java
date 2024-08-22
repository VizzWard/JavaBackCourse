package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Abstraccion.AbstractClass;

/**
 * Ejemplo 1: Clase Abstracta para Diferentes Tipos de Formas
 *
 * En este ejemplo, se utiliza una clase abstracta para
 * representar diferentes tipos de formas geométricas.
 */

// Clase abstracta Shape que define un método abstracto draw()
abstract class Shape {
    abstract void draw(); // Método abstracto que las subclases deben implementar

    void fillColor() { // Método no abstracto que puede ser utilizado por las subclases
        System.out.println("Filling shape with color");
    }
}

// Clase Circle que hereda de Shape e implementa el método draw()
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Clase Rectangle que hereda de Shape e implementa el método draw()
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class AbstractExample1 {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw();
        shape1.fillColor();

        shape2.draw();
        shape2.fillColor();
    }
}

/**
 * La clase abstracta Shape define un método abstracto draw()
 * que es implementado por las subclases Circle y Rectangle.
 *
 * El método fillColor() es un método común que puede ser usado
 * por todas las subclases sin necesidad de ser sobrescrito.
 */