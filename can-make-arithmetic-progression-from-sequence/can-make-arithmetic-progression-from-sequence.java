class Solution {
    public boolean canMakeArithmeticProgression(int[] nums) {
        Arrays.sort(nums);
        int difference = Math.abs(nums[0] - nums[1]);
        for(int i = 0; i < nums.length - 1; i++) {
            if(Math.abs(nums[i] - nums[i + 1]) != difference) {
                return false;
            }
        }
        return true;
    }
}