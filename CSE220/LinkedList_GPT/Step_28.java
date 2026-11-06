
package CSE220.LinkedList_GPT;

// Step 28: Remove Duplicates
public class Step_28 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static Node removeDuplicates(Node head) {

        Node current = head;
        while (current!=null) {
            Node target = current.next;
            Node prev = current;
            while (target!=null) {
                if (current.elem==target.elem) {
                    prev.next=prev.next.next;
                }
                else{
                    prev=prev.next;
                }
                target=target.next;
            }
            current=current.next;
        }
        return head;
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
        head.next = new Node(3);
        head.next.next = new Node(7);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(3);

        head = removeDuplicates(head);

        printList(head);
    }
}
