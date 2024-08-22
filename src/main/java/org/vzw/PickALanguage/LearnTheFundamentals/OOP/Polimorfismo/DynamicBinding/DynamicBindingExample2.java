package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.DynamicBinding;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class DynamicBindingExample2 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw(); // Llamada al método draw() dinámicamente ligada
    }
}

/*
   En este ejemplo, s es de tipo Shape, pero apunta a un objeto de
   tipo Circle. En tiempo de ejecución, la llamada al método draw()
   se liga al método sobrescrito en Circle, demostrando dynamic binding.

 */