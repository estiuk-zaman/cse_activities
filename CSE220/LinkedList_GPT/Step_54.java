
package CSE220.LinkedList_GPT;

// Step 54: Delete Last Node in DHDCL
public class Step_54 {

    static class DNode {
        int elem;
        DNode next;
        DNode prev;

        DNode(int elem) {
            this.elem = elem;
            this.next = this;
            this.prev = this;
        }
    }

    // Previous step helper: Remove a node from the ring
    public static void unlink(DNode target) {

        target.prev.next = target.next;
        target.next.prev = target.prev;
    }

    // TODO: Implement this method
    public static DNode rDeleteLast(DNode dh) {

            if (dh.prev!=dh) {
                unlink(dh.prev);
            }
            return dh;
    }

    // Print all data nodes
    public static void printList(DNode dh) {

        DNode temp = dh.next;

        while (temp != dh) {
            System.out.print(temp.elem + " <-> ");
            temp = temp.next;
        }

        System.out.println("DH");
    }

    // Create a DHDCL
    public static DNode createList() {

        DNode dh = new DNode(-1);

        DNode n1 = new DNode(10);
        DNode n2 = new DNode(20);
        DNode n3 = new DNode(30);

        dh.next = n1;
        n1.prev = dh;

        n1.next = n2;
        n2.prev = n1;

        n2.next = n3;
        n3.prev = n2;

        n3.next = dh;
        dh.prev = n3;

        return dh;
    }

    public static void main(String[] args) {

        DNode dh = createList();

        System.out.println("Before deletion:");
        printList(dh);

        dh = rDeleteLast(dh);

        System.out.println("After deletion:");
        printList(dh);

        dh = rDeleteLast(dh);

        System.out.println("After another deletion:");
        printList(dh);

        dh = rDeleteLast(dh);

        System.out.println("After deleting last data node:");
        printList(dh);

        // Empty list test
        dh = rDeleteLast(dh);

        System.out.println("After deleting from empty list:");
        printList(dh);
    }
}
