class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] to_return = new int[m][n];
        for(int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            for(int j = 0; j < n; j++) {
                to_return[row][j]++;
            }
            int column = indices[i][1];
            for(int x = 0; x < m; x++) {
                to_return[x][column]++;
            }
        }
        int count = 0;
        for(int i=0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(to_return[i][j]%2 != 0)
                    count++;
            }
        }
        return count;
    }
}