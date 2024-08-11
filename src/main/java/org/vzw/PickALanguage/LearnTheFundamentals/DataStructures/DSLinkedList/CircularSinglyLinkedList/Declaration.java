package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSLinkedList.CircularSinglyLinkedList;

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

        //añadir en una posicion (si es 0, añade al imicio)
        list.add("A", 7);
        System.out.println(list.size);

        //Imprimir lista
        list.printList();

        //Eliminar el ultimo elemento
        list.delete();
        list.printList();
        System.out.println(list.size);
    }
}
