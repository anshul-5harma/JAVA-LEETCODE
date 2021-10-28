class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] cloned = heights.clone();
        Arrays.sort(cloned);
        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != cloned[i]) {
                count++;
            }
        }
        return count;
    }
}