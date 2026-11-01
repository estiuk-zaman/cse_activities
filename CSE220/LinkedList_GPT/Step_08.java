
package CSE220.LinkedList_GPT;

// Step 8: Find First Occurrence
public class Step_08 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static int indexOf(Node head, int target) {

       Node temp = head;
       int index = 0;
       while(temp!=null){
        if(temp.elem==target){
            return index;
        }
        index++;
        temp=temp.next;
       } 
       return -1;


    }

    public static void main(String[] args) {

        Node head = new Node(3);
        head.next = new Node(6);
        head.next.next = new Node(9);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(12);

        System.out.println(indexOf(head, 6));
        System.out.println(indexOf(head, 12));
        System.out.println(indexOf(head, 50));
    }
}
