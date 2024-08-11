package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSLinkedList.CircularSinglyLinkedList;

public class Declaracion {
    public static void main(String[] args) {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        //Añadir elementos a la lista
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);

        try {
            //añadir en una posicion (si es 0, añade al imicio)
            list.add("A", 7);
            System.out.println(list.size);

            //Imprimir lista
            list.printList();

            //Eliminar el ultimo elemento
            list.delete();
            list.printList();

            //Eliminar el primer elemento
            list.delete(0);
            list.printList();

            //Eliminar una posicion especifica
            list.delete(4);
            list.printList();

            //Buscar si existe un elemento en la lista
            boolean elemento = list.search(18);
            System.out.println(elemento);

            //Buscar la posicion de un elemento
            int posicion = list.searchIndex(18);
            System.out.println(posicion);

            //Find
            Object element = list.find(18);
            System.out.println(element);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
