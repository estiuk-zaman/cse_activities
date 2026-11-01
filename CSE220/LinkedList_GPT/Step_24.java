
package CSE220.LinkedList_GPT;

// Step 24: Pairwise + Alternate Node Traversal
public class Step_24 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // Exercise 1: Print sum of non-overlapping pairs
    public static void pairs(Node head) {

        Node temp = head;
        while (temp!=null && temp.next!=null) {
            System.out.println(temp.elem+temp.next.elem);
                temp=temp.next.next;
        }
    }

    // Exercise 2: Print alternate node values
    public static void alternate(Node head) {

        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.elem);
            if (temp.next!=null) {
                temp=temp.next.next;
            }
            else{
                temp=null;
            }
        }

    }

    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.elem + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Original List:");
        printList(head);

        System.out.println("Pairwise Sums:");
        pairs(head);

        System.out.println("Alternate Nodes:");
        alternate(head);

        System.out.println("Original List After Operations:");
        printList(head);
    }
}
