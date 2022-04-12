class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> map = new HashMap();
        for(int[] log : logs) {
            if(map.containsKey(log[0])) {
                map.get(log[0]).add(log[1]);
            } else {
                map.put(log[0], new HashSet());
                map.get(log[0]).add(log[1]);
            }
        }
        int[] to_return = new int[k];
        for(Set<Integer> active : map.values()) {
            to_return[active.size() - 1]++;
        }
        return to_return;
    }
}