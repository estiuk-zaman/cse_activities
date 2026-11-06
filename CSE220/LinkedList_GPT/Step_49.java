
package CSE220.LinkedList_GPT;

public class Step_49 {

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

    public static DNode emptyRing() {
        return new DNode(-1);
    }

    // Count nodes
    public static int rCount(DNode dh) {

        int count = 0;
        DNode temp = dh.next;

        while (temp != dh) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // Find node at index
    public static DNode rNodeAt(DNode dh, int i) {

        if (i < 0) return null;

        DNode temp = dh.next;

        while (temp != dh && i > 0) {
            temp = temp.next;
            i--;
        }

        if (temp == dh) return null;

        return temp;
    }

    // Insert x between a and b
    public static void linkBetween(DNode a, DNode x, DNode b) {

        x.prev = a;
        x.next = b;
        a.next = x;
        b.prev = x;
    }

    // Remove node x
    public static void unlink(DNode x) {

        x.prev.next = x.next;
        x.next.prev = x.prev;
    }

    // Insert at end
    public static void rAppend(DNode dh, int value) {

        DNode x = new DNode(value);

        linkBetween(dh.prev, x, dh);
    }

    // Print list
    public static void printRing(DNode dh) {

        DNode temp = dh.next;

        while (temp != dh) {
            System.out.print(temp.elem + " <-> ");
            temp = temp.next;
        }

        System.out.println("DH");
    }

    public static void main(String[] args) {

        DNode dh = emptyRing();

        rAppend(dh, 10);
        rAppend(dh, 20);
        rAppend(dh, 30);

        printRing(dh);

        System.out.println("Count: " + rCount(dh));

        System.out.println("Index 1: " + rNodeAt(dh, 1).elem);

        // Insert 25
        DNode x = new DNode(25);

        linkBetween(rNodeAt(dh, 1), x, rNodeAt(dh, 2));

        printRing(dh);

        // Delete 20
        unlink(rNodeAt(dh, 1));

        printRing(dh);

        System.out.println("Final Count: " + rCount(dh));
    }
}
