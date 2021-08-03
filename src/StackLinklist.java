import static java.lang.System.exit;
public class StackLinklist {
    public class Node {
        int data;
        Node link;
    }
    Node top;
    StackLinklist() {
        this.top = null;
    }
    public void push(int x) {
        //create node
        Node temp = new Node();
        if (temp == null) {
            System.out.println("\n Heap Overflow ");
            return;
        }
        //insert data
        temp.data = x;
        temp.link = top;
        top = temp;
    }

    public void display() {
        if (top == null){
            System.out.println("\n Heap Underflow ");
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.printf("%d-> ", temp.data);
                temp = temp.link;
            }
        }
    }
    public static void main(String args[]){
        StackLinklist obj = new StackLinklist();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.display();
        System.out.println("\n Top element is");
    }
}

