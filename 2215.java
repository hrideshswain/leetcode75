//2215 .    Find the Difference of Two Arrays
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Step 1: Create sets from the input arrays for efficient lookups.
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }

        // Step 2: Find all distinct integers in nums1 which are not present in nums2.
        List<Integer> diff1 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                diff1.add(num);
            }
        }

        // Step 3: Find all distinct integers in nums2 which are not present in nums1.
        List<Integer> diff2 = new ArrayList<>();
        for (int num : set2) {
            if (!set1.contains(num)) {
                diff2.add(num);
            }
        }
        
        // Step 4: Combine the two lists into a single list and return it.
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(diff1);
        answer.add(diff2);
        
        return answer;
    }
}