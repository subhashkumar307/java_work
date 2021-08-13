package com.company;

//import org.w3c.dom.Node;
class Node {
    //Node root;
    char data;
    Node left, right;
    public Node(char item) {
        data = item;
        left = right = null;
    }
}
class BinaryTree {
    // root of the binary tree
    Node root;

    public BinaryTree() {
        root = null;
    }
    // function to print level order traversal of tree
    void printLevelOrder() {
        int h = height(root);
        for (int i = 1; i <= h; i++)
            printCurrentLevel(root, i);
    }
    // Compute the height of tree
    int height(Node root) {
        if (root == null)
            return 0;
        else {
            // Compute height of each subtree
            int lheight = height(root.left);
            int rheight = height(root.right);

            // use of the larger one
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
    // Print of nodes at the current level
    void printCurrentLevel (Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + "->");
        else if (level > 1) {
            printCurrentLevel(root.left, level-1);
            printCurrentLevel(root.right, level-1);
        }
    }
    // Drive the main function
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node('A');
        tree.root.left = new Node('B');
        tree.root.right = new Node('C');
        tree.root.left.left = new Node('D');
        tree.root.left.right = new Node('E');
        tree.root.right.left = new Node('F');
        tree.root.right.right = new Node('G');

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();
    }
}
//public class BSTAssignment_1 {
//
//}
