class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < edges.length; i++) {
            for(int j = 0; j < edges[i].length; j++) {
                map.put(edges[i][j], map.getOrDefault(edges[i][j], 0) + 1);
            }
        }
        for (var entry : map.entrySet()) {
            if(entry.getValue() == edges.length) {
                return entry.getKey();
            }
        }
        return -1;
    }
}