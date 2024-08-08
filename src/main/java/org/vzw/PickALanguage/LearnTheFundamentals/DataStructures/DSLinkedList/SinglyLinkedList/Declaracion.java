package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSLinkedList.SinglyLinkedList;

public class Declaracion {
    public static void main(String[] args) {
        //Crear lista
        SinglyLinkedList list = new SinglyLinkedList();

        // Añadir elementos a la lista
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(100);
        list.add(200);
        list.add(3);
        list.add("quince");

        // Imprimir la lista
        list.printList();

        // Crear una lista enlazada con elementos iniciales
        int[] initialElements = {10, 20, 30, 40};
        SinglyLinkedList list2 = new SinglyLinkedList(initialElements);

        // Imprimir la lista
        list2.printList(); // Salida: 10 20 30 40

        //Searching
        // Buscar un valor en la lista
        int target = 3;
        boolean found = list.searchLinkedList(list.head, target);

        if (found) {
            System.out.println("Valor existente");
        } else {
            System.out.println("Valor inexistente");
        }

        //Funcion para buscar en una posicion determinada
        String dato = String.valueOf(list.searchList(list.head, 6));
        System.out.println(dato);

        //Saber la longitud de una lista:
        int longitud = list.findLength(list.head);
        System.out.println(longitud);

        //Insertar elemento al inicio
        list.head = list.insertAtBeginning(list.head, 90);
        list.printList();

        //Insertar elemento al final
        list.add(15);
        list.printList();

        //Insertar elemento en una posicion especifica
        list.insertPos(2, 50);
        list.printList();

        //Eliminar el primer elemento
        list.head =  list.removeFirstNode(list.head);
        list.printList();

        //Eliminar el ultimo elemento
        list.head = list.removeLastNode(list.head);
        list.printList();

        //Eliminar en una posicion especifica
        list.deleteAtPosition(list.head, 3);
        list.printList();
    }
}

