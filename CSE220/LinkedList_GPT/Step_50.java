
package CSE220.LinkedList_GPT;

// Step 50: Insert at Beginning in DHDCL
public class Step_50 {

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

    // Previous Step 49 helper function
    public static void linkBetween(
            DNode a, DNode x, DNode b) {

        x.prev = a;
        x.next = b;
        a.next = x;
        b.prev = x;
    }

    // TODO: Implement Step 50
    public static DNode rPrepend(DNode dh, int value) {

        DNode newNode = new DNode(value);
        if (dh.next==dh && dh.prev==dh) {
            linkBetween(dh,newNode, dh);
            return dh;
        }
        linkBetween(dh,newNode,dh.next);
        return dh;

    }

    // Print DHDCL
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

        // Create Dummy Head
        DNode dh = new DNode(-1);
        dh.next = dh;
        dh.prev = dh;

        // Initial list: 10 <-> 20
        linkBetween(dh, new DNode(10), dh);
        linkBetween(dh.prev, new DNode(20), dh);

        printList(dh);

        // Insert at Beginning
        dh = rPrepend(dh, 5);
        printList(dh);

        dh = rPrepend(dh, 1);
        printList(dh);

        // Test empty DHDCL
        DNode emptyDh = new DNode(-1);
        emptyDh.next = emptyDh;
        emptyDh.prev = emptyDh;

        emptyDh = rPrepend(emptyDh, 100);
        printList(emptyDh);
    }
}
