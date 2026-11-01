package CSE220.LinkedList_GPT;

// Step 12: Insert at a Specific Index
public class Step_12 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // Count total nodes
    public static int count(Node head) {
        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

    // Insert at the beginning
    public static Node prePend(Node head, int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        return newNode;
    }

    // Find node at a specific index
    public static Node nodeAt(Node head, int index) {
        if (index < 0) {
            return null;
        }

        Node temp = head;

        for (int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }

        return temp;
    }

    // Insert at a specific index
    public static Node insertAt(Node head, int index, int value) {

        int size = count(head);

        if (index < 0 || index > size) {
            return head;
        }

        // Insert at index 0
        if (index == 0) {
            return prePend(head, value);
        }

        Node prev = nodeAt(head, index - 1);

        Node newNode = new Node(value);
        newNode.next = prev.next;
        prev.next = newNode;

        return head;
    }

    // Print the linked list
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

        head = insertAt(head, 1, 15);
        printList(head);

        head = insertAt(head, 0, 5);
        printList(head);

        // Insert at the end
        head = insertAt(head, 4, 40);
        printList(head);
    }
}