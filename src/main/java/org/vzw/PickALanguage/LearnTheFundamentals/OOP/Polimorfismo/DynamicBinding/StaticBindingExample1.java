package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.DynamicBinding;

class Animal {
    static void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    static void sound() {
        System.out.println("Bark");
    }
}

public class StaticBindingExample1 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound(); // Llamada al método sound() estáticamente ligada
    }
}

/*
   el método sound() es static, lo que significa que
   está ligado en tiempo de compilación.
   Aunque el objeto a es de tipo Dog, la llamada a sound()
   se liga a Animal.sound() porque el método es static, y
   la referencia utilizada es de tipo Animal.

 */