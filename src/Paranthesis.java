import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Paranthesis {
    
    public static void main(String[] args) {
        String input = "{}(";
        
        System.out.println(checkIfValid(input));
    }
    
    private static boolean checkIfValid(String input) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < input.length(); i++) {
            if (map.keySet().contains(input.charAt(i))) {
                stack.push(input.charAt(i));
            } else {
                if (!stack.isEmpty() && map.get(stack.peek()) == input.charAt(i)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
        
    }

}
