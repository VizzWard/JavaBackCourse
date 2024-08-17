package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSTree.BinarySearchTree;

class BinarySearchTree {
    Node root;

    // Constructor para inicializar el árbol
    BinarySearchTree() {
        root = null;
    }

    // Método de búsqueda
    public Node search(Node root, int item) {
        if (root == null || root.data == item) {
            return root;
        }

        if (item < root.data) {
            return search(root.left, item);
        }

        return search(root.right, item);
    }

    // Sobrecarga del método search para iniciar la búsqueda desde la raíz
    public Node search(int item) {
        return search(root, item);
    }

    // Método para insertar un nuevo nodo en el BST
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // Método recursivo para insertar un nuevo nodo
    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // Método para eliminar un nodo en el BST
    public void delete(int data) {
        root = deleteRec(root, data);
    }

    // Método recursivo para eliminar un nodo
    Node deleteRec(Node root, int data) {
        if (root == null) return root;

        // Buscar el nodo a eliminar
        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            // Caso 1: El nodo a eliminar es un nodo hoja
            if (root.left == null && root.right == null) {
                return null;
            }

            // Caso 2: El nodo a eliminar tiene un solo hijo
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Caso 3: El nodo a eliminar tiene dos hijos
            // Obtener el sucesor inorder (el menor nodo en el subárbol derecho)
            root.data = minValue(root.right);

            // Eliminar el sucesor inorder
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    // Método para encontrar el valor mínimo en un subárbol
    int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }
}
