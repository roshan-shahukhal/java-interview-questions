package strings;

import java.util.Stack;

public class ReverseString {
    
    public static void main(String[] args) {
        String str = "Roshan Shahukhal";
        
        reverseString(str);
        System.out.println("");
        System.out.println(reverseString1(str));
        System.out.println(reverseString2(str));
        reverseWords(str);
        reverseWordsAnotherWay(str);
    }
    
    private static void reverseString(String str) {
        
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
    
    private static String reverseString1(String str) {
        String reversedString = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        
        return reversedString;
    }
    
    private static String reverseString2(String str) {
        StringBuilder reversedString = new StringBuilder();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }
        
        return reversedString.toString();
    }
    
    
    // O(n)
    private static void reverseWords(String str) {
        Stack<Character> characters = new Stack<>();
        
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != ' ') {
                characters.push(str.charAt(i));
            } else {
                while (!characters.isEmpty()) {
                    System.out.print(characters.pop());
                }
                System.out.print(" ");
            }
        }
        
        while (!characters.isEmpty()) {
            System.out.print(characters.pop());
        }
    }
    
    // O(n*n)
    private static void reverseWordsAnotherWay(String str) {
        System.out.println(" ");
        String[] words = str.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                System.out.print(words[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
    
    

}
