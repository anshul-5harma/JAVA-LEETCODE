class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 3) {
            return nums[nums.length - 1];
        }
        int MAX = Integer.MAX_VALUE;
        int count = 0;
        for(int i = nums.length - 1; i >= 0; i--) {
            if(MAX != nums[i]) {
                MAX = nums[i];
                count++;
            }
            if(count == 3) return MAX;
        }
        if(count > 0) return nums[nums.length - 1];
        return MAX;
    }
}