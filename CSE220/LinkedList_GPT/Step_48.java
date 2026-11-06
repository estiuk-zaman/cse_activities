
package CSE220.LinkedList_GPT;

// Step 48: DHDCL Structure + Pointer Tracing
public class Step_48 {

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

    // Exercise 1
    public static DNode emptyRing() {

        DNode dh = new DNode(0);
        dh.next=dh;
        dh.prev=dh;
        return dh;


    }

    // Exercise 2
    public static DNode ringOfOne(int value) {

        DNode dh = new DNode(0);
        DNode n1Node = new DNode(value);
        dh.next=n1Node;
        n1Node.prev=dh;
        n1Node.next=dh;
        dh.prev=n1Node;
    
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

        // Test 1: Empty DHDCL
        DNode dh1 = emptyRing();

        System.out.println(dh1.next == dh1);
        System.out.println(dh1.prev == dh1);

        printList(dh1);

        // Test 2: One-node DHDCL
        DNode dh2 = ringOfOne(10);

        System.out.println(dh2.next.elem);
        System.out.println(dh2.prev.elem);

        System.out.println(dh2.next.next == dh2);
        System.out.println(dh2.prev.prev == dh2);

        printList(dh2);
    }
}
