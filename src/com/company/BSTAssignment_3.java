package com.company;
import java.util.*;
public class BSTAssignment_3 {
    // Node of binary tree
    static class node {
        int data;
        node left, right;

        node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    // Function to print of binary tree
    static void print(node parent)
    {
        node curr = parent;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }
    static node prev;

    // Function to perform reverse in-order traversal
    static void revInorder(node curr) {
        // Base Case
        if (curr == null)
            return;
        revInorder(curr.right);
        prev.left = null;
        prev.right = curr;
        prev = curr;
        revInorder(curr.left);
    }
    // Function to flatten binary tree using level order traversal
    static node flatten(node parent) {
        // Dummy node
        node dummy = new node(-1);

        // Pointer to previous element
        prev = dummy;

        // Calling in-order traversal
        revInorder(parent);
        prev.left = null;
        prev.right = null;
        node ret = dummy.right;

        // Delete dummy node
        return ret;
    }
    // Drive main
    public static void main(String[] args) {
        node root = new node(5);
        root.left = new node(3);
        root.right = new node(7);
        root.left.left = new node(2);
        root.left.right = new node(4);
        root.right.left = new node(6);
        root.right.right = new node(8);

        // Calling required function
        print(flatten(root));
    }
}
