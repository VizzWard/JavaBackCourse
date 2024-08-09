package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSLinkedList.DoublyLinkedList;

class DoublyLinkedList {
    Node head;  // Head -> Referencia al primer nodo
    Node tail;  // Tail -> Referencia al ultimo nodo
    int size;   // size -> Referencia al tamaño de la lista

    // Constructor
    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Método para añadir un nodo al final de la lista
    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode; // Si la lista está vacía, head y tail apuntan al nuevo nodo
        } else {
            tail.next = newNode; // tail.next apunta al nuevo nodo
            newNode.prev = tail; // El nuevo nodo apunta a tail como su nodo anterior
            tail = newNode; // tail se actualiza al nuevo nodo
        }

        size++;
    }

    // Método para añadir un nodo en una posición específica - OVERLOADING
    public void add(Object data, int position) {
        if (position < 0 || position > size + 1) {
            System.out.println("Posición inválida!");
            return;
        }
        if (position == 0) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 1; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
        }

        size++;
    }


    //Metodo para imprimir lista del primero al ultimo
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    //Metodo para imprimir lista del ultimo al primero - OVERLOADING
    void printList(boolean backward) {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    //Metodo para eliminar el ultimo elemento
    void delete() {
        if (head == null) {
            // La lista ya está vacía, no hay nada que eliminar
            System.out.println("List is already empty!");
        } else if (head == tail) {
            // Solo hay un elemento en la lista
            head = null;
            tail = null;
        } else {
            // Hay más de un elemento en la lista
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    //Metodo para eliminar un nodo en una posición específica - OVERLOADING
    void delete(int pos) {
        if (pos < 0 || pos > size + 1) {
            System.out.println("Posición inválida!");
            return;
        }
        if (pos == 0) {
            if (head == null) {
                System.out.println("List is already empty!");
            } else if (head == tail) {
                // Solo hay un elemento en la lista
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        } else if (pos == size) {
            delete();
            return;
        } else {
            Node current = head;
            for (int i = 1; i < pos; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        size--;
    }

    // Searching - Buscar si existe un valor en la lista y retornar true en caso de ser verdadero
    boolean search(Object value){
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Searching - Buscar si existe un valor en la lista y retornar la posicion en la que se encuentra
    int searchPosition(Object value){
        Node current = head;
        int position = 0;
        while (current != null) {
            if (current.data == value) {
                return position;
            }
            current = current.next;
            position++;
        }
        return -1;
    }

    //Finding - Buscar el valor en una posicion
    Object find(int index){
        Node current = head;
        int position = 0;
        if (index < 1 || index > size + 1) {
            System.out.print("Posición inválida! - ");
            return null;
        } else {
            while (position < index) {
                current = current.next;
                position++;
            }
            return current.data;
        }
    }
}
