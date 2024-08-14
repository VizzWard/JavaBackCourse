package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSStacks.StackArray;

// Clase principal para ejecutar el código
public class ImplementacionConArrays {
    public static void main(String[] args) {
        Stack myStack = new Stack(5); // Crear un stack de tamaño 5

        // Añadir elementos al stack
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        // Ver el elemento en la cima del stack
        System.out.println("Elemento en la cima del stack: " + myStack.peek());

        // Eliminar un elemento del stack
        System.out.println("Elemento sacado del stack: " + myStack.pop());

        // Ver el elemento en la cima del stack después de la eliminación
        System.out.println("Elemento en la cima del stack después del pop: " + myStack.peek());

        // Intentar eliminar más elementos de los que hay en el stack
        System.out.println("Elemento sacado del stack: " + myStack.pop());
        System.out.println("Elemento sacado del stack: " + myStack.pop());
        System.out.println("Elemento sacado del stack: " + myStack.pop()); // Intento de pop en un stack vacío

        // comprobar si la stack está vacía
        if (myStack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}


// Definición de la clase Stack
class Stack {
    private int n;       // Tamaño del stack
    private int[] stack; // Array para almacenar los elementos del stack
    private int top;     // Índice del último elemento añadido

    // Constructor de la clase Stack
    Stack(int size) {
        n = size;
        stack = new int[n];
        top = -1; // Inicializamos top a -1 para indicar que el stack está vacío
    }

    // Método para añadir un elemento al stack
    void push(int val) {
        if (top == n - 1) {
            System.out.println("Overflow: Stack is full");
        } else {
            top = top + 1;
            stack[top] = val;
        }
    }

    // Método para eliminar y devolver el elemento superior del stack
    int pop() {
        if (top == -1) {
            System.out.println("Underflow: Stack is empty");
            return -1; // Valor de error
        } else {
            int item = stack[top];
            top = top - 1;
            return item;
        }
    }

    // Método para ver el elemento superior del stack sin eliminarlo
    int peek() {
        if (top == -1) {
            System.out.println("Underflow: Stack is empty");
            return -1; // Valor de error
        } else {
            return stack[top];
        }
    }

    // Función de utilidad para devolver el tamaño de la stack
    int size() {
        return top + 1;
    }

    // Función de utilidad para verificar si la stack está vacía o no
    boolean isEmpty() {
        return top == -1;               // o return size() == 0;
    }

    // Función de utilidad para verificar si la stack está llena o no
    boolean isFull() {
        return top == n - 1;     // o return size() == capacity;
    }
}