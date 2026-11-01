package CSE220.LinkedList_GPT;
// Step 4: Linked List-এর মোট Node সংখ্যা (Length) গণনা করা
public class Step_04 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(3);
        head.next = new Node(6);
        head.next.next = new Node(9);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(15);

        Node temp = head;
        int count =0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("The number of nodes in the linked list is: " + count);

    }
}