public class BinarySearchTree {
    Node root;

    class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    // Constructor
    BinarySearchTree() {
        root = null;
    }
    // Encapsulated Code
    public void  insert(int data) {

        root = insertData(root, data);
    }
    public  void inOrder() {

        inOrderTraversal(root);
    }

    public void preOrder() {
        preOrderTraversal(root);
    }

    public void postOrder() {
        postOrderTraversal(root);
    }

    // Search Method
    public void search(int key) {
        root = searchData(root, key);
        if (root == null)
            System.out.println(key + " does not exist in the BST");
        else
            System.out.println(key + " exists in the BST");
    }
    // Delete Method
    public void delete(int data) {
        root = deleteKey(root, data);
    }
        // Method Implementations

        // 1 insert (data)
        private Node insertData(Node root, int key) {
            // The first data will be root element
            if (root == null) {
                root = new Node(key);
                return root;
            }
            // If the data is less than the root, insert to the left part
            if (key < root.data)
                root.left = insertData(root.left, key);
            // If the data is greater than the root, inserted to the right part
            else if (key > root.data)
                root.right = insertData(root.right, key);

            return root;
        }

        // 2 Search(int data)
        private Node searchData(Node root, int data) {
        if (root == null || root.data == data)
            return root;
        if (data < root.data)
            return searchData(root.left, data);

        return searchData(root.right, data);
        }

        // 3 DeleteKey(int data)
        private Node deleteKey(Node root, int data) {
        if (root == null)
            return root;

        if (data < root.data)
            root.left = deleteKey(root.left, data);

        else if (data > root.data)
            root.right = deleteKey(root.right, data);

        // When the data is found
        else {
            // Case 1 + Case 2 ---> Node is a leaf node / Only has left or right child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = minValue(root.right);

            root.right = deleteKey(root.right, root.data);
        }
        return root;
        }
        private int minValue(Node root) {
           int min = root.data;
           while (root.left != null) {
               min = root.left.data;
               root = root.left;
           }
           return min;
        }

        //Inorder Traversal (LDR)
        private void inOrderTraversal(Node root) {
            //Recursion
            if (root != null) {
                inOrderTraversal(root.left);
                System.out.print(root.data + " ");
                inOrderTraversal(root.right);
            }
        }

    // Preorder traversal (DLR)
    private void preOrderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
    // Postorder Traversal (LRD)
    private void postOrderTraversal(Node root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

}
class BST {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(25);
        bst.insert(35);
        bst.insert(45);
        bst.insert(31);
        bst.insert(51);
        bst.insert(60);
        bst.insert(46);
        bst.insert(8);
        bst.insert(18);
        bst.insert(5);

        System.out.println("*** Inorder Traversal ***");
        bst.inOrder();
        System.out.println();

        System.out.println("*** Preorder Traversal ***");
        bst.preOrder();
        System.out.println();

        System.out.println("*** Postorder Traversal ***");
        bst.postOrder();
        System.out.println();

        //bst.search(51);
        //bst.search(100);

        bst.delete(5);
        bst.inOrder();
        System.out.println();

        bst.delete(45);
        bst.inOrder();
        System.out.println();

        bst.delete(25);
        bst.inOrder();
        System.out.println();
    }
}