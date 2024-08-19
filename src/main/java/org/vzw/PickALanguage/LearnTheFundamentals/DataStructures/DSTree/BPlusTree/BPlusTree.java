package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSTree.BPlusTree;

import java.util.Collections;

// B+ Tree - Clase con operaciones básicas: insertar y buscar
class BPlusTree {
    // Nodo raíz del árbol
    private BPlusTreeNode root;

    // Número máximo de claves por nodo
    private final int order;

    // Constructor
    public BPlusTree(int order) {
        if (order < 3) {
            throw new IllegalArgumentException("El orden tiene que se de almenos 3");
        }
        this.root = new BPlusTreeNode(true);
        this.order = order;
    }

    // Buscar el nodo hoja adecuado para la inserción
    private BPlusTreeNode findLeaf(int key) {
        BPlusTreeNode node = root;
        while (!node.isLeaf) {
            int i = 0;
            while (i < node.keys.size() && key >= node.keys.get(i)) {
                i++;
            }
            node = node.children.get(i);
        }
        return node;
    }

    // Insertar una llave en el árbol B+
    public void insert(int key) {
        BPlusTreeNode leaf = findLeaf(key);
        insertIntoLeaf(leaf, key);

        // Dividir el nodo hoja si supera el orden
        if (leaf.keys.size() > order - 1) {
            splitLeaf(leaf);
        }
    }

    // Insertar en el nodo hoja
    private void insertIntoLeaf(BPlusTreeNode leaf, int key) {
        int pos = Collections.binarySearch(leaf.keys, key);
        if (pos < 0) {
            pos = -(pos + 1);
        }
        leaf.keys.add(pos, key);
    }

    // Dividir un nodo hoja y actualizar los nodos padre
    private void splitLeaf(BPlusTreeNode leaf) {
        int mid = (order + 1) / 2;
        BPlusTreeNode newLeaf = new BPlusTreeNode(true);

        // Mover la mitad de las llaves al nuevo nodo hoja
        newLeaf.keys.addAll(leaf.keys.subList(mid, leaf.keys.size()));
        leaf.keys.subList(mid, leaf.keys.size()).clear();

        newLeaf.next = leaf.next;
        leaf.next = newLeaf;

        // Si la raíz se divide, crea una nueva raíz
        if (leaf == root) {
            BPlusTreeNode newRoot = new BPlusTreeNode(false);
            newRoot.keys.add(newLeaf.keys.get(0));
            newRoot.children.add(leaf);
            newRoot.children.add(newLeaf);
            root = newRoot;
        } else {
            insertIntoParent(leaf, newLeaf, newLeaf.keys.get(0));
        }
    }

    // Insertar en el nodo padre tras una división en hoja
    private void insertIntoParent(BPlusTreeNode left, BPlusTreeNode right, int key) {
        BPlusTreeNode parent = findParent(root, left);

        if (parent == null) {
            throw new RuntimeException("Nodo padre no encontrado para la inserción");
        }

        int pos = Collections.binarySearch(parent.keys, key);
        if (pos < 0) {
            pos = -(pos + 1);
        }

        parent.keys.add(pos, key);
        parent.children.add(pos + 1, right);

        // Dividir el nodo interno si supera la orden
        if (parent.keys.size() > order - 1) {
            splitInternal(parent);
        }
    }

    // Dividir un nodo interno
    private void splitInternal(BPlusTreeNode internal) {
        int mid = (order + 1) / 2;
        BPlusTreeNode newInternal = new BPlusTreeNode(false);

        // Mover la mitad de las llaves al nuevo nodo interno
        newInternal.keys.addAll(internal.keys.subList(mid + 1, internal.keys.size()));
        internal.keys.subList(mid, internal.keys.size()).clear();

        // Mover la mitad de los hijos al nuevo nodo interno
        newInternal.children.addAll(internal.children.subList(mid + 1, internal.children.size()));
        internal.children.subList(mid + 1, internal.children.size()).clear();

        // Si la raíz se divide, crea una nueva raíz
        if (internal == root) {
            BPlusTreeNode newRoot = new BPlusTreeNode(false);
            newRoot.keys.add(internal.keys.get(mid));
            newRoot.children.add(internal);
            newRoot.children.add(newInternal);
            root = newRoot;
        } else {
            insertIntoParent(internal, newInternal, internal.keys.remove(mid));
        }
    }

    // Encontrar el nodo padre de un nodo dado
    private BPlusTreeNode findParent(BPlusTreeNode current, BPlusTreeNode target) {
        if (current.isLeaf || current.children.isEmpty()) {
            return null;
        }

        for (int i = 0; i < current.children.size(); i++) {
            BPlusTreeNode child = current.children.get(i);

            if (child == target) {
                // Padre encontrado
                return current;
            }

            BPlusTreeNode possibleParent = findParent(child, target);
            if (possibleParent != null) {
                return possibleParent;
            }
        }

        // Padre no encontrado
        return null;
    }

    // Buscar una llave en el árbol B+
    public boolean search(int key) {
        BPlusTreeNode node = findLeaf(key);
        int pos = Collections.binarySearch(node.keys, key);
        return pos >= 0;
    }

    // Visualizar el árbol (con fines de depuración)
    public void printTree() {
        printNode(root, 0);
    }

    private void printNode(BPlusTreeNode node, int level) {
        System.out.println("Level " + level + ": " + node.keys);
        if (!node.isLeaf) {
            for (BPlusTreeNode child : node.children) {
                printNode(child, level + 1);
            }
        }
    }
}