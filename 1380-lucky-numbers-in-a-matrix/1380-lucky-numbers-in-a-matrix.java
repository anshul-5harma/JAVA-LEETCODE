class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int[] row_elements = new int[matrix.length];
        int[] col_elements = new int[matrix[0].length];
        List<Integer> list = new ArrayList();
        for(int i = 0; i < matrix.length; i++) {
            int min = 100000;
            for(int j = 0; j < matrix[0].length; j++) {
                if(min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
            row_elements[i] = min;
        }
        for(int i = 0; i < matrix[0].length; i++) {
            int max = 0;
            for(int j = 0; j < matrix.length; j++) {
                if(max < matrix[j][i]) {
                    max = matrix[j][i];
                }
            }
            col_elements[i] = max;
        }
        for(int i = 0; i < row_elements.length; i++) {
            for(int j = 0; j < col_elements.length; j++) {
                if(row_elements[i] == col_elements[j]) {
                    list.add(row_elements[i]);
                }
            }
        }
        return list;
    }
}