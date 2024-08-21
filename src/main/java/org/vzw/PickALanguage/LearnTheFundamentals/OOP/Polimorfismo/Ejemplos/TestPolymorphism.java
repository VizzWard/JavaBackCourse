package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.Ejemplos;

// Clase de prueba para demostrar el polimorfismo
class TestPolymorphism {
    public static void main(String args[]) {
        Shape s;  // Declaración de una referencia de tipo Shape

        // Polimorfismo: la referencia 's' apunta a un objeto Rectangle
        s = new Rectangle();
        s.draw();  // Llama al método draw() de Rectangle

        // Polimorfismo: la referencia 's' apunta a un objeto Circle
        s = new Circle();
        s.draw();  // Llama al método draw() de Circle

        // Polimorfismo: la referencia 's' apunta a un objeto Triangle
        s = new Triangle();
        s.draw();  // Llama al método draw() de Triangle
    }
}

// Clase base con un método que será sobrescrito por las clases derivadas
class Shape {
    void draw() {
        System.out.println("drawing...");  // Método que será sobrescrito
    }
}

// Clase Rectangle que extiende Shape y sobrescribe el método draw()
class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle...");
    }
}

// Clase Circle que extiende Shape y sobrescribe el método draw()
class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle...");
    }
}

// Clase Triangle que extiende Shape y sobrescribe el método draw()
class Triangle extends Shape {
    void draw() {
        System.out.println("drawing triangle...");
    }
}
