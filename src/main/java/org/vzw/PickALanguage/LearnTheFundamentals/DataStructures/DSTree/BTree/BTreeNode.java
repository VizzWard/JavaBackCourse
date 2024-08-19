package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSTree.BTree;

class BTreeNode {
    // Declaracion de variables
    int[] keys; // Matriz para almacenar claves
    int t; // Grado mínimo (define el rango para el número de teclas)
    BTreeNode[] children; // Matriz para almacenar punteros hijo
    int n; // Número actual de claves
    boolean leaf; // True cuando el nodo es hoja, si no False

    public BTreeNode(int t, boolean leaf) {
        this.t = t;
        this.leaf = leaf;

        keys = new int[2 * t - 1];
        children = new BTreeNode[2 * t];
        n = 0;
    }

    // Función para buscar una clave dada en un subárbol
    // enraizado con este nodo
    public BTreeNode search(int key) {
        int i = 0;

        while (i < n && key > keys[i])
            i++;

        if (keys[i] == key)
            return this;

        if (leaf)
            return null;

        return children[i].search(key);
    }

    // Función para insertar una nueva tecla
    // en el subárbol enraizado con este nodo
    public void insertNonFull(int key) {
        int i = n - 1;

        if (leaf) {
            while (i >= 0 && key < keys[i]) {
                keys[i + 1] = keys[i];
                i--;
            }
            keys[i + 1] = key;
            n++;
        } else {
            while (i >= 0 && key < keys[i])
                i--;
            i++;

            if (children[i].n == 2 * t - 1) {
                splitChild(i, children[i]);
                if (key > keys[i])
                    i++;
            }
            children[i].insertNonFull(key);
        }
    }

    // Función para dividir el nodo hijo
    public void splitChild(int i, BTreeNode y) {
        BTreeNode z = new BTreeNode(y.t, y.leaf);
        z.n = t - 1;

        for (int j = 0; j < t - 1; j++)
            z.keys[j] = y.keys[j + t];

        if (!y.leaf) {
            for (int j = 0; j < t; j++)
                z.children[j] = y.children[j + t];
        }

        y.n = t - 1;

        for (int j = n; j >= i + 1; j--)
            children[j + 1] = children[j];

        children[i + 1] = z;

        for (int j = n - 1; j >= i; j--)
            keys[j + 1] = keys[j];

        keys[i] = y.keys[t - 1];
        n++;
    }

    // Función para imprimir todas las teclas del
    // subárbol enraizado con este nodo
    public void printInOrder() {
        int i;

        for (i = 0; i < n; i++) {
            if (!leaf)
                children[i].printInOrder();
            System.out.print(keys[i] + " ");
        }

        if (!leaf)
            children[i].printInOrder();
    }
}
