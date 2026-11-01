package CSE220.LinkedList_GPT;

public class Step_20 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // Index diye node khuje ber kore (0-indexed)
    public static Node nodeAt(Node head, int index) {
        if (index < 0) {
            return null;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            if (temp == null) {
                return null;
            }
            temp = temp.next;
        }

        return temp;
    }

    // m theke n position porjonto reverse koro (1-indexed)
    public static Node reverseBetween(Node head, int m, int n) {

        if (n<m || nodeAt(head, n-1)==null || m<1) {
            throw new IndexOutOfBoundsException("Invalid Segment");
        }
        Node before;
        if (m==1) {
            before = null;
        }
        else{
            before=nodeAt(head, m-2);
        }
        Node start;
        if (m==1) {
            start=head;
        }
        else{
            start=before.next;
        }
        Node current = start;
        Node prev = null;
        for(int i =0;i<n-m+1;i++){
            Node after;
            after = current.next;
            current.next=prev;
            prev=current;
            current=after;
        }
        start.next=current;
        if (before==null) {
            head=prev;
        }
        else{
            before.next=prev;
        }
        return head;
    }

    // ---------- Helper (eta change korar dorkar nai) ----------

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.elem + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static Node build(int... vals) {
        Node head = null, tail = null;
        for (int v : vals) {
            Node n = new Node(v);
            if (head == null) {
                head = tail = n;
            } else {
                tail.next = n;
                tail = n;
            }
        }
        return head;
    }

    static void tryInvalid(Node head, int m, int n) {
        try {
            reverseBetween(head, m, n);
            System.out.println("(" + m + "," + n + ") -> exception ashe nai, vul!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("(" + m + "," + n + ") -> exception OK");
        }
    }

    public static void main(String[] args) {

        // 10 -> 40 -> 30 -> 20 -> 50 -> null
        printList(reverseBetween(build(10, 20, 30, 40, 50), 2, 4));

        // 30 -> 20 -> 10 -> 40 -> 50 -> null
        printList(reverseBetween(build(10, 20, 30, 40, 50), 1, 3));

        // 10 -> 20 -> 30 -> 40 -> 50 -> null  (kono change nai)
        printList(reverseBetween(build(10, 20, 30, 40, 50), 2, 2));

        // 50 -> 40 -> 30 -> 20 -> 10 -> null  (puro list)
        printList(reverseBetween(build(10, 20, 30, 40, 50), 1, 5));

        // 10 -> 20 -> 50 -> 40 -> 30 -> null  (tail porjonto)
        printList(reverseBetween(build(10, 20, 30, 40, 50), 3, 5));

        // 7 -> null
        printList(reverseBetween(build(7), 1, 1));

        System.out.println("--- invalid ---");
        // Tinta-i "exception OK" print korbe
        tryInvalid(build(10, 20, 30, 40, 50), 0, 3);
        tryInvalid(build(10, 20, 30, 40, 50), 4, 2);
        tryInvalid(build(10, 20, 30, 40, 50), 2, 6);
    }
}