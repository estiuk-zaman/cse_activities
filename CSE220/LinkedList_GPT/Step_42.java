
package CSE220.LinkedList_GPT;

// Step 42: Doubly Node
public class Step_42 {

    static class DNode {
        int elem;
        DNode next, prev;

        DNode(int elem) {
            this.elem = elem;
            this.next = null;
            this.prev = null;
        }
    }

    public static DNode makeDoublyPair() {

        DNode head = new DNode(10);
        DNode second = new DNode(20);

        head.next=second;
        second.prev=head;
        return head;

    }

    public static void main(String[] args) {

        DNode head = makeDoublyPair();

        // Forward check
        System.out.println(head.elem);
        System.out.println(head.next.elem);

        // Backward check
        System.out.println(head.next.prev.elem);

        // Boundary checks
        System.out.println(head.prev);
        System.out.println(head.next.next);
    }
}
