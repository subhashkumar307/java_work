package com.company;

public class BSTAssignment_2 {
   Node root;

   // Tree Node
   static class Node {
      int data;
      Node left, right;
      Node(int data)
      {
         this.data = data;
         this.left = null;
         this.right = null;
      }
   }
   // Function to insert nodes in level order
   public Node insertLevelOrder(int[] arr, Node root, int i) {
      // Base case for recursion
      if (i < arr.length) {
         Node temp = new Node(arr[i]);
         root = temp;

         // insert of left child
         root.left = insertLevelOrder(arr, root.left, 2 * i + 2);

         // insert of right child
         root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
      }
      return root;
   }

   // Function to print tree nodes in InOrder
   public void inOrder(Node root) {
      if (root != null) {
         inOrder(root.left);
         System.out.print(root.data + " ");
         inOrder(root.right);
      }
   }

   // Driver program to test above function
   public static void main(String[] args) {
      BSTAssignment_2 t2 = new BSTAssignment_2();
      int arr[] = { 25, 35, 45, 31, 51, 60, 46, 8, 18, 5};
      t2.root = t2.insertLevelOrder(arr, t2.root, 0);
      t2.inOrder(t2.root);
   }
}
