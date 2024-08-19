package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSTree.BTree;

public class Implementacion {
    public static void main(String[] args) {
        // Crear un árbol B con grado (orden) mínimo 3
        BTree bTree = new BTree(3);
        bTree.insert(10);
        bTree.insert(20);
        bTree.insert(5);
        bTree.insert(6);
        bTree.insert(12);
        bTree.insert(30);

        System.out.print("B-tree : ");
        bTree.printBTree();

        int searchKey = 6;
        BTreeNode foundNode = bTree.search(searchKey);

        if (foundNode != null)
            System.out.println("Clave " + searchKey + " encontrada en el B-tree.");
        else
            System.out.println("Clave " + searchKey + " no encontrada en el B-tree.");
    }
}
