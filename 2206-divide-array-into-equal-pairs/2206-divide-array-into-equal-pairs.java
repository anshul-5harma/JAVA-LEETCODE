class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for(int number : nums) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        for(var entry : map.entrySet()) {
            if(entry.getValue() % 2 != 0) return false;
        }
        return true;
    }
}