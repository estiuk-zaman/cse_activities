package CSE220.LinkedList_GPT;
// Step 3: temp reference ব্যবহার করে Linked List traverse করা
public class Step_03 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(7);
        head.next = new Node(14);
        head.next.next = new Node(21);
        head.next.next.next = new Node(28);

        Node temp = head;

        while(temp!=null){
            System.out.println(temp.elem);
            temp=temp.next;
        }

    }
}
