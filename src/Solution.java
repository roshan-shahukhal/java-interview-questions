import java.util.HashSet;
import java.util.Set;

// Suppose we have some input data describing a graph of relationships between parents and children over multiple generations. The data is formatted as a list of (parent, child) pairs, where each individual is assigned a unique integer identifier.

// For example, in this diagram, 3 is a child of 1 and 2, and 5 is a child of 4:

// 1   2    4
//  \ /   / | \
//   3   5  8  9
//    \ / \     \
//     6   7    11

// Write a function that takes this data as input and returns two collections: one containing all individuals with zero known parents, and one containing all individuals with exactly one known parent.

// Sample input/output (pseudodata):

// parentChildPairs = [
//     (1, 3), (2, 3), (3, 6), (5, 6),
//     (5, 7), (4, 5), (4, 8), (4, 9), (9, 11)
// ]

// Output may be in any order:

// findNodesWithZeroAndOneParents(parentChildPairs) => [
//   [1, 2, 4],       // Individuals with zero parents
//   [5, 7, 8, 9, 11] // Individuals with exactly one parent
// ]

// n: number of pairs in the input


public class Solution {
  public static void main(String[] argv) {

    int[][] parentChildPairs = new int[][] {
        {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7},
        {4, 5}, {4, 8}, {4, 9}, {9, 11}
    };
    
    findNodesWithZeroAndOneParents(parentChildPairs);

  }
  
  private static void findNodesWithZeroAndOneParents(int[][] parentChildPairs) {
    
    Set<Integer> individualsWithZeroParent = new HashSet<>();
    Set<Integer> individualsWithOneParent = new HashSet<>();
    
    for (int i = 0; i < parentChildPairs.length; i++) {
//       System.out.println(parentChildPairs[i][0]);
      int count = 0;
      for (int j = 0; j < parentChildPairs.length; j++) {
//         System.out.println(parentChildPairs[i][1]);
        if (parentChildPairs[i][0] == parentChildPairs[j][1]) {
//           System.out.println("Parent : " + parentChildPairs[i][0] + " :: Child :: " + parentChildPairs[j][1]);
          count++;
          
        }
        
      }
      
      
      
      if (count == 0) {
        individualsWithZeroParent.add(parentChildPairs[i][0]);
      } else if (count == 1) {
        individualsWithOneParent.add(parentChildPairs[i][0]);
      }
      
//       System.out.println(count + " :: " + ;
    }
    
    
    for (int j = 0; j < parentChildPairs.length; j++) {
//       System.out.println(parentChildPairs[j][1]);
      int anotherCount = 0;
      for (int i = 0; i < parentChildPairs.length; i++) {
//         System.out.println(parentChildPairs[i][1]);
        if (parentChildPairs[i][1] == parentChildPairs[j][1]) {
          System.out.println("bingo!" + parentChildPairs[j][1]);
//           System.out.println("Parent : " + parentChildPairs[i][0] + " :: Child :: " + parentChildPairs[j][1]);
          anotherCount++;
          
        }
        
      }
      
      
      
      if (anotherCount == 1) {
        individualsWithOneParent.add(parentChildPairs[j][1]);
      }
      
//       System.out.println(count + " :: " + ;
    }
    
    System.out.println(individualsWithZeroParent.toString());
    System.out.println(individualsWithOneParent.toString());
  }
}