package dailyinterviewpro;

/**
 * 
There are n people lined up, and each have a height represented as an integer. 
A murder has happened right in front of them, and only people who are taller than everyone in front of them are able to see what has happened. 
How many witnesses are there?

Example:

Input: [3, 6, 3, 4, 1]  
Output: 3

Explanation: Only [6, 4, 1] were able to see in front of them.

 #
 #
 # #
####
####
#####
36341                                 x (murder scene)
 *
 */

public class WitnessProblem {

    public static void main(String[] args) {
        int[] witnessHeights = {3, 6, 9, 5, 3, 4, 1};
        
        System.out.println("Total Witness :: " + findTotalWitness(witnessHeights));
    }
    
    static int findTotalWitness(int[] witnessHeights) {
        int totalWitness = 0;
        
        for (int i = witnessHeights.length - 1; i >= 0; i--) {
            boolean countValid = true;
            for (int j = i + 1; j <= witnessHeights.length - 1; j++) {
                if (witnessHeights[i] < witnessHeights[j]) {
                    countValid = false;
                    break;
                }
            }
            
            if (countValid) {
                totalWitness++;
            }
            
        }
        
        return totalWitness;
    }
}
