
package CSE220.LinkedList_GPT;

// Step 27: Pair Sum / isSumPossible()
public class Step_27 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static boolean isSumPossible(Node head, int target) {

        while (head.next!=null) {
            Node temp = head.next;
        while (temp!=null) {
            if (head.elem+temp.elem==target) {
                return true;
            }
            temp=temp.next;
        }
        head=head.next;
        }
        return false;
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

        Node head = new Node(3);
        head.next = new Node(7);
        head.next.next = new Node(4);
        head.next.next.next = new Node(8);

        printList(head);

        System.out.println(isSumPossible(head, 15));
        System.out.println(isSumPossible(head, 20));
    }
}
