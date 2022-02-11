class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int length = matrix.length;
        for(int i = 1; i < length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i - 1][j - 1] != matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}