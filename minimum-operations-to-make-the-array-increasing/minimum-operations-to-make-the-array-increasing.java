class Solution {
    public int minOperations(int[] nums) {
        int counter = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] >= nums[i+1]) {
                int difference = nums[i] - nums[i+1] + 1;
                nums[i+1] += difference;
                counter += difference;
            }
        }
        return counter;
    }
}