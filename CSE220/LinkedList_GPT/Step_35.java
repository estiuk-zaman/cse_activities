
package CSE220.LinkedList_GPT;

// Step 35: Array + Linked List Combined Computation
public class Step_35 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static int count(Node head) {

    int counter = 0;
    Node temp = head;

    while (temp != null) {
        counter++;
        temp = temp.next;
    }

    return counter;
}

    public static long arrayListCombination(int[] a, Node head) {

        int n = a.length;
        if (n!=count(head)) {
            throw new IllegalArgumentException("");
        }
        Node first = head;
        long total =0;

        for (int i = 0; i < n; i++) {
            total+= (first.elem-a[n-1-i]);
            first=first.next;
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

        Node head = new Node(5);
        head.next = new Node(12);
        head.next.next = new Node(8);
        head.next.next.next = new Node(20);

        int[] arr = {2, 10, 4, 7};

        long result = arrayListCombination(arr, head);

        System.out.println("Result: " + result);

        printList(head);
    }
}
