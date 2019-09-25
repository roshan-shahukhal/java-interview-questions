package strings;

public class SimpleCalculator {
    
    public static void main(String[] args) {
        String expression1 = "6+9-12"; // = 3
        String expression2 = "1+2-3+4-5+6-7"; // = -2
        String expression3 = "100+200+300"; // = 600
        String expression4 = "1-2-3-0"; // = -4
        String expression5 = "255"; // = 255
        
        System.out.println(doTheMath(expression1));
        System.out.println(doTheMath(expression2));
        System.out.println(doTheMath(expression3));
        System.out.println(doTheMath(expression4));
        System.out.println(doTheMath(expression5));
    }
    
    // correct solution
    private static int doTheMath(String expression) {
        String previousOperand = "";
        int total = 0;
        int sign = 1; // 1 for + and -1 for -
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+') {
                total += (sign * Integer.parseInt(previousOperand));
                previousOperand = "";
                sign = 1;
            } else if (expression.charAt(i) == '-') {
                total += (sign * Integer.parseInt(previousOperand));
                previousOperand = "";
                sign = -1;
            } else {
                previousOperand += expression.charAt(i);
            }
        }
        
        if (!previousOperand.isEmpty()) {
            total = total + (sign * Integer.parseInt(previousOperand));
        }
        
        return total;
    }
    
}
