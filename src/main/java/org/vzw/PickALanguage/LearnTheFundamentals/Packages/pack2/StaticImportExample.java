package org.vzw.PickALanguage.LearnTheFundamentals.Packages.pack2;

// Importación estática de Math.*
import static java.lang.Math.*;

public class StaticImportExample {
    public static void main(String[] args) {
        // Uso de métodos estáticos de Math sin el prefijo Math.
        System.out.println("Square root of 16: " + sqrt(16));
        System.out.println("Random number: " + random());
    }
}