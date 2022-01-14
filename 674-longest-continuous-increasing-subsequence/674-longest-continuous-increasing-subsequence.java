class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int MAX = 1;
        int start = 1;
        for(int i = 1; i < nums.length;i++) {
            if(nums[i] > nums[i - 1]) {
                start++;
                MAX = Math.max(MAX, start);
            } else {
                start = 1;
            }
        }
        return MAX;
    }
}