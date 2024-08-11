package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSLinkedList.CircularSinglyLinkedList;

class CircularSinglyLinkedList {
    Node head;
    Node tail;
    int size;

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

    void add(Object data, int index) {
        if (index < 0 || index > size + 1) {
            System.out.println("Posicion no existente!");
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
    void printList(){
        Node current = head;
        if (head == null) {
            System.out.println("Vacio");
        } else {
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);

        }
        System.out.println();
    }

    //Delete methods -> delete end | delete first / delete especific
    void delete(){
        if (head == null) {
            System.out.println("Vacio");
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

    //Search methods


    //Find method
}
