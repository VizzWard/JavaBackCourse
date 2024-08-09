package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSLinkedList.DoublyLinkedList;

//clase Nodo - Para Doubly Linked List
class Node {
    Object data; // Datos almacenados en el nodo
    Node next;   // Referencia al siguiente nodo
    Node prev;   // Referencia al anterior nodo

    // Constructor para inicializar el nodo con un valor
    Node(Object data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

