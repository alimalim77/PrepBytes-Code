import java.util.ArrayList;
import java.util.Scanner;

class MyStack {
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
            return Integer.MIN_VALUE;
        }
        return this.elements.remove(this.elements.size() - 1);
    }

    public int size() {
        return this.elements.size();
    }

    public ArrayList<Integer> printStack() {
        return this.elements;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("push");
            System.out.println("pop");
            System.out.println("close");
            ArrayList<Integer> ans = stack.printStack();
            System.out.println(ans);
            String operation = sc.nextLine();

            if (operation.equals("push")) {
                System.out.print("Enter the element to push: ");
                int ele = sc.nextInt();
                sc.nextLine();
                stack.push(ele);
            } else if (operation.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println("Stack is empty.");
                } else {
                    System.out.println("Popped value: " + stack.pop());
                }
            } else if (operation.equals("close")) {
                break;
            } else if (operation.equals("size")) {
                System.out.println("Size of stack is " + stack.size());
            }
        }
        sc.close();
    }
}
