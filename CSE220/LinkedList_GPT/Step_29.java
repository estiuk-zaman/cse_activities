
package CSE220.LinkedList_GPT;

// Step 29: Reverse + Swap / Partial Rearrangement
public class Step_29 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // Previous helper: Step 5
    public static Node nodeAt(Node head, int index) {

        if (index < 0) return null;

        Node temp = head;

        for (int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }

        return temp;
    }

    // Previous helper: Step 4
    public static int count(Node head) {

        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

    // Previous helper: Reverse a portion
    // Positions are 1-based and inclusive.
    public static Node reverseBetween(Node head, int m, int n) {

        if (m < 1 || n < m || nodeAt(head, n - 1) == null) {
            throw new IndexOutOfBoundsException();
        }

        Node before = (m == 1) ? null : nodeAt(head, m - 2);
        Node start = (before == null) ? head : before.next;

        Node current = start;
        Node prev = null;

        for (int i = 0; i < n - m + 1; i++) {

            Node after = current.next;
            current.next = prev;

            prev = current;
            current = after;
        }

        start.next = current;

        if (before == null) {
            head = prev;
        } else {
            before.next = prev;
        }

        return head;
    }

    // Previous helper: Step 25
    public static Node rotateLeft(Node head, int k) {

        int n = count(head);

        if (n == 0) return head;

        k = k % n;

        if (k == 0) return head;

        Node cut = nodeAt(head, k - 1);
        Node newHead = cut.next;
        Node tail = nodeAt(head, n - 1);

        cut.next = null;
        tail.next = head;

        return newHead;
    }

    // STEP 29: YOUR TASK
    public static Node reverseAndSwap(Node head, int i) {

        if (nodeAt(head, i)==null) {
            throw new IndexOutOfBoundsException();
        }

        head = reverseBetween(head, 1, i+1);
        head = rotateLeft(head, i+1);
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

        Node head = new Node(5);
        head.next = new Node(7);
        head.next.next = new Node(6);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(8);

        System.out.println("Original List:");
        printList(head);

        head = reverseAndSwap(head, 2);

        System.out.println("After Reverse + Swap:");
        printList(head);
    }
}
