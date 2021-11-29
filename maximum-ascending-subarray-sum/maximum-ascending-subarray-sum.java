class Solution {
    public int maxAscendingSum(int[] nums) {
        int start = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]) {
                start += nums[i];
            } else {
                max = Math.max(max, start);
                start = nums[i];
            }
        }
        return Math.max(max, start);
    }
}