class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> list = new ArrayList();
        Map<Integer, Integer> map = new HashMap();
        for(int  number : nums) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        for(var entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                if(!map.containsKey(entry.getKey() - 1) && !map.containsKey(entry.getKey() + 1)) {
                    list.add(entry.getKey());
                }
            }
        }
        return list;
    }
}