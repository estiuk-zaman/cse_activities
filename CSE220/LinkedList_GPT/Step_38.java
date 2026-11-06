
package CSE220.LinkedList_GPT;

// Step 38: Rearrange Nodes Around a Value
public class Step_38 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static Node partition(Node head, int x) {

        Node low=null;
        Node high=null;
        Node low_count=null;
        Node high_count=null;

        while (head!=null) {
            Node after=head.next;
            head.next=null;
            if (head.elem<x) {
                if (low==null) {
                    low=head;
                    low_count=low;
                }
                else{
                    low_count.next=head;
                    low_count=low_count.next;
                }
            }
            else{
                if (high==null) {
                    high=head;
                    high_count=high;
                }
                else{
                    high_count.next=head;
                    high_count=high_count.next;
                }
            }
            head=after;
            
        }
        if (low==null) {
            return high;
        }
        else{
        low_count.next=high;
        return low;
        }
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

        Node head = new Node(7);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(8);
        head.next.next.next.next.next = new Node(3);

        int x = 5;

        head = partition(head, x);

        printList(head);
    }
}
