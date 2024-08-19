package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSTree.BPlusTree;

import java.util.ArrayList;
import java.util.List;

// Clase B+ Tree Node
// Representa los nodos internos y hojas
class BPlusTreeNode {
    // True para nodos hoja, False para nodos internos
    boolean isLeaf;

    // Las claves almacenadas en este nodo
    List<Integer> keys;

    // Nodos hijos (para nodos internos)
    List<BPlusTreeNode> children;

    // Enlace al siguiente nodo hoja
    BPlusTreeNode next;

    // Constructor
    public BPlusTreeNode(boolean isLeaf) {
        this.isLeaf = isLeaf;
        this.keys = new ArrayList<>();
        this.children = new ArrayList<>();
        this.next = null;
    }
}
