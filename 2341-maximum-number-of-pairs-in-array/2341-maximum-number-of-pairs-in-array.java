class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int pairs = 0;
        int remainder = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            pairs += entry.getValue() / 2;
            remainder += entry.getValue() % 2;
        }
        int[] to_return = new int[2];
        to_return[0] = pairs;
        to_return[1] = remainder;
        return to_return;
    }
}