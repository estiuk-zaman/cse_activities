
package CSE220.LinkedList_GPT;

// Step 17: Delete All Occurrences of a Value
public class Step_17 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static Node deleteAll(Node head, int key) {

        while (head!=null && head.elem==key) {
            head=head.next;
        }
        Node prev = head;
        while (prev!=null && prev.next!=null) {
            if (prev.next.elem==key) {
                prev.next=prev.next.next;
            }
            else{
                prev=prev.next;
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

        Node head = new Node(4);
        head.next = new Node(7);
        head.next.next = new Node(4);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(9);

        head = deleteAll(head, 4);
        printList(head);
    }
}
