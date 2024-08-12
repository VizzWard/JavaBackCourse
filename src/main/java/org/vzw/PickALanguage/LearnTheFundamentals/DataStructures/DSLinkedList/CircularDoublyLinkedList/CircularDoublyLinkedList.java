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

    void add (Object data, int index) throws IndexOutOfBoundsException, NullPointerException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Posicion no existente!");
        } else if (head == null) {
            throw new NullPointerException("La lista esta vacia");
        } else if (index == 0) {
            Node newNode = new Node(data);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            head.prev = tail;
            tail.next = head;
            size++;
        } else if (index == size) {
            add(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
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

    //Metodo para eliminar el ultimo elemento
    void delete() throws NullPointerException {
        if (head == null) {
            throw new NullPointerException("La lista esta vacia");
        } else if (head == tail) {
            head = tail = null;
            size = 0;
        } else {
            tail = tail.prev;
            tail.next = head;
            size--;
        }
    }

    void delete(int index) throws IndexOutOfBoundsException, NullPointerException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Posicion no existente!");
        } else if (head == null) {
            throw new NullPointerException("La lista esta vacia");
        } else if (index == 0) {
            head = head.next;
            head.prev = tail;
            tail.next = head;
            size--;
        } else if (index == size) {
            delete();
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    // Search
    //Buscar si existe un valor en la lista y retornar true en caso de ser verdadero
    boolean search(Object data) throws NullPointerException {
        if (head == null) {
            throw new NullPointerException("La lista esta vacia");
        } else {
            Node current = head;
            do {
                if (current.data.equals(data)) {
                    return true;
                }
                current = current.next;
            } while (current != head);
        }
        return false;
    }

    //Find - Buscar que dato esta en el elemento x
    Object find(int index) throws IndexOutOfBoundsException, NullPointerException {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Posicion no existente!");
        } else if (head == null) {
            throw new NullPointerException("La lista esta vacia");
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }
    }

}
