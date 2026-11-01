
package CSE220.LinkedList_GPT;

// Step 7: Search a Value in Linked List
public class Step_07 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static boolean search(Node head, int target) {

        Node temp = head;
        while(temp!=null){
            if(temp.elem == target){
                return true;
            }
            temp=temp.next;
        }
        return false;


    }

    public static void main(String[] args) {

        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(15);
        head.next.next.next = new Node(20);

        System.out.println(search(head, 15));
        System.out.println(search(head, 25));
    }
}
