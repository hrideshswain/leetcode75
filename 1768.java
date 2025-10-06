//1768. Merge Strings Alternately
import java.util.Scanner;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        int n = word1.length(), m = word2.length();

        // Merge characters alternately
        while (i < n && j < m) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }

        // Append remaining characters
        if (i < n) result.append(word1.substring(i));
        if (j < m) result.append(word2.substring(j));

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter first word: ");
        String word1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String word2 = sc.nextLine();

        String merged = sol.mergeAlternately(word1, word2);
        System.out.println("Merged string: " + merged);
    }
}
//class Solution {
   // public String mergeAlternately(String word1, String word2) {
        // Use StringBuilder for efficient string concatenation
      //  StringBuilder result = new StringBuilder();
        
      //  int n1 = word1.length();
      //  int n2 = word2.length();
       // int i = 0;
        
        // Loop until we have processed all characters from both strings
       // while (i < n1 || i < n2) {
            // Append character from word1 if it exists
       //     if (i < n1) {
        //        result.append(word1.charAt(i));
       //     }
            // Append character from word2 if it exists
        //    if (i < n2) {
              //  result.append(word2.charAt(i));
        //    }
        ////    i++;
      //  }
        
    //    return result.toString();
  //  }
//}