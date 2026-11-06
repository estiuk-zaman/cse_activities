
package CSE220.LinkedList_GPT;

// Step 51: Insert at End in DHDCL
public class Step_51 {

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

    // Step 49 Helper
    public static void linkBetween(
        DNode a, DNode x, DNode b
    ) {
        x.prev = a;
        x.next = b;
        a.next = x;
        b.prev = x;
    }

    // TODO: Complete this method
    public static DNode rAppend(DNode dh, int value) {

        DNode newNode = new DNode(value);
        if (dh.next==dh && dh.prev==dh) {
            linkBetween(dh,newNode, dh);
            return dh;
        }
        linkBetween(dh.prev, newNode, dh);
        return dh;
    }

    public static void printList(DNode dh) {

        DNode temp = dh.next;

        while (temp != dh) {
            System.out.print(temp.elem + " <-> ");
            temp = temp.next;
        }

        System.out.println("DH");
    }

    public static void main(String[] args) {

        // Create Dummy Head
        DNode dh = new DNode(-1);

        // Initial List: 10 <-> 20
        linkBetween(dh, new DNode(10), dh);
        linkBetween(dh.prev, new DNode(20), dh);

        printList(dh);

        dh = rAppend(dh, 30);
        printList(dh);

        dh = rAppend(dh, 40);
        printList(dh);

        // Test empty DHDCL
        DNode empty = new DNode(-1);

        empty = rAppend(empty, 100);
        printList(empty);
    }
}
