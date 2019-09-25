import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice {
    
    public static void main(String[] args) {
//        int[] unsortedArray = {14, 13, 1, 2, 7, 5, 89, 43, 22, 0};
//        int findThis = 0;
//        
//        if(findNumber(unsortedArray, findThis)) {
//            System.out.printf("Yay, %d is found in the given array !", findThis);
//        } else {
//            System.out.printf("Oops, %d is not found in the given array !", findThis);
//        }
//        
//        int foundAt = findNumberUsingBinarySearch(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8}, 2);
//        
//        System.out.println("Found at " + foundAt);
        
//        System.out.println(Arrays.toString(reverseArray(new int[] {1,2,3,4})));
        
//        System.out.println(sockMerchant(5, new int[] {1, 2, 1, 2, 3}));
        
    }
    
    
    
    private static boolean findNumber(int[] unsortedArray, int findThis) {
        boolean found = false;
        for (int i = 0; i < unsortedArray.length; i++) {
            if (findThis == unsortedArray[i]) {
                found = true;
                break;
            }
        }
        
        return found;
    }
    
    
    private static int findNumberUsingBinarySearch(int[] sortedArray, int findThis) {
        int sizeOfArray = sortedArray.length;
        
        int leftIndex = 0;
        int rightIndex = sizeOfArray - 1;
        
        
        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex)/2;
            
            if (findThis == sortedArray[middleIndex]) {
                return middleIndex;
            }
            
            if (findThis > sortedArray[middleIndex]) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }
        return -1;
        
    }
    
    private static int[] reverseArray(int[] a) {
        int[] result = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            for (;j < result.length; j++) {
                result[j] = a[i];
                break;
            }
            j++;
        }

        return result;
    }
    
    static int sockMerchant(int n, int[] ar) {
        Set<Integer> list = new HashSet<>();
        int counter = 0;

        String s = "";
        
        for (int i = 0; i < ar.length; i++) {
            int color = ar[i];
            if (!list.contains(color)) {
                list.add(ar[i]);
            } else {
                list.remove(color);
                counter++;
            }
        }

        return counter;

    }
    
    

}
