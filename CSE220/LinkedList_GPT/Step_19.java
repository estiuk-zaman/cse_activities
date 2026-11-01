
package CSE220.LinkedList_GPT;

// Step 19: Reverse a Linked List
public class Step_19 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static Node reverse(Node head) {

        Node current = head;
        Node prev = null;
        while (current!=null) {
            Node nextNode = current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        return prev;
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

        System.out.println("Before reverse:");
        printList(head);

        head = reverse(head);

        System.out.println("After reverse:");
        printList(head);
    }
}
