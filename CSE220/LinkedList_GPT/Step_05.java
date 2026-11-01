
package CSE220.LinkedList_GPT;

// Step 5: Linked List-এর নির্দিষ্ট Index-এর Node খুঁজে বের করা
public class Step_05 {

    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // TODO: Implement nodeAt() method here
    public static Node nodeAt(Node head, int index) {

        Node temp = head;
        int count =0;
        while(temp!=null){
            if(count==index){
                return temp;
            }
            count++;
            temp=temp.next;
        }
        return null;

    }

    public static void main(String[] args) {

        Node head = new Node(3);
        head.next = new Node(6);
        head.next.next = new Node(9);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(15);

        int index = 2;

        Node result = nodeAt(head, index);

        if (result != null) {
            System.out.println("Node at index " + index + ": " + result.elem);
        } else {
            System.out.println("Invalid index");
        }

    }
}
