class Solution {
    public int maximumGap(int[] nums) {
        int MAX = Integer.MIN_VALUE;
        Arrays.sort(nums);
        if(nums.length < 2) return 0;
        for(int i = 0; i < nums.length - 1; i++) {
            MAX = Math.max(MAX, nums[i+1] - nums[i]);
        }
        return MAX;
    }
}