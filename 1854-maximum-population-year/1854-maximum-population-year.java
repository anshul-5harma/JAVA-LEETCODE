class Solution {
    public int maximumPopulation(int[][] logs) {
        Map<Integer, Integer> map = new TreeMap();
        for(int i = 0; i < logs.length; i++) {
            int start = logs[i][0];
            int end = logs[i][1];
            for(int ir = start; ir <= end - 1; ir++) {
                map.put(ir, map.getOrDefault(ir, 0) + 1);
            }
        }
        int min_year = Integer.MAX_VALUE;
        int max_pop = Integer.MIN_VALUE;
        for (var entry : map.entrySet()) {
            if(entry.getValue() > max_pop) {
                max_pop = entry.getValue();
                min_year = entry.getKey();
            }
        }
        return min_year;
    }
}