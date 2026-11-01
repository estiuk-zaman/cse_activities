
package CSE220.LinkedList_GPT;

// Step 23: Duplicate Handling / Remove Duplicates
public class Step_23 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static Node uniqueSorted(Node head) {

        Node current = head;
        while (current!=null && current.next!=null) {
            if (current.elem==current.next.elem) {
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
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

        Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next = new Node(8);

        head = uniqueSorted(head);

        printList(head);
    }
}
