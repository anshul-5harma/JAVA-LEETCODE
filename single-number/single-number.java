class Solution {
    public int singleNumber(int[] nums) {
        int ret = -1;
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (var entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                ret = entry.getKey();
            }
}
        return ret;
    }
}