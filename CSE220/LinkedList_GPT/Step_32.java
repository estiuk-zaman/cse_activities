
package CSE220.LinkedList_GPT;

// Step 32: Sorted List - First N Smallest (Sum / Product)

public class Step_32 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static long firstSmall(Node head, int k, boolean product) {

        if (k<0){
            throw new IllegalArgumentException();
        }
        Node temp =head;
        long result =0;
        if (product) {
            result=1;
        }
        for (int i = 0; i < k; i++) {
            if (temp==null) {
                throw new IllegalArgumentException();
            }
            if (product) {
                result*=temp.elem;
            }
            else{
                result+=temp.elem;
            }
            temp=temp.next;
        }
        return result;
    }

    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.elem + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(9);

        printList(head);

        System.out.println(firstSmall(head, 3, false));
        System.out.println(firstSmall(head, 3, true));

        System.out.println(firstSmall(head, 0, false));
        System.out.println(firstSmall(head, 0, true));
    }
}
