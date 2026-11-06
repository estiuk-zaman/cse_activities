
package CSE220.LinkedList_GPT;

// Step 52: Insert at Specific Index in DHDCL
public class Step_52 {

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

    // Step 49: Count data nodes
    public static int rCount(DNode dh) {
        int n = 0;

        for (DNode p = dh.next; p != dh; p = p.next) {
            n++;
        }

        return n;
    }

    // Step 49: Find node at index
    public static DNode rNodeAt(DNode dh, int i) {
        if (i < 0) return null;

        DNode p = dh.next;

        while (p != dh && i > 0) {
            p = p.next;
            i--;
        }

        return p == dh ? null : p;
    }

    // Step 49: Insert between two nodes
    public static void linkBetween(DNode a, DNode x, DNode b) {
        x.prev = a;
        x.next = b;
        a.next = x;
        b.prev = x;
    }

    // Step 52: Insert at Specific Index
    public static DNode rInsertAt(DNode dh, int index, int value) {

    int n = rCount(dh);

    if (index < 0 || index > n) {
        throw new IndexOutOfBoundsException();
    }

    DNode right;

    if (index == n) {
        right = dh;
    } else {
        right = rNodeAt(dh, index);
    }

    DNode newNode = new DNode(value);

    linkBetween(right.prev, newNode, right);

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
        DNode dh = new DNode(0);

        // Initial list: 10 <-> 20 <-> 30
        linkBetween(dh, new DNode(10), dh);
        linkBetween(dh.prev, new DNode(20), dh);
        linkBetween(dh.prev, new DNode(30), dh);

        // Test 1: Middle insertion
        dh = rInsertAt(dh, 1, 15);
        printList(dh);

        // Test 2: Beginning insertion
        dh = rInsertAt(dh, 0, 5);
        printList(dh);

        // Test 3: End insertion
        dh = rInsertAt(dh, 5, 40);
        printList(dh);
    }
}
