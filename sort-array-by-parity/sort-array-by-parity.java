class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int fast = 0;
        int slow = nums.length - 1;
        int[] to_return = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                to_return[fast] = nums[i];
                fast++;
            } else {
                to_return[slow] = nums[i];
                slow--;
            }
        }
        return to_return;
    }
}