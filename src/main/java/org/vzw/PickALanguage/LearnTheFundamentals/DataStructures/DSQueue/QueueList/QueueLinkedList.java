package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSQueue.QueueList;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue q = new Queue();

        // Colocar elementos en la cola
        q.enqueue(10);
        q.enqueue(20);

        System.out.println("Queue Front: " + q.getFront());
        System.out.println("Queue Rear: " + q.getRear());

        // Retirar elementos de la cola
        q.dequeue();
        q.dequeue();

        // Colocar más elementos en la cola
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        // Retirar un elemento de la cola
        q.dequeue();

        System.out.println("Queue Front: " + q.getFront());
        System.out.println("Queue Rear: " + q.getRear());
    }
}

// Clase para implementar operaciones de cola utilizando una lista enlazada
class Queue {

    // Puntero a la parte delantera y trasera de la lista enlazada
    Node front, rear;

    // Constructor para inicializar la parte delantera y trasera
    Queue() {
        front = rear = null;
    }

    // Función para comprobar si la cola está vacía
    boolean isEmpty() {

        // Si la parte delantera y trasera son nulas, entonces la cola está
        // vacía, de lo contrario no lo está
        return front == null && rear == null;
    }

    // Función para añadir un elemento a la cola
    void enqueue(int new_data) {

        // Crear un nuevo nodo de lista enlazada
        Node new_node = new Node(new_data);

        // Si la cola está vacía, el nuevo nodo es tanto el anterior
        // como el posterior
        if (rear == null) {
            front = rear = new_node;
            return;
        }

        // Añadir el nuevo nodo al final de la cola y
        // cambiar rear
        rear.next = new_node;
        rear = new_node;
    }

    // Función para eliminar un elemento de la cola
    void dequeue() {

        // Si la cola está vacía, return
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }

        // Almacena el front anterior y mueve el front un nodo
        // adelante
        Node temp = front;
        front = front.next;

        // Si la parte delantera pasa a ser nula, la parte trasera también
        // pasa a ser nula
        if (front == null) {
            rear = null;
        }
    }

    // Función para obtener el primer elemento de la cola
    int getFront() {

        // Comprobar si la cola está vacía
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return front.data;
    }

    // Función para obtener el elemento posterior de la cola
    int getRear() {

        // Comprobar si la cola está vacía
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return rear.data;
    }
}

// Clase de nodo que representa un único nodo de la lista enlazadat
class Node {
    int data;
    Node next;

    Node(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}