package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSLinkedList.CircularDoublyLinkedList;

public class CircularDoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public CircularDoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //Metodos para agregar -> al inicio | en x posicion
    void add (Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = newNode;
            head.prev = newNode;
            size++;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = head;
            head.prev = tail;
            size++;
        }
    }

    //Metodos para imprimir lista
    void printList() throws NullPointerException {
        Node current = head;
        if (current == null) {
            throw new NullPointerException("La lista esta vacia");
        } else {
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
        }
        System.out.println();
    }

    void printListReverse() throws NullPointerException {
        Node current = tail;
        if (current == null) {
            throw new NullPointerException("La lista esta vacia");
        } else {
            do {
                System.out.print(current.data + " ");
                current = current.prev;
            } while (current != tail);
        }
        System.out.println();
    }
}
