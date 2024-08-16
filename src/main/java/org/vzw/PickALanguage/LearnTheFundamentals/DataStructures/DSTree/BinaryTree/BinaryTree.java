package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSTree.BinaryTree;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    // Método para insertar un nuevo nodo
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Método recursivo para insertar un nuevo nodo en el árbol
    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    // Método para buscar un valor en el árbol
    public boolean search(int value) {
        return searchRec(root, value);
    }

    // Método recursivo para buscar un valor en el árbol
    private boolean searchRec(Node root, int value) {
        if (root == null) {
            return false;
        }

        if (root.value == value) {
            return true;
        }

        if (value < root.value) {
            return searchRec(root.left, value);
        } else {
            return searchRec(root.right, value);
        }
    }

    // Método para imprimir el árbol en orden
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    // Método recursivo para imprimir el árbol en orden (inorder traversal)
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    // Método para imprimir el árbol en preorden
    public void preorder() {
        preorderRec(root);
        System.out.println();
    }

    // Método recursivo para imprimir el árbol en preorden (preorder traversal)
    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Método para imprimir el árbol en postorden
    public void postorder() {
        postorderRec(root);
        System.out.println();
    }

    // Método recursivo para imprimir el árbol en postorden (postorder traversal)
    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.value + " ");
        }
    }

    // Método para obtener la altura del árbol
    public int height() {
        return heightRec(root);
    }

    // Método recursivo para calcular la altura del árbol
    private int heightRec(Node root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = heightRec(root.left);
        int rightHeight = heightRec(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Método para contar el número de nodos en el árbol
    public int size() {
        return sizeRec(root);
    }

    // Método recursivo para contar el número de nodos en el árbol
    private int sizeRec(Node root) {
        if (root == null) {
            return 0;
        }
        return sizeRec(root.left) + sizeRec(root.right) + 1;
    }

    // Método para obtener el número de hojas en el árbol
    public int countLeaves() {
        return countLeavesRec(root);
    }

    // Método recursivo para contar el número de hojas en el árbol
    private int countLeavesRec(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return countLeavesRec(root.left) + countLeavesRec(root.right);
    }
}
