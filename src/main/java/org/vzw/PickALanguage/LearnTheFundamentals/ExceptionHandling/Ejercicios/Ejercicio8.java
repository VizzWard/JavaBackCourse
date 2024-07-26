package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Ejercicios;

import java.io.IOException;

/**
 * Ejercicio 8:
 * Define una clase base con un método que puede lanzar una excepción, y
 * una clase derivada que sobrescribe este método sin lanzar la excepción
 * o lanzando una excepción más específica.
 *
 * Instrucciones:
 * Sobrescribe el método display en DerivedClass para manejar la excepción de manera adecuada.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        DerivedClass derived = new DerivedClass();
        derived.display();
    }
}

class BaseClass {
    public void display() throws IOException {
        // Simula una operación que podría lanzar IOException
        throw new IOException();
    }
}

class DerivedClass extends BaseClass {
    @Override
    public void display() {
        // Sobrescribe el método sin lanzar IOException
        try {
            System.out.println("DerivedClass: display() method with no exception");
            // Si es necesario, puedes llamar al método de la clase base
            super.display();
        } catch (IOException e) {
            System.out.println("Caught IOException in DerivedClass: " + e.getMessage());
        }
    }
}

