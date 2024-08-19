package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSTree.AVLTree;

public class Implementacion {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        // Insert nodes
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        // Print preorder traversal of the tree
        System.out.println("Preorder traversa: ");
        tree.preOrder(tree.root);
        System.out.println();

        // Print inorder traversal of the tree
        System.out.println("Inorder traversal: ");
        tree.inOrder(tree.root);
        System.out.println();

        // Print postorder traversal of the tree
        System.out.println("Postorder traversal: ");
        tree.postOrder(tree.root);
        System.out.println();
    }
}
