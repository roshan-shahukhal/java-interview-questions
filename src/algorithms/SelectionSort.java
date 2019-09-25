package algorithms;

import java.util.Arrays;
import java.util.LinkedList;

public class SelectionSort {
    
    public static void main(String[] args) {
        int[] unsortedNumbers = {5, 4, 2, 1, 8, 6, 0, -1, 78, 73};
        
        sortNumbers(unsortedNumbers);
    }
    
    private static void sortNumbers(int[] unsortedNumbers) {
        
        for (int i = 0; i < unsortedNumbers.length; i++) {
            for (int j = 0; j < unsortedNumbers.length - 1; j++) {
                
                if (unsortedNumbers[j] > unsortedNumbers[i]) {
                    int temp = unsortedNumbers[j];
                    unsortedNumbers[j] = unsortedNumbers[i];
                    unsortedNumbers[i] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(unsortedNumbers));
        
    }

}
