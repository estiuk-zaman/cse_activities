package CSE220.LinkedList_GPT;
// Step 1: Linked List-এর Node structure এবং basic ধারণা
public class Step_01 {
    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next =new Node(30);

        System.out.println(head.elem);
        System.out.println(head.next.elem);
        System.out.println(head.next.next.elem);
    }
}
