//.1456 maximum no of vowels in a  substring of given length k 
class Solution {
    private static final int[] count = new int[26];
    static {
        count['a' - 97] = count['e' - 97] = count['i' - 97] = count['o' - 97] = count['u' - 97] = 1;
        for (int i = 0; i < 1000; i++) {
            maxVowels("",0);
        }
    }
    public static int maxVowels(String s, int k) {
        int maxVowelCount = 0, vowelCount;
        for (int i = 0; i < k; i++) {
            maxVowelCount += count[s.charAt(i) - 97];
        }
        vowelCount = maxVowelCount;
        for (int i = k; i < s.length(); i++) {
            vowelCount += count[s.charAt(i) - 97] - count[s.charAt(i - k) - 97];
            if (vowelCount > maxVowelCount) {
                maxVowelCount = vowelCount;
            }
        }
        return maxVowelCount;
    }
}