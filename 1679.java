//1679 . Max Number of K-Sum Pairs
import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
        // 1. Sort the array.
        Arrays.sort(nums);
        
        int left = 0;
        int right = nums.length - 1;
        int operations = 0;
        
        // 2. Move pointers inward until they cross.
        while (left < right) {
            int sum = nums[left] + nums[right];
            
            if (sum == k) {
                // Found a pair.
                operations++;
                left++;
                right--;
            } else if (sum < k) {
                // Sum is too small, need a larger number from the right side.
                left++;
            } else { // sum > k
                // Sum is too large, need a smaller number from the left side.
                right--;
            }
        }
        
        return operations;
    }
}