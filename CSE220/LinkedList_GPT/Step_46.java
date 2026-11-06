
package CSE220.LinkedList_GPT;

// Step 46: Dummy Head Concept
public class Step_46 {

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

    // Previous Step Helper: Build Linear DLL with Dummy Head
    public static DNode linearDummy(int[] values) {

        DNode dh = new DNode(0);
        DNode tail = dh;

        for (int value : values) {

            DNode node = new DNode(value);

            tail.next = node;
            node.prev = tail;

            tail = node;
        }

        return dh;
    }

    // Step 46 Exercise
    public static int countDataNodes(DNode dh) {

        int count =0;
        DNode temp =dh.next;
        while (temp!=null) {
            count++;
            temp=temp.next;
        }
        return count;

    }

    public static void printForward(DNode dh) {

        DNode temp = dh.next;

        while (temp != null) {
            System.out.print(temp.elem + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        DNode dh = linearDummy(new int[]{10, 20, 30});

        printForward(dh);

        System.out.println("Data Nodes: "
                + countDataNodes(dh));
    }
}
