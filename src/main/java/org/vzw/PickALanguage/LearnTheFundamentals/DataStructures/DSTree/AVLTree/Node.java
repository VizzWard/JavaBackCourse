package org.vzw.PickALanguage.LearnTheFundamentals.DataStructures.DSTree.AVLTree;

// Node para implementacion de AVL TREE
class Node {
    int key, height;
    Node left, right;

    Node(int d) {
        key = d;
        height = 1;
    }
}
