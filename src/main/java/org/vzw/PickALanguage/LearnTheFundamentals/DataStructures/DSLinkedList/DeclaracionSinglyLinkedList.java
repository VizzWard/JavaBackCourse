package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSLinkedList;

public class DeclaracionSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Añadir elementos a la lista
        list.add(10);
        list.add(20);
        list.add(30);

        // Imprimir la lista
        list.printList(); // Salida: 10 20 30
    }
}


class Node {
    int data;
    Node next;

    // Constructor para inicializar el nodo con un valor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class SinglyLinkedList {
    Node head;

    // Constructor para inicializar una lista vacía
    SinglyLinkedList() {
        this.head = null;
    }

    // Método para añadir un nuevo nodo al final de la lista
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Método para imprimir los elementos de la lista
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
