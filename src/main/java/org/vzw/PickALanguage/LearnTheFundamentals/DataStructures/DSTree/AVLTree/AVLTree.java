package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSTree.AVLTree;

class AVLTree {

    Node root;

    // Obtener la altura del nodo
    int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }

    // Obtener el máximo de dos enteros
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Rotar a la derecha el subárbol enraizado con y
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Realizar rotación
        x.right = y;
        y.left = T2;

        // Actualizar alturas
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        // Devolver nueva raíz
        return x;
    }

    // Girar a la izquierda el subárbol enraizado en x
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Realizar rotación
        y.left = x;
        x.right = T2;

        // Actualizar alturas
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        // Devolver nueva raíz
        return y;
    }

    // Obtener factor de balance del Nodo
    int getBalance(Node N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    // Insertar una clave en el subárbol enraizado con el nodo
    // y devuelve la nueva raíz del subárbol
    Node insert(Node node, int key) {
        // Realizar la inserción normal del BST
        if (node == null)
            return (new Node(key));

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else // No se permite duplicar claves (datos)
            return node;

        // Actualizar la altura de este nodo ancestro
        node.height = 1 + max(height(node.left), height(node.right));

        // Obtener el factor de equilibrio de este nodo ancestro
        // para comprobar si este nodo se desequilibró
        int balance = getBalance(node);

        // Si este nodo se desequilibra, se dan 4 casos

        // LL Case
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // RR Case
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // LR Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        // Devuelve el puntero del nodo (sin cambios)
        return node;
    }

    //Función de utilidad para imprimir el recorrido preordenado del árbol
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // Función de utilidad para imprimir el recorrido en orden del árbol
    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }

    // Función de utilidad para imprimir el recorrido postorden del árbol
    void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.key + " ");
        }
    }
}
