class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] to_return = new int[nums.length / 2];
        for(int i = 0; i < to_return.length; i++) {
            if(i % 2 == 0) {
                to_return[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
            } else {
                to_return[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
            }
        }
        return minMaxGame(to_return);
    }
}