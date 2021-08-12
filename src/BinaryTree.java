class Node {
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class BinaryTree {
    // point towards the root of the tree
    Node root;

    // default constructor

    BinaryTree() {

        System.out.println("***Binary tree has created successfully***");
    }
    // parameterized constructor
    BinaryTree(int data) {
        root = new Node(data);
        System.out.println("***Binary tree has been created successfully***");
    }
    // Encapsulated code
    public void inOrder() {
        inOrderTraversal(root);
    }

    public void preOrder() {
        preOrderTraversal(root);
    }

    public void postOrder() {
        postOrderTraversal(root);
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
    // Main Method
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(70);

        System.out.println("*** Inorder Traversal ***");
        tree.inOrder();
        System.out.println();

        System.out.println("*** Preorder Traversal ***");
        tree.preOrder();
        System.out.println();

        System.out.println("*** Postorder Traversal ***");
        tree.postOrder();
        System.out.println();
    }
}
