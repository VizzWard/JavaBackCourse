package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.Ejemplos;

// Clase de prueba para demostrar el polimorfismo
class TestPolymorphism2 {
    public static void main(String[] args) {
        Animal a;  // Declaración de una referencia de tipo Animal

        // Polimorfismo: la referencia 'a' apunta a un objeto Dog
        a = new Dog();
        a.eat();  // Llama al método eat() de Dog

        // Polimorfismo: la referencia 'a' apunta a un objeto Cat
        a = new Cat();
        a.eat();  // Llama al método eat() de Cat

        // Polimorfismo: la referencia 'a' apunta a un objeto Lion
        a = new Lion();
        a.eat();  // Llama al método eat() de Lion
    }
}

// Clase base con un método que será sobrescrito por las clases derivadas
class Animal {
    void eat() {
        System.out.println("eating...");  // Método que será sobrescrito
    }
}

// Clase Dog que extiende Animal y sobrescribe el método eat()
class Dog extends Animal {
    void eat() {
        System.out.println("eating bread...");
    }
}

// Clase Cat que extiende Animal y sobrescribe el método eat()
class Cat extends Animal {
    void eat() {
        System.out.println("eating rat...");
    }
}

// Clase Lion que extiende Animal y sobrescribe el método eat()
class Lion extends Animal {
    void eat() {
        System.out.println("eating meat...");
    }
}