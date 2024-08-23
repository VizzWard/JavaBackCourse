package org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack2;

// Importa todas las clases del paquete pack1
import org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack1.*;

public class ClassB {
    public static void main(String[] args) {
        ClassA objA = new ClassA();
        objA.display(); // Acceso a ClassA desde pack1
    }
}