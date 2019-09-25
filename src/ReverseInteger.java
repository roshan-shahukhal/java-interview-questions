
public class ReverseInteger {
    
    public static void main(String[] args) {
        int numberToReverse = 1534236469;
        System.out.println(reverseInteger(numberToReverse));
    }
    
    private static int reverseInteger(int numberToReverse) {
        long reversedNumber = 0;
        
        while (numberToReverse != 0) {
            reversedNumber = reversedNumber * 10 + numberToReverse % 10;
            
            numberToReverse = numberToReverse / 10;
            
            if (reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE) {
                return 0;
            }
        }
        
        
        
        return (int) reversedNumber;
    }
}
