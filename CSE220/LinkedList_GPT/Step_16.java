
package CSE220.LinkedList_GPT;

// Step 16: Delete First Occurrence of a Value
public class Step_16 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static Node deleteValue(Node head, int key) {

        if (head==null) {
            return null;
        }
        if (head.elem==key) {
            return head.next;
        }
        Node prev = head;
        while (prev.next!=null) {
            if (prev.next.elem==key) {
                prev.next=prev.next.next;
                break;
            }
            prev=prev.next;
        }
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
        head.next = new Node(8);
        head.next.next = new Node(3);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(2);

        head = deleteValue(head, 8);
        printList(head);

        head = deleteValue(head, 5);
        printList(head);

        head = deleteValue(head, 99);
        printList(head);
    }
}
