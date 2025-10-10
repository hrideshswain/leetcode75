//283. Move Zeroes
class Solution {
    public void moveZeroes(int[] nums) {
        // If the array is empty or has only one element, there's nothing to do.
        if (nums == null || nums.length == 0) {
            return;
        }
        // 'insertPos' marks the position for the next non-zero element.
        int insertPos = 0;
        // First loop: Move all the non-zero elements to the front of the array.
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}