class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1;
        int MIN = Integer.MAX_VALUE;
        for(int i = 0; i < points.length; i++) {
            if(points[i][0] == x || points[i][1] == y) {
                int manhattan = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                if(MIN > manhattan) {
                    MIN = manhattan;
                    index = i;
                }
            }
        }
        return index;
    }
}