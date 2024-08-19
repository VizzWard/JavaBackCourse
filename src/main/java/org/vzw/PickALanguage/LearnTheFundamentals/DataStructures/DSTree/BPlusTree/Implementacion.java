package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSTree.BPlusTree;

public class Implementacion {
    public static void main(String[] args) {
        BPlusTree tree = new BPlusTree(3);

        // Insertar claves en el árbol B+
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(60);

        // Imprimir la estructura del árbol B+
        System.out.println("Árbol después de la inserción:");
        tree.printTree();

        // Búsqueda de llaves en el árbol B+
        System.out.println("Buscar 30: " + tree.search(30));  // True
        System.out.println("Buscar 25: " + tree.search(25));  // False
    }
}
