package CSE220.LinkedList_GPT;
// Step 2: Node তৈরি করা এবং তাদের মধ্যে link তৈরি করা
public class Step_02 {
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

        Node temp = head;
        temp=temp.next;

        System.out.println(head.elem);
        System.out.println(temp.elem);
    }
}
