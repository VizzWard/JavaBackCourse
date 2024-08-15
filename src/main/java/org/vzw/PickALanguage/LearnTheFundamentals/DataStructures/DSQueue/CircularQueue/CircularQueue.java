package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSQueue.CircularQueue;

public class CircularQueue {
    public static void main(String[] args) {
        CircularQueueList cq = new CircularQueueList(); // Crea una instancia de la CircularQueue

        cq.enqueue(10); // Añade 10 a la cola
        cq.enqueue(20); // Añade 20 a la cola
        cq.enqueue(30); // Añade 30 a la cola

        System.out.println("First element: " + cq.peek()); // Muestra el primer elemento (10)

        cq.display(); // Muestra todos los elementos de la cola (10 20 30)

        System.out.println("Dequeued element: " + cq.dequeue()); // Elimina el primer elemento (10)
        cq.display(); // Muestra los elementos restantes (20 30)

        cq.enqueue(40); // Añade 40 a la cola
        cq.display(); // Muestra todos los elementos de la cola (20 30 40)
    }
}

// Clase CircularQueue que implementa una cola circular utilizando una lista enlazada
class CircularQueueList {
    private Node rear = null; // Puntero al último nodo de la cola (donde se realiza enqueue)
    private Node front = null; // Puntero al primer nodo de la cola (donde se realiza dequeue)

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return front == null; // La cola está vacía si no hay nodo al frente
    }

    // Método para encolar un elemento (enqueue)
    public void enqueue(int data) {
        Node newNode = new Node(data); // Crea un nuevo nodo con el dato proporcionado
        if (isEmpty()) {
            // Si la cola está vacía, ambos punteros front y rear apuntan al nuevo nodo
            front = newNode;
            rear = newNode;
            rear.next = front; // Apunta al primer nodo para hacer la cola circular
        } else {
            // Si la cola no está vacía, añade el nuevo nodo después de rear y ajusta punteros
            rear.next = newNode; // El siguiente de rear es el nuevo nodo
            rear = newNode; // Ahora rear apunta al nuevo nodo
            rear.next = front; // Mantiene la circularidad apuntando al primer nodo
        }
    }

    // Método para desencolar un elemento (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty"); // Mensaje si la cola está vacía
            return -1; // Retorna un valor inválido si no hay elementos
        }
        int value;
        if (front == rear) {
            // Caso donde solo hay un elemento en la cola
            value = front.data; // Obtiene el dato del nodo
            front = null; // Elimina el único nodo, dejando la cola vacía
            rear = null;
        } else {
            // Caso donde hay más de un elemento en la cola
            value = front.data; // Obtiene el dato del nodo en el frente
            front = front.next; // Mueve el puntero front al siguiente nodo
            rear.next = front; // Mantiene la circularidad apuntando al nuevo front
        }
        return value; // Retorna el dato del nodo eliminado
    }

    // Método para ver el primer elemento (peek) sin eliminarlo
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty"); // Mensaje si la cola está vacía
            return -1; // Retorna un valor inválido si no hay elementos
        }
        return front.data; // Retorna el dato del nodo al frente
    }

    // Método para mostrar todos los elementos de la cola
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty"); // Mensaje si la cola está vacía
            return;
        }
        Node temp = front; // Comienza en el nodo al frente
        do {
            System.out.print(temp.data + " "); // Imprime el dato de cada nodo
            temp = temp.next; // Mueve al siguiente nodo
        } while (temp != front); // Continua hasta regresar al nodo del frente
        System.out.println(); // Nueva línea después de mostrar todos los elementos
    }
}

// Clase Node que representa cada elemento de la lista enlazada
class Node {
    int data; // Dato que almacena el nodo
    Node next; // Referencia al siguiente nodo en la lista

    // Constructor para inicializar el nodo con un valor
    public Node(int data) {
        this.data = data;
        this.next = null; // Inicialmente, el siguiente nodo es null
    }
}
