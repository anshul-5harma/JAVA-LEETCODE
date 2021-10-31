class Solution {
    public int countNegatives(int[][] grid) {
        int row_length = grid[0].length;
        int holder = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] < 0) {
                    holder += row_length - j;
                    break;
                }
            }
        }
        return holder;
    }
}