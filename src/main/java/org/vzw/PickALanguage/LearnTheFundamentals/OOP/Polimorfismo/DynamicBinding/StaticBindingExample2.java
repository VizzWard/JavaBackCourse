package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Polimorfismo.DynamicBinding;

class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;
}

public class StaticBindingExample2 {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.x); // Acceso a la variable x estáticamente ligada
    }
}

/*
   aunque el objeto p es de tipo Child,
   la variable x referenciada pertenece a Parent,
   ya que la vinculación de variables se resuelve
   en tiempo de compilación.

*/