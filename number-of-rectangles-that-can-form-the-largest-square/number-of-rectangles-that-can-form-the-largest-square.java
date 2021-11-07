class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int[] max = new int[rectangles.length];
        for(int i = 0; i < rectangles.length; i++) {
            max[i] = rectangles[i][0] < rectangles[i][1] ? rectangles[i][0] : rectangles[i][1];
        }
        Map<Integer, Integer> map = new TreeMap();
        for(int i = 0; i < max.length; i++) {
            map.put(max[i], map.getOrDefault(max[i], 0) + 1);
        }
        int MAX = Integer.MIN_VALUE;
        for (var entry : map.entrySet()) {
            MAX = entry.getValue();
        }
        return MAX;
    }
}