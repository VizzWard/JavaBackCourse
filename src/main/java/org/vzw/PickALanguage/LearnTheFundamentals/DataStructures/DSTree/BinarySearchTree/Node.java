package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSTree.BinarySearchTree;

// Clase interna para representar un nodo en el árbol
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
