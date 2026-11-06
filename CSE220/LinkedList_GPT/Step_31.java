
package CSE220.LinkedList_GPT;

// Step 31: Rearrange Nodes from a Given Position
public class Step_31 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // Previous Step Helper
    public static Node nodeAt(Node head, int index) {

        Node temp = head;

        for (int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }

        return temp;
    }

    // Previous Step Helper
    public static Node rotateLeft(Node head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        Node newTail = nodeAt(head, k - 1);

        if (newTail == null || newTail.next == null) {
            return head;
        }

        Node newHead = newTail.next;

        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = head;
        newTail.next = null;

        return newHead;
    }

    // TODO: Your Task
    public static Node rearrangeTokens(Node head, int seniorPos) {

        if (seniorPos<1 || nodeAt(head, seniorPos-1)==null) {
            return head;
        }
        return rotateLeft(head, seniorPos-1);

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

        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(0);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(7);

        System.out.println("Original List:");
        printList(head);

        head = rearrangeTokens(head, 4);

        System.out.println("After Rearrangement:");
        printList(head);
    }
}
