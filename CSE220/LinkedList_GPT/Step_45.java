
package CSE220.LinkedList_GPT;

// Step 45: DLL count(), nodeAt(), elemAt()
public class Step_45 {

    static class DNode {
        int elem;
        DNode prev;
        DNode next;

        DNode(int elem) {
            this.elem = elem;
            this.prev = null;
            this.next = null;
        }
    }

    // Count total number of Nodes
    public static int dCount(DNode head) {

        int n = 0;

        while (head != null) {
            n++;
            head = head.next;
        }

        return n;
    }

    // Return Node at a specific index
    public static DNode dNodeAt(DNode head, int index) {

        if (index<0) {
            throw new IllegalArgumentException("");
        }
        while (head!=null && index>0) {
            head=head.next;
            index--;
        }
        return head;
    }

    // Return element at a specific index
    public static int dElemAt(DNode head, int index) {

        DNode temp = dNodeAt(head, index);
        if (temp == null) {
        throw new IndexOutOfBoundsException();
    }
        return temp.elem;

    }

    // Print the Doubly Linked List
    public static void printList(DNode head) {

        DNode temp = head;

        while (temp != null) {
            System.out.print(temp.elem + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        DNode head = new DNode(10);
        DNode second = new DNode(20);
        DNode third = new DNode(30);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        printList(head);

        System.out.println("Count: " + dCount(head));

        System.out.println("Node at 1: " +
                dNodeAt(head, 1).elem);

        System.out.println("Element at 2: " +
                dElemAt(head, 2));
    }
}
