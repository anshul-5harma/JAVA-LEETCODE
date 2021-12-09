class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] to_return = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            int counter = 0;
            for(int j = 0; j < points.length; j++) {
                int x = queries[i][0] - points[j][0];
                int y = queries[i][1] - points[j][1];
                int squares = x * x + y * y;
                if(Math.abs(Math.sqrt(squares)) <= queries[i][2]) {
                    counter++;
                }
            }
            to_return[i] = counter;
        }
        return to_return;
    }
}