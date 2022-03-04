class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> list = new ArrayList();
        int max = 0;
        int holder = 0;
        for(int i = 0; i < k; i++) {
            max = Collections.max(map.values());
            for(var entry : map.entrySet()) {
                if(entry.getValue() == max) {
                    holder = entry.getKey();
                    break;
                }
            }
            list.add(holder);
            map.remove(holder);
        }
        int[] to_return = new int[list.size()];
        for(int i = 0; i < to_return.length; i++) {
            to_return[i] = list.get(i);
        }
        return to_return;
    }
}