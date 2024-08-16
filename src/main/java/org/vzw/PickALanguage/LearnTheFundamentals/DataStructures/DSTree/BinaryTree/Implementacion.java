package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSTree.BinaryTree;

public class Implementacion {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Inserción de nodos
        tree.insert(10);
        tree.insert(5);
        tree.insert(20);
        tree.insert(3);
        tree.insert(7);
        tree.insert(15);
        tree.insert(25);

        // Recorridos del árbol
        System.out.print("Inorder: ");
        tree.inorder();  // Imprime los nodos en orden ascendente

        System.out.print("Preorder: ");
        tree.preorder(); // Imprime los nodos en el orden raíz-izquierda-derecha

        System.out.print("Postorder: ");
        tree.postorder(); // Imprime los nodos en el orden izquierda-derecha-raíz

        // Otras operaciones
        System.out.println("Altura del árbol: " + tree.height());
        System.out.println("Número de nodos: " + tree.size());
        System.out.println("Número de hojas: " + tree.countLeaves());

        // Búsqueda
        System.out.println("¿Contiene el valor 15? " + tree.search(15));
        System.out.println("¿Contiene el valor 100? " + tree.search(100));
    }
}
