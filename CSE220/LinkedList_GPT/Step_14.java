
package CSE220.LinkedList_GPT;

// Step 14: Delete from End
public class Step_14 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static Node deleteLast(Node head) {

        if (head==null || head.next==null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
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

        head = deleteLast(head);
        printList(head);

        head = deleteLast(head);
        printList(head);
    }
}
