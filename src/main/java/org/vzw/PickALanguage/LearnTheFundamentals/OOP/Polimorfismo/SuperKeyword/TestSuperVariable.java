package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.SuperKeyword;

// Clase base con una variable de instancia 'name'
class Animal {
    String name = "Animal";

    // Método para mostrar el nombre del animal
    void displayName() {
        System.out.println("Name: " + name);
    }
}

// Subclase que tiene una variable de instancia 'name' con el mismo nombre que la clase padre
class Dog extends Animal {
    String name = "Dog";

    // Método para mostrar el nombre usando 'super' para referirse a la variable de la clase padre
    void displayNames() {
        System.out.println("Child class name: " + name);   // Muestra la variable 'name' de la subclase
        System.out.println("Parent class name: " + super.name);  // Muestra la variable 'name' de la clase padre
    }
}

// Clase de prueba
public class TestSuperVariable {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayNames();
    }
}