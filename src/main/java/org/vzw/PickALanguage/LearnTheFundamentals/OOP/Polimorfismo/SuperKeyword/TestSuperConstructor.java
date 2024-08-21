package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.SuperKeyword;

// Clase base con un constructor que toma un parámetro
class Animal2 {
    Animal2(String name) {
        System.out.println("Animal constructor called. Name: " + name);
    }
}

// Subclase que tiene su propio constructor y usa 'super()' para invocar al constructor de la clase padre
class Dog2 extends Animal2 {
    Dog2(String name) {
        super(name);  // Llama al constructor de la clase padre con 'super'
        System.out.println("Dog constructor called");
    }
}

// Clase de prueba
public class TestSuperConstructor {
    public static void main(String[] args) {
        Dog2 d = new Dog2("Buddy");
    }
}
