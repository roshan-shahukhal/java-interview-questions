package strings;

import java.util.HashMap;import java.util.Map;

public class Atoi {
    
    public static void main(String[] args) {
        String input = "   asdfasdf 123 asjdkfj -3439843 +349384983984";
        System.out.println(atoi1(input));
        System.out.println(atoi2("42"));
    }
    
    private static String atoi1(String input) {
        StringBuilder result = new StringBuilder();
        String[] inputs = input.split(" ");
        
        for (int i = 0; i < inputs.length; i++) {
            if (!inputs[i].matches("^[a-zA-Z]+$")) {
                
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(inputs[i]);
            }
        }
        
        return result.toString();
    }
    
    private static int atoi2(String input) {
        input = input.trim();
        
        if (input.isEmpty()) {
            return 0;
        }
        
        String[] inputs = input.split(" ");
        float result = 0;
        int sign = 1;
        for (int i = 0; i < inputs.length; i++) {
            if (!inputs[i].matches("^[a-zA-Z]+$")) {
                if ((inputs[i].matches("^[+-]+$") && inputs[i].length() > 1)) {
                    return 0;
                }
                char[] charactersInWords = inputs[i].toCharArray();
                int signCount = 0;
                for (int j = 0; j < charactersInWords.length; j++) {
                    if (charactersInWords[j] == '+' || charactersInWords[j] == '-') {
                        signCount++;
                    }
                }
                
                if (signCount == 1 || signCount == 0) {
                    if (inputs[i].charAt(i) == '-')
                        sign = -1;
                    result = Float.parseFloat(inputs[i].substring(signCount, inputs[i].length()));
                } else {
                    return 0;
                }
            }
            
            
            
//            if (!inputs[i].matches("^[a-zA-Z]+$")) {
//                if ((inputs[i].matches("^[+-]+$") && inputs[i].length() > 1)) {
//                    for (int j = 1; j < inputs[i].length(); j++) {
//                        if ((String.valueOf(inputs[i].charAt(j))).matches("^[+-]+$")) {
//                            return 0;
//                        } else {
//                            sign = inputs[i].charAt(i);
//                        }
//                    }
//                    return 0;
//                }
//                result = Double.parseDouble(inputs[i]);
        }
        return sign * (int) result;
    }
    
    
    private static String atoi(String input) {
        StringBuilder result = new StringBuilder();
        input = input.trim();
        if (input.startsWith("([a-zA-Z])\\w+")) {
            return "0";
        } else if (!input.contains(" ")) {
            return input;
        }
        
        HashMap<Integer, String> memo = new HashMap<>();
        
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                memo.put(i, input.substring(i, input.indexOf(' ', i)));
            }
        }
        
        for (Map.Entry<Integer, String> entry : memo.entrySet()) {
            if (!entry.getValue().startsWith("([a-zA-Z])\\w+")) {
                result.append(entry.getValue() + " ");
            }
        }
        
        return result.toString();
    }

}


class Solution {
    public int myAtoi(String input) {
        input = input.trim();

        if (input.isEmpty()) {
            return 0;
        }

        String[] inputs = input.split(" ");
        int result = 0;
        int sign = 1;
        for (int i = 0; i < inputs.length; i++) {
            if (!inputs[i].matches("^[a-zA-Z]+$")) {
                char[] charactersInWords = inputs[i].toCharArray();
                int signCount = 0;
                for (int j = 0; j < charactersInWords.length; j++) {
                    if (charactersInWords[j] == '+' || charactersInWords[j] == '-') {
                        signCount++;
                    }
                }

                if (signCount == 1 || signCount == 0) {
                    if (inputs[i].charAt(i) == '-')
                        sign = -1;
                    result = Integer.parseInt(inputs[i].substring(signCount, inputs[i].length()));
                } else {
                    return 0;
                }
            }

        }
        return sign * result;
    }
}
