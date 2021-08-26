class Solution {
    public int[] buildArray(int[] nums) {
        int[] to_return = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            to_return[i] = nums[nums[i]];
        }
    return to_return;
    }
}