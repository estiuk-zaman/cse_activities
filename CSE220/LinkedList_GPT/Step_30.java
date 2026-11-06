
package CSE220.LinkedList_GPT;

// Step 30: Distance / Position Based Calculation
public class Step_30 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // Previous Step Helper Function
    public static Node nodeAt(Node head, int index) {

        if (index < 0) return null;

        Node current = head;

        while (current != null && index > 0) {
            current = current.next;
            index--;
        }

        return current;
    }

    public static long sumDist(Node head, int[] distances) {

        long sum = 0;
        for(int i =0;i<distances.length;i++){
            if (nodeAt(head, distances[i])!=null) {
                sum+=nodeAt(head,distances[i]).elem;
            }
        }
        return sum;

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
        head.next = new Node(16);
        head.next.next = new Node(-5);
        head.next.next.next = new Node(9);

        int[] distances = {2, 0, 2, 8};

        System.out.println(sumDist(head, distances));
    }
}
