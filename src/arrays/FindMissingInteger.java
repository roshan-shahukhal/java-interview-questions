package arrays;

public class FindMissingInteger {
    
    public static void main(String[] args) {
        int[] intArr1 = {1, 5, 3, 4, 8};
        int[] intArr2 = {8, 4, 5, 3};
        
        // find missing integer in the first array from second one
        
        
        findMissingInteger(intArr1, intArr2);
        
    }
    
    private static void findMissingInteger(int[] arr1, int[] arr2) {
        boolean foundMissing = false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] != arr2[j]) {
                    foundMissing = true;
                } else {
                    foundMissing = false;
                    break;
                }
                
            }
            
            if (foundMissing) {
                System.out.println(arr1[i]);
                break;
            }
        }
    }
}
