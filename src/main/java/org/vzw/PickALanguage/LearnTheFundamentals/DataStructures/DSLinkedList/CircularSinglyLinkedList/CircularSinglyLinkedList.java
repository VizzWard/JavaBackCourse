package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSLinkedList.CircularSinglyLinkedList;

class CircularSinglyLinkedList {
    Node head;
    Node tail;
    int size;

    //Contructor
    CircularSinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //Add methods -> add end | add first / add especific
    void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;

            size++;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
            tail = newNode;

            size++; // Incrementar el tamaño de la lista
        }
    }

    void add(Object data, int index) throws ArithmeticException {
        if (index < 0 || index > size + 1) {
            throw new ArithmeticException("Posicion no existente!");
        } else {
            if (index == 0) {
                Node newNode = new Node(data);
                if (head == null) {
                    head = newNode;
                    newNode.next = head;
                } else {
                    newNode.next = head;
                    head = newNode;
                    tail.next = head;
                }
                size++;
            } else if (index == size + 1) {
                add(data);
            } else {
                Node newNode = new Node(data);
                Node current = head;
                for (int i = 1; i < index; i++) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
                size++;
            }
        }
    }

    //Print method
    void printList() throws NullPointerException {
        Node current = head;
        if (head == null) {
            throw new NullPointerException("La lista esta vacia");
        } else {
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);

        }
        System.out.println();
    }

    //Delete methods -> delete end | delete first / delete especific
    void delete() throws NullPointerException {
        if (head == null) {
            throw new NullPointerException("La lista esta vacia");
        } else {
            if (head == tail) {
                head = tail = null;
                size = 0;
            } else {
                Node current = head;
                while (current.next != tail) {
                    current = current.next;
                }
                tail = null;
                current.next = head;
                tail = current;

                size--;
            }
        }
    }

    void delete(int index) throws NullPointerException, ArithmeticException {
        if (index < 0 || index > size - 1) {
            throw new ArithmeticException("Posicion no existente!");
        } else if (head == null) {
            throw new NullPointerException("La lista esta vacia");
        } else {
            if (index == 0) {
                if (head == tail) {
                    head = tail = null;
                    size = 0;
                } else {
                    head = head.next;
                    tail.next = head;
                    size--;
                }
            } else if (index == size) {
                delete();
            } else {
                Node current = head;
                for (int i = 1; i < index; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
            }
        }
    }

    //Search methods
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

    //Buscar si existe un valor en la lista y retornar la posicion en la que se encuentra
    int searchIndex(Object data) throws NullPointerException {
        if (head == null) {
            throw new NullPointerException("La lista esta vacia");
        } else  {
            int position = 0;
            Node current = head;
            do {
                if (current.data.equals(data)) {
                    return position;
                }
                current = current.next;
                position++;
            } while (current != head);
        }
        return -1;
    }

    //Find method
    //Buscar que dato esta en el elemento x
    Object find(int index) throws ArithmeticException, NullPointerException{
        if (head == null) {
            throw new NullPointerException("La lista esta vacia");
        } else if (index < 0 || index > size - 1) {
            throw new ArithmeticException("Posicion no existente!");
        } else {
            Node current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }
    }
}
