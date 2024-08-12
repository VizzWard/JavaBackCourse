package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSLinkedList.CircularDoublyLinkedList;

public class Declaracion {
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        try {
            //Añadir al final
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);

            //Añadir en una posicion especifica
            list.add(0, 0);
            list.add(5, 5);
            list.add('a', 3);

            System.out.println(list.size);
            //Imprimir lista
            list.printList();
            //Imprimir lista al revez
            list.printListReverse();

            //Eliminar ultimo
            list.delete();
            list.printList();

            list.delete(0);
            list.printList();
            list.delete(2);
            list.printList();

            //Search
            boolean search = list.search(4);
            System.out.println(search);

            //Find
            Object find = list.find(0);
            System.out.println(find);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
