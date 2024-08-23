package org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack2;

// Importa solo ClassA del paquete pack1
import org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack1.ClassA;

public class ClassB2 {
    public static void main(String[] args) {
        ClassA objA = new ClassA();
        objA.display(); // Acceso a ClassA desde pack1
    }
}
