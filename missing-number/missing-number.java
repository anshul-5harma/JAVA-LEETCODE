class Solution {
    public int missingNumber(int[] nums) {
        int max = nums.length;
        Set<Integer> set = new HashSet();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for(int j = 0; j <= max; j++) {
            if(!set.contains(j)) {
                return j;
            }
        }
        return 0;
    }
}