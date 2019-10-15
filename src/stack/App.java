package stack;

public class App {
    public static void main(String[] args) {
//        Stack stack = new Stack(5);
//        
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
        
//        stack.printAll();
        
        String word = "Hello";
        Stack stack = new Stack(word.length());
        
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        
        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        
    }
}
