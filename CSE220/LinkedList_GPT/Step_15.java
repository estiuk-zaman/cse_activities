
package CSE220.LinkedList_GPT;

// Step 15: Delete at a Specific Index
public class Step_15 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // Helper from Step 5
    public static Node nodeAt(Node head, int index) {
        if (index < 0) return null;

        Node temp = head;

        for (int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public static Node deleteAt(Node head, int index) {

        if (index==0 && head !=null) {
            return head.next;
        }
        Node prev = nodeAt(head, index-1);
        if (prev==null || prev.next==null) {
            throw new IndexOutOfBoundsException();
        }
        prev.next=prev.next.next;
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
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = deleteAt(head, 2);
        printList(head);

        head = deleteAt(head, 0);
        printList(head);

        head = deleteAt(head, 1);
        printList(head);
    }
}
