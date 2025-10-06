//151. Reverse words in a string 
class Solution {
    public String reverseWords(String s) {
      
        StringBuilder reversed = new StringBuilder();
        int j = s.length(); 
        for (int i = s.length() - 1; i >= 0; i--) {
            
            if (s.charAt(i) == ' ') {
                j = i;
            } 
            else if (i == 0 || s.charAt(i - 1) == ' ') {
                
              
                if (reversed.length() > 0) {
                    reversed.append(' ');
                }
                
                reversed.append(s.substring(i, j));
            }
        }
        return reversed.toString();
    }
}

        //import java.util.Arrays;
  //      import java.util.Collections;

    //    class Solution {
   //         public String reverseWords(String s) {
   //             // 1. Trim whitespace from both ends and split the string into an array of words.
  //              // The "\\s+" ensures that multiple spaces between words are treated as one separator.
  //              String[] words = s.trim().split("\\s+");
                
                // 2. Reverse the order of the words in the array.
  //              Collections.reverse(Arrays.asList(words));
                
                // 3. Join the words back into a single string with one space between them.
   //             return String.join(" ", words);
  //          }
 //       }
