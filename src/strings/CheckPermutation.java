package strings;

import java.util.Arrays;

/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 * @author i20082
 *
 */
public class CheckPermutation {

    public static void main(String[] args) {
        
        String firstStr = "abbccd";
        String secondStr = "babdcc";
        
        System.out.println(checkIfPermutationsOfEachOther(firstStr, secondStr));
        System.out.println(usingASCIIValues(firstStr, secondStr));
    }
    
    // time complexity :: O(n logn)
    private static String sort(String str) {
        char[] characters = str.toCharArray();
        Arrays.sort(characters); // O(n logn)
        System.out.println(Arrays.toString(characters));
        return new String(characters);
    }
    
    private static boolean checkIfPermutationsOfEachOther(String str1, String str2) {
        System.out.println(str1 + " " + str2);
        if (str1.length() != str2.length()) {
            return false;
        }
        
        return sort(str1).equals(sort(str2)); // O(n)
    }
    
    
    // time complexity :: O(n)
    private static boolean usingASCIIValues(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        // creates int array with 128 space with default value 0 in every space
        int[] letters = new int[128]; // Assumption :: ASCII
        for (int i = 0; i < str1.length(); i++) {
            letters[str1.charAt(i)]++; // increments 0 to 1 and so on at index from str1.charAt(i)
        }
        
        for (int i = 0; i < str2.length(); i++) {
            letters[str2.charAt(i)]--;
            
            if (letters[str2.charAt(i)] < 0) {
                return false;
            }
        }
        
        return true;
        
        
    }
    
    
    
    
    
}
