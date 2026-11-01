
package CSE220.LinkedList_GPT;

// Step 9: Insert at Beginning
public class Step_09 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static Node prepend(Node head, int value) {

        Node newNode = new Node(value);
        newNode.next=head;
        head=newNode;
        return head;


    }

    public static void main(String[] args) {

        Node head = new Node(7);
        head.next = new Node(14);
        head.next.next = new Node(21);

        head = prepend(head, 3);

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.elem + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
