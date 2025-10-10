//11.   Container With Most Water
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length -1;
        int max = 0;
        while(l<r){
            int min = Math.min(height[l],height[r]);
            int area = min*(r-l);
            max = Math.max(max,area);
            while(l<r && height[l]<=min)l++;
            while(l<r && height[r]<=min)r--;
        }
        return max;
    }
}