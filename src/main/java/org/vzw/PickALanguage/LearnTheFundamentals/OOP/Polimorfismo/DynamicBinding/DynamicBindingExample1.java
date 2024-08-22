package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.DynamicBinding;

class Animal1 {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog1 extends Animal1 {
    void sound() {
        System.out.println("Bark");
    }
}

public class DynamicBindingExample1 {
    public static void main(String[] args) {
        Animal1 a = new Dog1();
        a.sound(); // Llamada al método sound() dinámicamente ligada
    }
}

/*
   Aquí, a es una referencia de tipo Animal, pero en tiempo de
   ejecución, se liga al método sound() de la clase Dog debido
   al polimorfismo. Esto es un ejemplo de dynamic binding.

 */