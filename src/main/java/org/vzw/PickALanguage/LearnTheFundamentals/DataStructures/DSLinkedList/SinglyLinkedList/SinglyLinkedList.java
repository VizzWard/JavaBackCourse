package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSLinkedList.SinglyLinkedList;

// Clase Lista Enlazada Simple
class SinglyLinkedList {
    Node head;  // Cabeza de la lista enlazada, referencia al primer nodo
    int size; // Tamaño de la lista

    // Constructor por defecto para inicializar una lista vacía
    SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Constructor que acepta un array de elementos
    SinglyLinkedList(int[] elements) {
        this.head = null;
        for (int element : elements) {
            add(element);
        }
    }

    // Método para imprimir los elementos de la lista
    // Aqui se aplica el metodo Traversal, para hacer un recorrido e imprimir la lista
    void printList() {
        // Iniciar en el head
        Node current = head;

        // Recorrer la lista hasta llegar al final (NULL)
        while (current != null) {

            // Imprime los datos del nodo actual
            System.out.print(current.data + " ");

            // Pasar al nodo siguiente
            current = current.next;
        }
        System.out.println();
    }

    // Metodo para buscar si existe un valor en la lista enlazada
    boolean searchLinkedList(Node head, Object target)
    {
        // Recorrer la lista enlazada
        while (head != null) {
            // Comprueba si los datos del nodo actual coinciden con los datos
            // valor objetivo
            if (head.data == target) {

                // Valor encontrado
                return true;
            }
            // Pasar al nodo siguiente
            head = head.next;
        }
        // Valor no encontrado
        return false;
    }

    // Función para hallar el dato en una posicion determinada
    Object searchList(Node head, int pos) {

        int contador = 0;
        // Empezar por la cabeza de la lista
        Node current = head;

        // Recorre la lista e incrementa el contador cada ciclo
        search:
        while (current != null) {

            if (contador == pos) {
                break search;
            }
            contador++;
            current = current.next;
        }

        // Devuelve la longitud final de la lista enlazada
        return current.data;
    }

    // Función para hallar la longitud de la lista enlazada
    int findLength(Node head) {

        // Inicializar un contador para la longitud
        int length = 0;

        // Empezar por la cabeza de la lista
        Node current = head;

        // Recorre la lista e incrementa la longitud para cada Nodo
        while (current != null) {
            length++;
            current = current.next;
        }

        // Devuelve la longitud final de la lista enlazada
        return length;
    }

    // Función para insertar un nuevo nodo al principio del archivo
    // linked list
    Node insertAtBeginning(Node head, Object value) {
        // Crea un nuevo nodo con el valor dado
        Node newNode = new Node(value);

        // Establece el siguiente puntero del nuevo nodo al actual
        // head
        newNode.next = head;

        // Mueve la cabeza para que apunte al nuevo nodo
        head = newNode;

        size++; // Incrementar el tamaño de la lista

        // Devuelve la nueva cabeza de la lista enlazada
        return head;
    }

    // Método para añadir un nuevo nodo al final de la lista
    void add(Object data) {
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
        size++; // Incrementar el tamaño de la lista
    }


    // Método para insertar un nodo en una posición específica
    public void insertPos(int pos, Object data) {
        // Verificar si la posición es válida
        System.out.println(size);
        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid position!");
            return;
        }

        // Crear el nuevo nodo
        Node newNode = new Node(data);

        // Si la posición es la primera, actualizar el head
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            // Encontrar el nodo en la posición anterior a la deseada
            Node current = head;
            for (int i = 1; i < pos - 1; i++) {
                current = current.next;
            }
            // Insertar el nuevo nodo en la posición deseada
            newNode.next = current.next;
            current.next = newNode;
        }

        // Incrementar el tamaño de la lista
        size++;
    }

    // Función para eliminar el primer nodo
    // de la lista enlazada
    static Node removeFirstNode(Node head)
    {
        if (head == null)
            return null;

        // Mover el puntero del head al siguiente nodo
        Node temp = head;
        head = head.next;

        return head;
    }

    // Función Java para eliminar el último nodo de la lista enlazada
    Node removeLastNode(Node head)
    {
        // Si la lista está vacía, devuelve null
        if (head == null)
            return null;

        // Si la lista sólo tiene un nodo, elimínalo y devuelve
        // null
        if (head.next == null) {
            head = null;
            return null;
        }

        // Encuentra el penúltimo nodo
        Node second_last = head;
        while (second_last.next.next != null) {
            second_last = second_last.next;
        }

        // Eliminar el último nodo
        second_last.next = null;

        // Devuelve la lista modificada
        return head;
    }

    // Función para eliminar un nodo en una posición determinada
    public void deleteAtPosition(Node head, int position)
    {
        // Si la lista está vacía o la posición no es válida
        if (head == null || position < 1) {
            return;
        }

        //  Si hay que borrar el head
        if (position == 1) {
            Node temp = head;
            head = head.next;
            temp = null;
            return;
        }

        // Desplazarse al nodo anterior a la posición que se va a borrar
        Node current = head;
        for (int i = 1; i < position - 1 && current != null;
             i++) {
            current = current.next;
        }

        // Si la posición está fuera de rango
        if (current == null || current.next == null) {
            return;
        }

        // Almacenar el nodo a eliminar
        Node temp = current.next;

        // Actualizar los enlaces para evitar el nodo que se va a eliminar
        current.next = current.next.next;

        // Eliminar el nodo
        temp = null;
    }
}


