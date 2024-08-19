package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSTree.BTree;

public class BTree {
    // Puntero al nodo raíz
    private BTreeNode root;

    // Orden minimo
    private int t;

    public BTree(int t) {
        this.t = t;
        root = null;
    }

    // Función para buscar una clave en este árbol
    public BTreeNode search(int key) {
        return (root == null) ? null : root.search(key);
    }

    // Función para insertar una clave en el árbol B
    public void insert(int key) {
        if (root == null) {
            root = new BTreeNode(t, true);
            root.keys[0] = key;
            root.n = 1;
        } else {
            if (root.n == 2 * t - 1) {
                BTreeNode newRoot = new BTreeNode(t, false);
                newRoot.children[0] = root;
                newRoot.splitChild(0, root);

                int i = 0;

                if (newRoot.keys[0] < key)
                    i++;

                newRoot.children[i].insertNonFull(key);
                root = newRoot;
            } else {
                root.insertNonFull(key);
            }
        }
    }

    // Función para imprimir el árbol B completo
    public void printBTree() {
        if (root != null)
            root.printInOrder();

        System.out.println();
    }
}
