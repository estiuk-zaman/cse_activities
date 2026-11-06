
package CSE220.LinkedList_GPT;

import CSE220.LinkedList_GPT.Step_24.Node;

// Step 43: Forward Traversal in Doubly Linked List
public class Step_43 {

    static class DNode {
        int elem;
        DNode next, prev;

        DNode(int elem) {
            this.elem = elem;
            this.next = null;
            this.prev = null;
        }
    }

    public static void forward(DNode head) {

        DNode temp = head;
        while (temp!= null) {
            System.out.println(temp.elem);
            temp=temp.next;
        }

    }

    public static void main(String[] args) {

        DNode head = new DNode(5);
        DNode second = new DNode(15);
        DNode third = new DNode(25);
        DNode fourth = new DNode(35);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        forward(head);
    }
}
