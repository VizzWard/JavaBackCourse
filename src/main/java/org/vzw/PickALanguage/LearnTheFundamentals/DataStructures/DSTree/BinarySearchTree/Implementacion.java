package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSTree.BinarySearchTree;

public class Implementacion {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Insertar algunos valores
        tree.insert(45);
        tree.insert(15);
        tree.insert(79);
        tree.insert(90);
        tree.insert(10);
        tree.insert(55);
        tree.insert(12);
        tree.insert(20);
        tree.insert(50);

        // Eliminar un nodo hoja
        tree.delete(12);

        // Eliminar un nodo con un solo hijo
        tree.delete(55);

        // Eliminar un nodo con dos hijos
        tree.delete(15);

        // Buscar un valor
        Node result = tree.search(55);
        if (result != null) {
            System.out.println("Elemento encontrado: " + result.data);
        } else {
            System.out.println("Elemento no encontrado");
        }

        // Buscar un valor
        result = tree.search(90);
        if (result != null) {
            System.out.println("Elemento encontrado: " + result.data);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}