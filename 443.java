//443. String Compression :
class Solution {
    public int compress(char[] chars) {
        // Step 1: Build the compressed string using a StringBuilder.
        StringBuilder sb = new StringBuilder();
        int read = 0;
        
        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;
            
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }
            
            sb.append(currentChar);
            
            if (count > 1) {
                sb.append(count);
            }
        }
        
        // Step 2: Copy the result from the StringBuilder back into the input array.
        char[] compressedChars = sb.toString().toCharArray();
        for (int i = 0; i < compressedChars.length; i++) {
            chars[i] = compressedChars[i];
        }
        return sb.length();
    }
}