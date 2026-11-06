
package CSE220.LinkedList_GPT;

// Step 53: Delete First Node in DHDCL
public class Step_53 {

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

    // Create an empty DHDCL
    public static DNode createDHDCL() {
        DNode dh = new DNode(-1);
        dh.next = dh;
        dh.prev = dh;
        return dh;
    }

    // Step 49: Connect two neighbours through x
    public static void linkBetween(DNode a, DNode x, DNode b) {
        x.prev = a;
        x.next = b;
        a.next = x;
        b.prev = x;
    }

    // Step 49: Remove a known data node
    public static void unlink(DNode x) {
        x.prev.next = x.next;
        x.next.prev = x.prev;
    }

    // Step 53: Delete First Node
    public static DNode rDeleteFirst(DNode dh) {

        if (dh.next!= dh) {
            unlink(dh.next);
        }

        return dh;
    }

    public static void printList(DNode dh) {

        DNode temp = dh.next;

        System.out.print("DH <-> ");

        while (temp != dh) {
            System.out.print(temp.elem + " <-> ");
            temp = temp.next;
        }

        System.out.println("DH");
    }

    public static void main(String[] args) {

        DNode dh = createDHDCL();

        // Create: DH <-> 10 <-> 20 <-> 30 <-> DH
        linkBetween(dh, new DNode(10), dh);
        linkBetween(dh.prev, new DNode(20), dh);
        linkBetween(dh.prev, new DNode(30), dh);

        printList(dh);

        dh = rDeleteFirst(dh);
        printList(dh);

        dh = rDeleteFirst(dh);
        printList(dh);

        dh = rDeleteFirst(dh);
        printList(dh);

        // Try deleting from an empty DHDCL
        dh = rDeleteFirst(dh);
        printList(dh);
    }
}
