package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSLinkedList.CircularDoublyLinkedList;

public class Declaracion {
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.printList();
        list.printListReverse();
    }
}
