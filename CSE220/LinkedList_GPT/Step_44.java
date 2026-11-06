
package CSE220.LinkedList_GPT;

// Step 44: Backward Traversal using prev
public class Step_44 {

    static class DNode {
        int elem;
        DNode next;
        DNode prev;

        DNode(int elem) {
            this.elem = elem;
            this.next = null;
            this.prev = null;
        }
    }

    // Step 43: Forward Traversal
    public static void forward(DNode head) {

        DNode current = head;

        while (current != null) {
            System.out.print(current.elem + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // Step 44: Backward Traversal
    public static void backward(DNode head) {

        if (head == null) {
        return;
    }

        DNode temp = head;
        while (temp.next!=null) {
            temp=temp.next;
        }

        while (temp!=null) {
            System.out.println(temp.elem);
            temp=temp.prev;
        }

    }

    public static void main(String[] args) {

        DNode head = new DNode(10);
        DNode second = new DNode(20);
        DNode third = new DNode(30);

        // Connect next links
        head.next = second;
        second.next = third;

        // Connect prev links
        second.prev = head;
        third.prev = second;

        System.out.println("Forward:");
        forward(head);

        System.out.println("Backward:");
        backward(head);
    }
}
