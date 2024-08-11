package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSLinkedList.CircularDoublyLinkedList;

class Node {
    Object data;
    Node next;
    Node prev;

    //Constructor
    Node(Object d) {
        this.data = d;
        this.next = null;
        this.prev = null;
    }
}
