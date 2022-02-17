class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate = -1;
        int missing = 1;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                duplicate = nums[i];
            } else if(nums[i] > nums[i - 1] + 1) {
                missing = nums[i - 1] + 1;
            }
        }
        return new int[] {duplicate, nums[nums.length - 1] != nums.length ? nums.length : missing};
    }
}