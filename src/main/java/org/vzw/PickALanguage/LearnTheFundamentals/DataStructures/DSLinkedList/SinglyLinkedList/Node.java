package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSLinkedList.SinglyLinkedList;

//clase Nodo
public class Node {
    int data;   // Datos almacenados en el nodo
    Node next;  // Referencia al siguiente nodo

    // Constructor para inicializar el nodo con un valor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

//Clase puesta en un solo archivo
//Para que todas las clases lo puedan usar

// No se puede crear un nodo para cada clase
// Tiene que ser uno para todas las clases