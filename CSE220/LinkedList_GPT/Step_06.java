package CSE220.LinkedList_GPT;

// Step 6: Linked List Traversal
public class Step_06 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(15);

        Node temp = head;
        while(temp != null){
            System.out.println(temp.elem);
            temp = temp.next;
        }
        

    }
}
