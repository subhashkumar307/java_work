public class DoublyLinkedList {
    //default constructor
    DoublyLinkedList()
    {
        System.out.println("Doubly linked list was successfully created");
    }
    // start of the linked list
    Node head;

    class Node {
        int data;
        Node prev;
        Node next;
        Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    // Methods of the Linked List
    // 1 Add a data in start of the linked list
    public void insertStart(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        // if there is an already existing linked list
        if (head != null)
            head.prev = newNode;
        head = newNode;
    }
    //2 Add a data after a node (Node, data)
    // insert after
    public void insertAfter(Node prevNode, int newData){
        if (prevNode == null)
            System.out.println("The node passed does not exist");

        Node newNode = new Node(newData);

        // set the address
        newNode.prev = prevNode;
        newNode.next = prevNode.next;
        prevNode.next = newNode;

        if (newNode.next != null)
            newNode.next.prev = newNode;
    }
    // 3 Add a data at the end of the linked list
    public void insertEnd(int newData){
        Node newNode = new Node(newData);
        // set the address
        Node temp = head;
        //if the linked list does not exist
        if (head == null){
            head = newNode;
            return;
        }
        // Reach to the end of the linked list
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }
    public void printList(Node head) {
        Node temp = head;
        System.out.println("Printing the values in the forward direction ");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
        System.out.println("Printing the values in the backend direction");

        // taking temp to the end of the linked list
        while (temp.next != null)
            temp = temp.next;

        while (temp.prev != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertEnd(5);
        dll.insertStart(10);
        dll.insertEnd(15);
        dll.insertEnd(20);
        dll.insertAfter(dll.head.next.next, 100);
        dll.printList(dll.head);
    }
}
