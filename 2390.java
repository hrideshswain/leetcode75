// 2390. remove Stars From a String

class Solution {
    public String removeStars(String s) {
        // Convert the string to a character array for in-place modification.
        char[] chars = s.toCharArray();
        int writeIndex = 0; // This pointer marks the end of the valid result string.

        // The readIndex iterates through all characters in the original string.
        for (int readIndex = 0; readIndex < chars.length; readIndex++) {
            char currentChar = chars[readIndex];

            if (currentChar == '*') {
                // A star acts like a backspace, so we move the write pointer back.
                writeIndex--; 
            } else {
                // A normal character is copied to the writeIndex position.
                chars[writeIndex] = currentChar;
                writeIndex++;
            }
        }

        // The final string is the content of the array from the start
        // up to the final position of the writeIndex.
        return new String(chars, 0, writeIndex);
    }
}