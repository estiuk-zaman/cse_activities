
package CSE220.LinkedList_GPT;

// Step 33: Two-End Pair Processing
public class Step_33 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // Previous step helper
    public static int count(Node head) {
        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

    // Previous step helper
    public static Node nodeAt(Node head, int index) {
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    // TODO: Complete this method
    public static long twoEnds(Node head, boolean sumMode) {

        Node start = head;
        long total = 0;
        int n = count(head);
        if (n%2!=0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < n/2; i++) {
            Node last = nodeAt(head, n-1-i);
            
            if (sumMode && i==0) {
                total=start.elem+last.elem;
            }
            else if (sumMode && i>0){
                total=total-(start.elem+last.elem);
            }

            if (!sumMode && i==0) {
                total=start.elem-last.elem;
            }
            else if (!sumMode && i>0){
                total=total+(start.elem-last.elem);
            }
            start=start.next;
        }
        return total;

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

        Node head = new Node(9);
        head.next = new Node(11);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);

        printList(head);

        System.out.println("Sum Mode: "
                + twoEnds(head, true));

        System.out.println("Difference Mode: "
                + twoEnds(head, false));
    }
}
