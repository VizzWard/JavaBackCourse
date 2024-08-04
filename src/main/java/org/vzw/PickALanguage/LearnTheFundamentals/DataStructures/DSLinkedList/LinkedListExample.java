package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSLinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Declaración e inicialización de la LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Agregar elementos a la LinkedList
        list.add("Elemento 1");
        list.add("Elemento 2");
        list.add("Elemento 3");
        System.out.println("LinkedList después de agregar elementos: " + list);

        // Agregar un elemento en una posición específica
        list.add(1, "Elemento Insertado");
        System.out.println("LinkedList después de insertar un elemento en la posición 1: " + list);

        // Acceder a un elemento por su índice
        String element = list.get(2);
        System.out.println("Elemento en la posición 2: " + element);

        // Actualizar un elemento
        list.set(2, "Elemento Actualizado");
        System.out.println("LinkedList después de actualizar el elemento en la posición 2: " + list);

        // Eliminar un elemento por su índice
        list.remove(1);
        System.out.println("LinkedList después de eliminar el elemento en la posición 1: " + list);

        // Eliminar un elemento por su valor
        list.remove("Elemento 3");
        System.out.println("LinkedList después de eliminar 'Elemento 3': " + list);

        // Recorrer la LinkedList
        System.out.println("Recorriendo la LinkedList:");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
