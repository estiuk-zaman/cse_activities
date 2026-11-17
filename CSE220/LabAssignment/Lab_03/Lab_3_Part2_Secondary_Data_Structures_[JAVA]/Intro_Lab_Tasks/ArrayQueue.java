package Intro_Lab_Tasks;

public class ArrayQueue {

    private Object[] queue;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int arrayLen) {
        this.queue = new Object[arrayLen];
        this.front = 0;
        this.rear = 0;
	this.size = 0;
    }

    public void enqueue(Object element) {
        if (size==queue.length) {
            System.out.println("queue overflow");
            return ;
        }
        queue[rear]=element;
        rear=(rear+1)%queue.length;
        size++;

    }

    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("queue underflow");
            return null;
        }
        Object temp = queue[front];
        queue[front]=null;
        front=(front+1)%queue.length;
        size--;
        return temp;
    }

    public Object peek() {
        if(isEmpty()){
            return null;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size ==0;
    }
}
