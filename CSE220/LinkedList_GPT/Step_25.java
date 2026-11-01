
package CSE220.LinkedList_GPT;

// Step 25: Singly Operations Mixed Revision
public class Step_25 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // Previous Step Helper
    public static int count(Node head) {

        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

    // Previous Step Helper
    public static Node nodeAt(Node head, int index) {

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    // Step 25: Left Rotation
    public static Node rotateLeft(Node head, int k) {

        // Find the length
        int n = count(head);

        // Handle empty list
        if (n == 0) {
            return head;
        }

        // Normalize k
        k = Math.floorMod(k, n);

        // Handle zero rotation
        if (k == 0) {
            return head;
        }

        // Find cut node
        Node cut = nodeAt(head, k - 1);

        // Save new head
        Node newHead = cut.next;

        // Find old tail
        Node tail = nodeAt(head, n - 1);

        // Break old connection
        cut.next = null;

        // Connect old tail to old head
        tail.next = head;

        // Return new head
        return newHead;
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

        head = rotateLeft(head, 2);
        printList(head);

        head = rotateLeft(head, 1);
        printList(head);

        head = rotateLeft(head, -1);
        printList(head);

        head = rotateLeft(head, 0);
        printList(head);

        head = rotateLeft(head, 6);
        printList(head);
    }
}
