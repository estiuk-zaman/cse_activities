
package CSE220.LinkedList_GPT;

// Step 37: Range Detection / Conditional Traversal
public class Step_37 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // Previous Step Helper: Traversal
    public static void traverse(Node head) {

        Node current = head;

        while (current != null) {
            System.out.println(current.elem);
            current = current.next;
        }
    }

    // TODO 1: Check whether ALL values are inside the range
    public static boolean allInside(Node head, int low, int high) {

        if (low>high) {
            throw new IllegalArgumentException("");
        }
        for (Node i = head; i != null; i=i.next) {
            if (i.elem<low || i.elem>high) {
                return false;
            }
        }
        return true;
    }

    // TODO 2: Print readings only if ALL values are valid
    public static void validateReadings(Node head, int low, int high) {

        if (allInside(head, low, high)) {
            traverse(head);
        }
        else {
        System.out.println("Reading out of range detected.");
    }


    }

    public static void main(String[] args) {

        Node head = new Node(12);
        head.next = new Node(18);
        head.next.next = new Node(25);

        validateReadings(head, 10, 20);

        System.out.println("------");

        Node head2 = new Node(12);
        head2.next = new Node(15);
        head2.next.next = new Node(18);

        validateReadings(head2, 10, 20);
    }
}
