package dynamicprogramming;

import java.util.Arrays;

public class TripleStep {
    
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(countWays(40));
        long end = System.currentTimeMillis();
        
        System.out.print("Time taken : " + (end - start));
        
        // using DP memoization
        start = System.currentTimeMillis();
        
        int num = 50;
        int[] memo = new int[num + 1];
        Arrays.fill(memo, -1);
        System.out.println(countWays(num, memo));
        end = System.currentTimeMillis();
        System.out.print("Time taken : " + (end - start));
    }
    
    private static int countWays(int num) {
        if (num < 0) {
            return 0;
        } else if (num == 0) {
            return 1;
        } else {
            return countWays(num - 1) + countWays(num - 2) + countWays(num - 3);
        }
    }
    
    private static int countWays(int num, int[] memo) {
        if (num < 0)
            return 0;
        else if (num == 0) 
            return 1;
        else if (memo[num] > -1) {
            return memo[num];
        } else {
            memo[num] = countWays(num - 1, memo) + countWays(num - 2, memo) + countWays(num - 3, memo);
        }
        
        return memo[num];
    }
    
    

}
