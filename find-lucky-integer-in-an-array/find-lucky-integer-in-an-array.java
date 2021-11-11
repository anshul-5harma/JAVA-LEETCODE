class Solution {
    public int findLucky(int[] arr) {
        int value = -1;
        Map<Integer, Integer> map = new TreeMap();
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (var entry : map.entrySet()) {
            if(entry.getKey() == entry.getValue()) {
                value = entry.getKey();
            }
        }
        return value;
    }
}