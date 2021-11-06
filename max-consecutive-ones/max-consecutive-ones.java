class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int one_count = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                counter++;
            } else {
                counter = 0;
            }
            one_count = (one_count < counter) ? counter : one_count;
        }
        return one_count;
    }
}