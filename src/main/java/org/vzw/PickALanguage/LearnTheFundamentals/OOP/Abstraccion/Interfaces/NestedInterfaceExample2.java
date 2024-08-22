package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Abstraccion.Interfaces;

/**
 * Ejemplo: Interfaz Anidada para Definir una Forma y sus Propiedades
 */

interface Shape {
    void draw();

    // Interfaz anidada dentro de la interfaz Shape
    interface Properties {
        double area();
        double perimeter();
    }
}

class Circle implements Shape, Shape.Properties {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape, Shape.Properties {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

public class NestedInterfaceExample2 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.draw();

        Shape.Properties circleProps = (Shape.Properties) circle;
        System.out.println("Circle Area: " + circleProps.area());
        System.out.println("Circle Perimeter: " + circleProps.perimeter());

        Shape rectangle = new Rectangle(4, 6);
        rectangle.draw();

        Shape.Properties rectangleProps = (Shape.Properties) rectangle;
        System.out.println("Rectangle Area: " + rectangleProps.area());
        System.out.println("Rectangle Perimeter: " + rectangleProps.perimeter());
    }
}

/**
 * Interfaz Shape: Define un método draw() que debe ser implementado por cualquier
 * clase que represente una forma.
 *
 * Interfaz Properties: Es una interfaz anidada dentro de Shape y define los métodos
 * area() y perimeter(). Estas propiedades deben ser implementadas por cualquier
 * clase que quiera proporcionar detalles sobre el área y el perímetro de una forma.
 *
 * Clase Circle: Implementa tanto la interfaz Shape como la interfaz Shape.Properties,
 * lo que significa que debe proporcionar implementaciones para los métodos draw(),
 * area(), y perimeter().
 *
 * Clase Rectangle: Al igual que Circle, implementa tanto Shape como Shape.Properties y
 * proporciona implementaciones para los métodos draw(), area(), y perimeter().
 *
 * Uso en main: Se crean instancias de Circle y Rectangle, se llaman a sus métodos, y
 * se muestra el área y el perímetro de cada forma.
 */