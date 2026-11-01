
package CSE220.LinkedList_GPT;

// Step 18: Insert After a Target Value
public class Step_18 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    public static Node find(Node head, int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.elem == key) {
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }

    public static Node insertAfter(Node head, int key, int value) {

        Node newNode = new Node(value);
        Node target = find(head, key);
        if (target!=null) {
          newNode.next=target.next;
        target.next=newNode;   
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
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = insertAfter(head, 20, 25);
        printList(head);

        head = insertAfter(head, 99, 50);
        printList(head);
    }
}
