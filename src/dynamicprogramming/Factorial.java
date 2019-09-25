package dynamicprogramming;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(findFactorial(30));
        System.out.println(findFactorialRecursively(30));
    }
    
    private static int findFactorial(int num) {
        
        if (num == 0) {
            return 1;
        }
        
        int total = 1;
        for (int i = num; i > 1; i--) {
            total *= i;
        }
        
        return total;
    }
    
    private static int findFactorialRecursively(int num) {
        if (num == 0) {
            return 1;
        }
        
        return num * findFactorialRecursively(num - 1);
    }
}
