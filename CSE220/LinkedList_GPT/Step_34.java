
package CSE220.LinkedList_GPT;

// Step 34: Palindrome + Reverse-Match Problems
public class Step_34 {

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

    // Exercise 1: Check Palindrome
    public static boolean palindrome(Node head) {

        int n = count(head);
        Node first = head;
        for (int i = 0; i < n/2; i++) {
            Node last = nodeAt(head, n-1-i);
            if (first.elem!=last.elem) {
                return false;
            }
            first=first.next;
        }
        return true;

    }

    // Exercise 2: Check Reverse-Match
    public static boolean reverseMatch(Node a, Node b) {

        Node first = a;
        int n = count(a);
        if (n!=count(b)) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            Node last = nodeAt(b, n-1-i);
            if (first.elem!=last.elem) {
                return false;
            }
            first=first.next;
        }
        return true;

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

        // Exercise 1
        Node head = new Node(4);
        head.next = new Node(7);
        head.next.next = new Node(7);
        head.next.next.next = new Node(4);

        System.out.println("Exercise 1: Palindrome");
        printList(head);
        System.out.println(palindrome(head));


        // Exercise 2
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(3);

        Node b = new Node(3);
        b.next = new Node(2);
        b.next.next = new Node(1);

        System.out.println("\nExercise 2: Reverse-Match");
        printList(a);
        printList(b);
        System.out.println(reverseMatch(a, b));

    }
}
