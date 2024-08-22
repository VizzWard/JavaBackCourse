package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.InstanceOf;

public class InstanceofWithNullExample {
    public static void main(String[] args) {
        Dog d = null;

        // Verificar si 'd' es una instancia de Dog
        if (d instanceof Dog) {
            System.out.println("d es una instancia de Dog");
        } else {
            System.out.println("d no es una instancia de Dog");
        }
    }
}

/*
En este caso, la variable d es null. La expresión d instanceof Dog
devuelve false, ya que instanceof devuelve false si la referencia es null.
 */