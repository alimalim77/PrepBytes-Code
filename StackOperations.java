import java.util.ArrayList;
import java.util.Scanner;

public class MyStack {
    private ArrayList<Integer> elements;

    public MyStack() {
        this.elements = new ArrayList<Integer>();
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    public void push(int data) {
        this.elements.add(data);
    }

    public int pop() {
        if (this.isEmpty()) {
            return -1;
        } else {
            return this.elements.remove(this.elements.size() - 1);
        }
    }

    public int top() {
        if (this.isEmpty()) {
            return -1;
        } else {
            return this.elements.get(this.elements.size() - 1);
        }
    }

    public int size() {
        return this.elements.size();
    }
    
    public ArrayList<Integer> printStack() {
        return this.elements;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(20);
        System.out.println("Modified stack is " + stack.printStack());
        stack.push(25);
        System.out.println("Modified stack is " + stack.printStack());
        System.out.println("Stack Size is " + stack.size());
        stack.pop();
        System.out.println("Modified stack is " + stack.printStack());
        System.out.println("Stack Top is " + stack.top());
    }
}
