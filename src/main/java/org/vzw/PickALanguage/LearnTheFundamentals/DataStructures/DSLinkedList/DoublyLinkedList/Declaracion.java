package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSLinkedList.DoublyLinkedList;

public class Declaracion {
    public  static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        //Llamada al metodo para añadir al final
        list.add("up");
        list.add("down");
        list.add("left");
        list.add("right");
        list.add("quince");
        list.add("doce");
        list.add(15);
        list.add(10);
        list.add(56);
        list.add('a');
        //Llamada al metodo para añadir al principio
        list.add("first", true);
        //Llamada al metodo para añadir en una posicion determinada
        list.add("second", 1);

        //Llamada al metodo para imprimir
        list.printList();
        //etodo para imprimir al revez
        list.printList(true);

        //Llamada al metodo para eliminar el ultimo elemento
        list.delete();
        list.printList(); // metodo print

        //Llamada al metodo para eliminar el primer elemento
        list.delete(true);
        list.printList(); // metodo print

        //Llamada al metodo para eliminar el elemento de una posicion determinada
        list.delete(2);
        list.printList(); // metodo print

        //Llamada al metodo search - para ver si el elemento existe
        boolean existe = list.search("doce");
        System.out.println(existe);

        //Llamada al metodo searchPosition - para ver si el elemento existe y retornar la posicion
        int posicion = list.searchPosition("quince");
        System.out.println(posicion);

        //Llamada al metodo find - para buscar el dato que esta en una posicion
        Object dato = list.find(8);
        System.out.println(dato);
    }
}
