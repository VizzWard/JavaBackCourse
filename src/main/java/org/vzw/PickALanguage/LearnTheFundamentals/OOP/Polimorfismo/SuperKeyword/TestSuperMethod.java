package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.SuperKeyword;

// Clase base con un método 'sound'
class Animal1 {
    void sound() {
        System.out.println("Animal is making a sound");
    }
}

// Subclase que sobrescribe el método 'sound'
class Dog1 extends Animal1 {
    void sound() {
        System.out.println("Dog is barking");
    }

    // Método que utiliza 'super' para invocar el método 'sound' de la clase padre
    void makeSound() {
        super.sound();  // Llama al método 'sound' de la clase padre
        sound();  // Llama al método 'sound' de la subclase
    }
}

// Clase de prueba
public class TestSuperMethod {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.makeSound();
    }
}