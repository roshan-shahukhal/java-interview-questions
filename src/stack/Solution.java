package stack;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int noOfOperations = scanner.nextInt();
        StackClass stack = new StackClass(noOfOperations);
        
        while(noOfOperations > 0) {
            
            int operation = scanner.nextInt();
            
            switch(operation) {
                case 1: 
                    int data = scanner.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peak();
                    break;
            }
            
            noOfOperations--;
        }
        
        scanner.close();
        
    }
}

class StackClass {
    int[] stack;
    int size;
    int top;

    StackClass(int size) {
        stack = new int[size];
        top = -1;
        this.size = size;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int data) {
        stack[++top] = data;
    }

    void pop() {
        top--;
    }

    void peak() {
        System.out.println(stack[top]);
    }
}