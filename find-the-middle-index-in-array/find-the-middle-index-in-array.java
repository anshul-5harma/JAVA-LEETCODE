class Solution {
    public int findMiddleIndex(int[] nums) {
        int left = 0;
        int right;
        int sum = 0;
        for(int i : nums) {
            sum += i;
        }
        for(int i = 0; i < nums.length; i++) {
            right = sum - nums[i] - left;
            if(right == left) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}