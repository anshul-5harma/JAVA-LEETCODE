class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int MAX = 0;
        int right = height.length - 1;
        while(left < right) {
            MAX = Math.max(Math.min(height[left], height[right]) * (right - left), MAX);
            if(height[right] < height[left]) {
                right--;
            } else {
                left++;
            }
        }
        return MAX;
    }
}