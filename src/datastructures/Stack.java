package datastructures;

public class Stack {
    
    static final int MAX = 5;
    int top;
    int[] array = new int[MAX];
    
    Stack() {
        top = -1;
    }
    
    boolean isEmpty() {
        return top == -1;
    }
    
    boolean push(int data) {
        if (top >= MAX - 1) {
            System.out.println("Stack overflow");
            return false;
        }
        
        array[++top] = data;
        return true;
    }
    
    int pop() {
        
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        
        int data = array[top--];
        return data;
    }
    
    int peek() {
        
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        
        int data = array[top];
        return data;
    }
    
    
    public static void main(String[] args) {
        Stack stack = new Stack();
        
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        
    }

}
