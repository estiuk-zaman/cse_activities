
package CSE220.LinkedList_GPT;

// Step 36: Maximum Consecutive Occurrence
public class Step_36 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static int maxRun(Node head) {

        if (head==null) {
            return 0;
        }
        Node temp =head;
        int run=1;
        int best=1;

        while (temp.next!=null) {
            if (temp.elem==temp.next.elem) {
                run++;
            }
            else{
                run=1;
            }
            if (run>best) {
                best=run;
            }
            temp=temp.next;
        }
        return best;

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
        head.next.next = new Node(7);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(7);
        head.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next = new Node(3);

        printList(head);

        System.out.println("Maximum Run: " + maxRun(head));
    }
}
