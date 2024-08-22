package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.InstanceOf;

class Animal4 {
}

class Dog4 extends Animal4 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class DowncastingWithoutInstanceofExample {
    public static void main(String[] args) {
        Animal4 a = new Dog4(); // Upcasting

        Dog4 d = (Dog4) a; // Downcasting sin verificar con instanceof
        d.bark();
    }
}

/*
En este ejemplo, el downcasting se realiza directamente sin verificar con instanceof.
Aunque es seguro en este caso, ya que a es realmente un Dog, si a hubiera sido otra
subclase de Animal (o una instancia de Animal), se habría lanzado una excepción
ClassCastException en tiempo de ejecución.
 */