package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSStacks;

public class ImplementacionConListas {
    public static void main(String[] args) {
        StackList stack = new StackList(); // Crear una instancia del stack

        // Añadir elementos al stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Imprimir el contenido del stack
        stack.display();

        // Eliminar un elemento del stack
        stack.pop();

        // Imprimir el contenido del stack después de hacer pop
        stack.display();
    }
}

// Definición de la clase Node para la lista enlazada
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

// Definición de la clase Stack usando una lista enlazada simple
class StackList {
    private Node head; // Cabeza de la lista enlazada

    StackList() {
        head = null; // Inicialmente el stack está vacío
    }

    // Método para añadir un elemento al stack
    void push(int val) {
        Node newNode = new Node(val); // Crear un nuevo nodo con el valor proporcionado
        if (newNode == null) {
            System.out.println("Not able to push the element");
        } else {
            if (head == null) {
                head = newNode; // Si el stack está vacío, el nuevo nodo es la cabeza
            } else {
                newNode.next = head; // Apuntar el siguiente del nuevo nodo al nodo actual de la cabeza
                head = newNode; // Actualizar la cabeza para que sea el nuevo nodo
            }
            System.out.println("Item pushed");
        }
    }

    // Método para eliminar (pop) el elemento de la cima del stack
    void pop() {
        if (head == null) {
            System.out.println("Underflow"); // El stack está vacío
        } else {
            int item = head.val; // Obtener el valor de la cabeza
            head = head.next; // Mover la cabeza al siguiente nodo
            System.out.println("Item popped: " + item);
        }
    }

    // Método para imprimir los elementos del stack
    void display() {
        if (head == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            Node ptr = head;
            while (ptr != null) {
                System.out.print(ptr.val + " "); // Imprimir el valor del nodo actual
                ptr = ptr.next; // Mover al siguiente nodo
            }
        }
        System.out.println();
    }
}