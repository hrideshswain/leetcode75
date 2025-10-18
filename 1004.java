//1004 . Max Consecutive Ones III
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;          // The left pointer of our window
        int zeroCount = 0;     // The number of zeros in the current window
        int maxLength = 0;     // The maximum length found so far
        
        // The right pointer expands the window
        for (int right = 0; right < nums.length; right++) {
            // If the element entering the window is a zero, increment our count
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                // If the element leaving the window is a zero, decrement the count
                if (nums[left] == 0) {
                    zeroCount--;
                }
                // Move the left pointer to shrink the window
                left++;
            }
        
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}