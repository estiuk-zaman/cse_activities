
package CSE220.LinkedList_GPT;

// Step 41: Singly vs Doubly vs Circular vs Dummy-Headed List
public class Step_41 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    static class DNode {
        int elem;
        DNode next, prev;

        DNode(int elem) {
            this.elem = elem;
        }
    }

    // TODO 1: Check whether a linear SLL is empty
    public static boolean linearEmpty(Node head) {

        if (head==null) {
            return true;
        }
        return false;
    }

    // TODO 2: Check whether a DHDCL is empty
    public static boolean ringEmpty(DNode dh) {

        if (dh.next==dh) {
            return true;
        }
        return false;
    }

    // TODO 3: Check whether DHDCL has exactly one data node
    public static boolean oneDataNode(DNode dh) {

        if (dh.next!=dh && dh.next==dh.prev) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // Case 1: Empty linear list
        Node head = null;

        // Case 2: Empty DHDCL
        DNode dh1 = new DNode(-1);
        dh1.next = dh1;
        dh1.prev = dh1;

        // Case 3: DHDCL with one data node
        DNode dh2 = new DNode(-1);
        DNode n1 = new DNode(10);

        dh2.next = n1;
        dh2.prev = n1;

        n1.next = dh2;
        n1.prev = dh2;

        System.out.println(linearEmpty(head));  // true
        System.out.println(ringEmpty(dh1));     // true
        System.out.println(oneDataNode(dh2));   // true
    }
}
