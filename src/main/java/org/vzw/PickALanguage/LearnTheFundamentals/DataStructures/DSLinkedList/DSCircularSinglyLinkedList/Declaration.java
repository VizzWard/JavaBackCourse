package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSLinkedList.DSCircularSinglyLinkedList;

public class Declaration {
    public static void main(String[] args) {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        //Añadir elementos a la lista
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(17);
        System.out.println(list.size);
        list.add("A", 5);


        list.printList();
    }
}
