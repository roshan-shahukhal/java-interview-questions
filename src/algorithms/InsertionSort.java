package algorithms;

import java.util.Arrays;

public class InsertionSort {
    
    public static void main(String[] args) {
        int[] unsortedNumbers = {5, 4, 2, 1, 8, 6, 0, -1, 78, 73};
        
        sortNumbers(unsortedNumbers);
    }
    
    private static void sortNumbers(int[] unsortedNumbers) {
        
        for (int i = 1; i < unsortedNumbers.length; i++) {
            int key = unsortedNumbers[i];
            for (int j = i - 1; j >= 0; j--) {
                if (key < unsortedNumbers[j]) {
                    int temp = key;
                    unsortedNumbers[j+1] = unsortedNumbers[j];
                    unsortedNumbers[j] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(unsortedNumbers));
    }
    
    

}
