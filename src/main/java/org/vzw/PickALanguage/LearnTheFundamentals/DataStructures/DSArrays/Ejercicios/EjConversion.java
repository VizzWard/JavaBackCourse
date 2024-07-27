package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSArrays.Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjConversion {
    public static void main(String[] args) {
        /**
         * Array a List: Declara un array de enteros y conviértelo en una lista usando Arrays.asList.
         */
        int[] enteros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(enteros);
        List<int[]> lista1 = Arrays.asList(enteros);
        for (int[] entero : lista1) {
            System.out.println(Arrays.toString(entero));
        }

        /**
         * Modificar List: Convierte un array de cadenas a una lista, agrega un nuevo elemento a la lista y elimina otro.
         */
        String[] cadenas = new String[]{"Arco", "Brazo", "Casa", "Doble", "Entero", "Final"};
        Arrays.sort(cadenas);

        // Convertir a una lista modificable
        List<String> lista2 = new ArrayList<>(Arrays.asList(cadenas));

        System.out.println(lista2); // Imprime la lista ordenada

        // Agregar un elemento a la lista
        lista2.add("Flauta");
        System.out.println(lista2); // Imprime la lista después de agregar "Flauta"

        lista2.remove(5);
        System.out.println(lista2);


        /**
         * List a Array: Convierte una lista de enteros en un array.
         */
        // Crear e inicializar una lista de enteros
        List<Integer> lista3 = new ArrayList<>();
        lista3.add(1);
        lista3.add(2);
        lista3.add(3);
        lista3.add(4);
        lista3.add(5);

        // Convertir la lista a un array de Integer
        Integer[] miArray = lista3.toArray(new Integer[0]);

        // Imprimir el array
        System.out.println(Arrays.toString(miArray));

        System.out.println(" ");
        /**
         * Manipulación de List: Convierte un array a una lista, ordénala y luego conviértela de nuevo en un array.
         */
        String[] arrayList = new String[]{"Flor", "Casa", "Vaca", "Gato"};

        //Convertir el array a lista
        List<String> lista4 = new ArrayList<>(Arrays.asList(arrayList));

        //Ordenar la lista
        Arrays.sort(arrayList);

        //Convertir de lista a array
        String[] nuevoArray = lista4.toArray(new String[0]);

        for (int i = 0; i < nuevoArray.length; i++) {
            System.out.println(nuevoArray[i]);
        }
        System.out.println(" ");

        /**
         * Filtrar List: Convierte un array de enteros a una lista y filtra todos los elementos mayores que un valor
         * específico.
         */
        // Declaración e inicialización de un array de enteros
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Convertir el array a una lista
        List<Integer> lista = Arrays.stream(array).boxed().collect(Collectors.toList());

        // Filtrar los elementos mayores que un valor específico
        int valorEspecifico = 5;
        List<Integer> listaFiltrada = lista.stream()
                .filter(num -> num > valorEspecifico)
                .collect(Collectors.toList());

        // Imprimir la lista filtrada
        System.out.println(listaFiltrada);

    }
}
