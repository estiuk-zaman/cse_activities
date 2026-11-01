
package CSE220.LinkedList_GPT;

// Step 22: Find N-th Node from End
public class Step_22 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // Previous helper: nodeAt()
    public static Node nodeAt(Node head, int index) {

        Node temp = head;

        for (int i = 0; i < index; i++) {

            if (temp == null) {
                return null;
            }

            temp = temp.next;
        }

        return temp;
    }

    public static Node fromEnd(Node head, int k) {

        Node slow = head;
        Node fast = head;

        for(int i =0;i<k;i++){
            if (fast==null) {
                return null;
            }
            fast=fast.next;
        }
        while (fast!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;


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
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node result = fromEnd(head, 2);

        if (result != null) {
            System.out.println("Answer: " + result.elem);
        } else {
            System.out.println("Invalid k");
        }

        result = fromEnd(head, 1);

        if (result != null) {
            System.out.println("Answer: " + result.elem);
        }

        result = fromEnd(head, 5);

        if (result != null) {
            System.out.println("Answer: " + result.elem);
        }
    }
}
