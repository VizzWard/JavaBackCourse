package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.FinalKeyword;

/** Uso de final con Métodos */

class ParentClass {
    // Método declarado como final
    final void display() {
        System.out.println("This is a final method in ParentClass.");
    }
}

class ChildClass extends ParentClass {
    // void display() { // Esto generaría un error de compilación, ya que display() es final en la clase padre
    //     System.out.println("Trying to override final method.");
    // }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.display();
    }
}