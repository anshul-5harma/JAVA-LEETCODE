class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int half = nums.length / 2;
        for (var entry : map.entrySet()) {
            if(entry.getValue() > half) {
                return entry.getKey();
            }
        }
        return -1;
    }
}