package stack;

public class Stack {
    
    private int size;
    private int top;
    private Object[] stack;
    
    
    public Stack(int size) {
        stack = new Object[size];
        top = -1;
        this.size = size;
    }
    
    public void push(Object data) {
        stack[++top] = data;
    }
    
    public Object pop() {
        Object data = stack[top];
        top--;
        return data;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public boolean isFull() {
        return top == size - 1;
    }
    
    public void printAll() {
        while(!isEmpty()) {
            System.out.println(pop());
        }
    }
    
    

}
