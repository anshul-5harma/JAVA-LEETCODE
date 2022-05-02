class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length - 1; i++) {
            int num_key = nums[i];
            int value = nums[i + 1];
            if(num_key == key) {
                map.put(value, map.getOrDefault(value, 0) + 1);
            }
        }
        int max_value = 0;
        int max_count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max_count) {
                max_value = entry.getKey();
                max_count = entry.getValue();
            }
        }
        return max_value;
    }
}