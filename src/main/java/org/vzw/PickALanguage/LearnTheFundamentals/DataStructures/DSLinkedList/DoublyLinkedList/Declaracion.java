package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSLinkedList.DoublyLinkedList;

public class Declaracion {
    public  static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.add("up");
        list.add("down");
        list.add("left");
        list.add("right");
        list.add("first", true);
        list.add("second", 1);

        list.printList();
        list.printList(true);

        list.delete();
        list.printList();

        list.delete(true);
        list.printList();


        list.delete(2);
        list.printList();
    }
}
