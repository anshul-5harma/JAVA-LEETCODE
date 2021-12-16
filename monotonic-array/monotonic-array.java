class Solution {
    public boolean isMonotonic(int[] nums) {
        return greater(nums) || smaller(nums);
    }
    public static boolean greater(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] < nums[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean smaller(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i+1]) {
                return false;
            }
        }
        return true;
    }
}