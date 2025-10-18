// 2352 . equal Row and Column Pairs
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;

        // Use a map to store each unique row and its frequency.
        Map<String, Integer> rowFrequencies = new HashMap<>();
        
        // 1. Convert each row into a string and count its occurrences.
        for (int[] row : grid) {
            StringBuilder sb = new StringBuilder();
            for (int val : row) {
                sb.append(val).append(","); // Use a separator for safety
            }
            String rowKey = sb.toString();
            rowFrequencies.put(rowKey, rowFrequencies.getOrDefault(rowKey, 0) + 1);
        }

        // 2. Convert each column into a string and check if it matches a row.
        for (int c = 0; c < n; c++) {
            StringBuilder sb = new StringBuilder();
            for (int r = 0; r < n; r++) {
                sb.append(grid[r][c]).append(",");
            }
            String colKey = sb.toString();
            
            // If the column's string is in the map, add the number of matching rows to the count.
            count += rowFrequencies.getOrDefault(colKey, 0);
        }

        return count;
    }
}