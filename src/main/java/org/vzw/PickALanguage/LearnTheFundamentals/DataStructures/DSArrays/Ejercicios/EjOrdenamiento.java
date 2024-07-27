package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSArrays.Ejercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class EjOrdenamiento {
    public static void main(String[] args) {
        /**
         * Ordenar enteros: Declara un array de enteros y usa Arrays.sort para ordenarlo.
         */
        int[] enteros = new int[]{1, 10, 4, 6, 8, 5, 9, 2, 3, 7};
        Arrays.sort(enteros);
        System.out.println(Arrays.toString(enteros));

        /**
         * Ordenar cadenas: Crea un array de cadenas y ordénalo alfabéticamente.
         */
        String[] cadenas = new String[]{"Base", "Casa", "Almohada", "Dedo", "Estufa"};
        Arrays.sort(cadenas);
        System.out.println(Arrays.toString(cadenas));

        /**
         * Ordenar objetos: Declara una clase Persona con nombre y edad. Crea un array de Persona y ordénalo por edad.
         */
        // Creación de un array de objetos Persona
        Persona[] personas = {
                new Persona("Juan", 25),
                new Persona("Ana", 30),
                new Persona("Luis", 20),
                new Persona("Marta", 28)
        };

        // Ordenar el array de Personas por edad usando un comparador
        Arrays.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return Integer.compare(p1.edad, p2.edad);
            }
        });

        // Imprimir el array ordenado
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        /**
         * Ordenamiento personalizado: Usa un comparador para ordenar un array de Persona por nombre.
         */

        // Ordenar el array de Personas por nombre usando un comparador
        Arrays.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return CharSequence.compare(p1.nombre, p2.nombre);
            }
        });

        // Imprimir el array ordenado
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        /**
         * Ordenar en reversa: Declara un array de enteros y usa Arrays.sort con un comparador para ordenarlo en orden
         * descendente.
         */
        // Declaración e inicialización de un array de enteros
        Integer[] array = {1, 3, 5, 2, 4, 6};

        // Ordenar el array en orden descendente usando un comparador
        Arrays.sort(array, Collections.reverseOrder());

        // Imprimir el array ordenado en orden descendente
        System.out.println(Arrays.toString(array));
    }
}

class Persona {
    String nombre;
    int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método toString para una representación legible de Persona
    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}
