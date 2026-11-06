package CSE220.LinkedList_GPT;

// Step 26: Compare Two Linked Lists Pairwise
public class Step_26 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static boolean pairWiseEqual(Node a, Node b) {

        while (a!=null && b!=null) {
            if (a.next==null || b.next==null) {
                return false;
            }
            boolean same = a.elem==b.elem && a.next.elem==b.next.elem;
            boolean swapped = a.elem==b.next.elem && a.next.elem==b.elem;

            if (!same && !swapped) {
                return false;
            }
            a=a.next.next;
            b=b.next.next;
        }
        return a==null && b==null;

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

        // List A: 10 -> 15 -> 34 -> 41
        Node a = new Node(10);
        a.next = new Node(15);
        a.next.next = new Node(34);
        a.next.next.next = new Node(41);

        // List B: 15 -> 10 -> 34 -> 41
        Node b = new Node(15);
        b.next = new Node(10);
        b.next.next = new Node(34);
        b.next.next.next = new Node(41);

        printList(a);
        printList(b);

        System.out.println(pairWiseEqual(a, b));
    }
}