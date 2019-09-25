package strings;
import java.util.ArrayList;
import java.util.List;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures ?
 * 
 * */
public class UniqueCharactersInString {
    
    public static void main(String[] args) {
        
        String inputStr = "sS";
        
        System.out.println(isUniqueCharacters(inputStr));
        System.out.println(isUniqueCharactersEfficient("sS"));
        System.out.println(usingAdditionalDataStructure("ss"));
    }
    
    // time complexity is O(N*N)
    // space complexity is O(1)
    private static boolean isUniqueCharacters(String inputStr) {
        
        for (int i = 0; i < inputStr.length(); i++) {
            for (int j = i + 1; j < inputStr.length(); j++) {
                if (inputStr.charAt(i) == inputStr.charAt(j)) {
                    return false;
                }
            }
        }
        
        
        return true;
    }
    
    // time complexity is O(N)
    // It doesn't handle upper and lower case 
    private static boolean isUniqueCharactersEfficient(String inputStr) {
        if (inputStr.length() > 128) 
            return false;
        
        boolean[] charSet = new boolean[128];
        
        for (int i = 0; i < inputStr.length(); i++) {
            int val = inputStr.charAt(i);
            
            if (charSet[val]) { // already found this char in string
                return false;
            }
            
            charSet[val] = true;
        }
        
        return true;
    }
    
    // time complexity O(n)
    // space complexity O(n)
    private static boolean usingAdditionalDataStructure(String inputStr) {
//        char[] foundCharacters = new char[inputStr.length()]; // space complexity : O(1)
        List<Character> collectedCharacters = new ArrayList<>();
//        Hashtable<Character, Integer> computeTable = new Hashtable<>(); 
        
        for (int i = 0; i < inputStr.length(); i++) {
//            if (computeTable.containsKey(inputStr.charAt(i))) {
//                return false;
//            }
            
            if (collectedCharacters.contains(inputStr.charAt(i))) {
                return false;
            }
            
//            computeTable.put(inputStr.charAt(i), 1); // at worst (space complexity : O(n)
            collectedCharacters.add(inputStr.charAt(i));
        }
        
        return true;
    }
    
    
    
    
    

}
