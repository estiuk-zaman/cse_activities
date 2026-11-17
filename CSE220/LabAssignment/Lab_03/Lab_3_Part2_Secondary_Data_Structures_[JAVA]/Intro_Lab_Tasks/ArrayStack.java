package Intro_Lab_Tasks;

import java.security.cert.TrustAnchor;

public class ArrayStack {

    private Object[] stack;
    private int top;

    public ArrayStack(int size) {
        stack = new Object[size];
        top = -1;
    }

    public void push(Object element) {
        if (top==stack.length-1) {
            System.out.println("Stack overflow");
            return ;
        }
        top++;
        stack[top]=element;
    }

    public Object pop() {
        if (top==-1) {
            System.out.println("Stack underflow");
            return null;
        }
        Object temp = stack[top];
        stack[top]=null;
        top--;
        return temp;
    }

    public Object peek() {
        if (top==-1) {
            return null;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        if (top==-1) {
            return true;
        }
        else{
            return false;
        }
    }
    
}
