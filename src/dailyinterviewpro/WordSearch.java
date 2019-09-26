package dailyinterviewpro;

import java.util.HashSet;
import java.util.Set;

/**
 * 
You are given a 2D array of characters, and a target string. Return whether or not the word target word exists in the matrix. 
Unlike a standard word search, the word must be either going left-to-right, or top-to-bottom in the matrix.

Example:

[['F', 'A', 'C', 'I'],
 ['O', 'B', 'Q', 'P'],
 ['A', 'N', 'O', 'B'],
 ['M', 'A', 'S', 'S']]


Given this matrix, and the target word FOAM, you should return true, as it can be found going up-to-down in the first column.

Here's the function signature:

def word_search(matrix, word):
  # Fill this in.
  
matrix = [
  ['F', 'A', 'C', 'I'],
  ['O', 'B', 'Q', 'P'],
  ['A', 'N', 'O', 'B'],
  ['M', 'A', 'S', 'S']]
print word_search(matrix, 'FOAM')
# True

 */
public class WordSearch {

    public static void main(String[] args) {
        char[][] matrix = {
                            {'F', 'A', 'C', 'I'},
                            {'O', 'B', 'Q', 'P'},
                            {'A', 'N', 'O', 'B'},
                            {'M', 'A', 'S', 'S'}
                          };
        String findThis = "FOAM";
        System.out.println(wordSearch(matrix, findThis));
    }
    
    static boolean wordSearch(char[][] matrix, String findThis) {
        
        Set<String> allPossibleWords = new HashSet<>();
        
        for (int i = 0; i < matrix.length; i++) {
            StringBuilder horizontalWordBuilder = new StringBuilder();
            StringBuilder verticalWordBuilder = new StringBuilder();
            for (int j = 0; j < matrix[i].length; j++) {
                horizontalWordBuilder.append(matrix[i][j]);
                verticalWordBuilder.append(matrix[j][i]);
            }
            
            allPossibleWords.add(horizontalWordBuilder.toString());
            allPossibleWords.add(verticalWordBuilder.toString());
        }
        
        allPossibleWords.stream().forEach(word -> System.out.println(word));
        
        return allPossibleWords.contains(findThis);
    }

}
