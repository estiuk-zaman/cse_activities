
package CSE220.LinkedList_GPT;

// Step 39: BAD Node Removal + Zigzag Rearrangement
public class Step_39 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // Exercise 1: BAD Node Removal
    public static Node moveTheBad(Node head) {

        Node good = null;
        Node bad = null;
        Node temp = head;
        while (temp!=null) {
            if (temp==head || temp.next==null) {
                
            }
        }
    }

    // Exercise 2: Zigzag Rearrangement
    public static Node zigzag(Node head) {

        // TODO: Implement your solution

        return head;
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

        // Test 1: BAD Node Removal
        Node head1 = new Node(5);
        head1.next = new Node(1);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(2);
        head1.next.next.next.next = new Node(6);

        head1 = moveTheBad(head1);
        printList(head1);

        // Expected: 5 -> 4 -> 6 -> 1 -> 2 -> null


        // Test 2: Zigzag
        Node head2 = new Node(4);
        head2.next = new Node(3);
        head2.next.next = new Node(7);
        head2.next.next.next = new Node(8);
        head2.next.next.next.next = new Node(6);

        head2 = zigzag(head2);
        printList(head2);

        // Expected: 3 -> 7 -> 4 -> 8 -> 6 -> null
    }
}
