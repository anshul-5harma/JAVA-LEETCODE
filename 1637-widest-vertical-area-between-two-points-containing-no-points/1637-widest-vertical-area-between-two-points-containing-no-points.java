class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] compare = new int[points.length];
        for(int i = 0; i < points.length; i++) {
            compare[i] = points[i][0];
        }
        Arrays.sort(compare);
        int MAX = 0;
        for(int i = 1; i < compare.length; i++) {
            if(compare[i] != compare[i - 1]) {
                MAX = Math.max(MAX, compare[i] - compare[i - 1]);
            }
        }
        return MAX;
    }
}