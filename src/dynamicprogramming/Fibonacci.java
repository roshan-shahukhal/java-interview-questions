package dynamicprogramming;

// find nth fibonacci number

public class Fibonacci {

    public static void main(String[] args) {
        int num = 2;
//        System.out.println(fibonacci(num));
        System.out.println(fibonacciOptimal(num));
        
        
//        int[] memo = new int[num + 1];
//        System.out.println(fibonacciWithDP(num, memo));
    }
    
    private static int fibonacci(int num) {
        if (num == 0)
            return 0;
        else if (num == 1)
            return 1;
        else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
            
    }
    
    private static int fibonacciWithDP(int num, int[] memo) {
        
        if (num == 0 || num == 1) 
            return num;
        else if(memo[num] == 0) {
            memo[num] = fibonacciWithDP(num - 1, memo) + fibonacciWithDP(num - 2, memo);
        }
        
        return memo[num];
    }
    
    
    private static int fibonacciOptimal(int num) {
        int a = 0;
        int b = 1;
            
        for (int i = 2; i < num; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        
        return num >= 1 ? a + b : a;
    }
}
