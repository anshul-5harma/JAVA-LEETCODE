class Solution {
    public int dominantIndex(int[] num) {
        if(num.length == 1) {
            return 0;
        }
        int[] nums = num.clone();
        Arrays.sort(nums);
        if(nums[nums.length - 2] * 2 > nums[nums.length - 1]) {
            return -1;
        }
        for(int i = 0; i < num.length; i++) {
            if(num[i] == nums[nums.length - 1]) {
                return i;
            }
        }
        return -1;
    }
}