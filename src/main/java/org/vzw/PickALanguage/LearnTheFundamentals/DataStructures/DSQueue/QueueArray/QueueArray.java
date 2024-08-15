package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSQueue.QueueArray;

public class QueueArray {
    // Método main para probar la funcionalidad de la clase Queue
    public static void main(String[] args) {
        QueueArrays queue = new QueueArrays(5); // Crea una cola con capacidad de 5 elementos

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.printQueue();

        queue.dequeue();
        queue.dequeue();

        queue.printQueue();

        System.out.println("El elemento en el frente es: " + queue.peek());

        queue.enqueue(60);

        queue.printQueue();
    }
}

class QueueArrays {
    private int[] queue; // Array que almacena los elementos de la cola
    private int front;   // Índice del frente de la cola
    private int rear;    // Índice del final de la cola
    private int capacity;     // Capacidad máxima de la cola

    // Constructor que inicializa la cola con una capacidad dada
    public QueueArrays(int capacity) {
        this.capacity = capacity; // Establece la capacidad de la cola
        front = rear = 0; // Inicializa los índices front y rear en 0
        queue = new int[capacity]; // Crea un array de la capacidad especificada
    }

    // Método para añadir un elemento a la cola
    public void enqueue(int item) {
        // Verifica si la cola está llena
        if (isFull()) {
            System.out.println("Queue is full");
            return; // Sale del método si la cola está llena
        }
        // Añade el elemento al final de la cola y aumenta el índice rear
        queue[rear] = item;
        rear++;
    }

    // Método para eliminar un elemento de la cola
    public int dequeue() {
        // Verifica si la cola está vacía
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Devuelve -1 si la cola está vacía
        }
        // Almacena el elemento al frente de la cola para devolverlo
        int item = queue[front];
        // Desplaza todos los elementos hacia adelante para mantener la cola
        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        // Disminuye el índice rear después de eliminar el elemento
        rear--;
        return item; // Devuelve el elemento que estaba al frente
    }

    // Método para obtener el elemento al frente de la cola sin eliminarlo
    public int peek() {
        // Verifica si la cola está vacía
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Devuelve -1 si la cola está vacía
        }
        // Devuelve el elemento al frente de la cola
        return queue[front];
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return front == rear;
    }

    // Método para verificar si la cola está llena
    public boolean isFull() {
        return rear == capacity;
    }

    // Método para imprimir todos los elementos de la cola
    public void printQueue() {
        // Verifica si la cola está vacía
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return; // Sale del método si la cola está vacía
        }
        // Recorre y muestra cada elemento de la cola desde front hasta rear
        System.out.print("Queue: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println(); // Salto de línea al final de la impresión
    }
}
