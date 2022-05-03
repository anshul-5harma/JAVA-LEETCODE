class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int to_return = 1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == to_return) {
                to_return += 1;
            }
        }
        return to_return;
    }
}