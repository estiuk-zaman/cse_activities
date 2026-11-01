
package CSE220.LinkedList_GPT;

// Step 13: Delete from Beginning
public class Step_13 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static Node deleteFirst(Node head) {

        if (head==null) {
            return null;
        }
        return head.next;

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

        head = deleteFirst(head);
        printList(head);

        head = deleteFirst(head);
        printList(head);

        head = deleteFirst(head);
        printList(head);

        head = deleteFirst(head);
        printList(head);
    }
}
