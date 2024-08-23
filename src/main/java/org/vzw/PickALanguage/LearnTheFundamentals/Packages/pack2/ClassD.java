package org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack2;

// Importar la clase del subpaquete
import org.vzw.PickALanguage.LearnTheFundamentals.Packages.subpack.ClassC;

public class ClassD {
    public static void main(String[] args) {
        ClassC objC = new ClassC();
        objC.show(); // Acceso a ClassC desde subpack
    }
}
