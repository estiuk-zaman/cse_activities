
package CSE220.LinkedList_GPT;

// Step 55: Delete at Specific Index in DHDCL
public class Step_55 {

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

    // Previous Step 49: Locate a data node
    public static DNode rNodeAt(DNode dh, int index) {

        if (index < 0) return null;

        DNode p = dh.next;

        while (p != dh && index > 0) {
            p = p.next;
            index--;
        }

        return p == dh ? null : p;
    }

    // Previous Step 49: Unlink a known node
    public static void unlink(DNode x) {

        x.prev.next = x.next;
        x.next.prev = x.prev;
    }

    // STEP 55: YOUR TASK
    public static DNode rDeleteAt(DNode dh, int index) {

        DNode target =  (rNodeAt(dh, index));
        if (target==null) {
            throw new IndexOutOfBoundsException();
        }
        unlink(target);
        return dh;
    }

    public static void linkBetween(DNode a, DNode x, DNode b) {
        x.prev = a;
        x.next = b;
        a.next = x;
        b.prev = x;
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

        DNode dh = new DNode(-1);

        DNode n1 = new DNode(10);
        DNode n2 = new DNode(20);
        DNode n3 = new DNode(30);
        DNode n4 = new DNode(40);

        linkBetween(dh, n1, dh);
        linkBetween(n1, n2, dh);
        linkBetween(n2, n3, dh);
        linkBetween(n3, n4, dh);

        printList(dh);

        dh = rDeleteAt(dh, 1);
        printList(dh);

        dh = rDeleteAt(dh, 0);
        printList(dh);
    }
}
