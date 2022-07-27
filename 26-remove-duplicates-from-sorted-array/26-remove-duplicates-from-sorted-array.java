class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 1;
        int current = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                start++;
                nums[current++] = nums[i];
            }
        }
        return start;
    }
}