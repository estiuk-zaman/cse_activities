
package CSE220.LinkedList_GPT;

// Step 47: Circular Linked List Concept
public class Step_47 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static int circularSum(Node head) {

        if (head==null) {
            return 0;
        }
        int sum = 0;
        Node temp =head;
        // while (temp.next!=head) {
        //     sum+=temp.elem;
        //     temp=temp.next;
        // }
        // sum+=temp.elem;
        // return sum;
        
        do{
            sum+=temp.elem;
            temp=temp.next;
        } while(temp!=head);

        return sum;

    }

    public static void printCircular(Node head, int size) {

        Node temp = head;

        for (int i = 0; i < size; i++) {
            System.out.print(temp.elem + " -> ");
            temp = temp.next;
        }

        System.out.println("(back to head)");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;
        third.next = head;

        printCircular(head, 3);

        System.out.println("Sum: " + circularSum(head));
    }
}
