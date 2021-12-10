class Solution {
    public int diagonalSum(int[][] mat) {
        int length = mat.length;
        int alt_diagonal = 0;
        int sum = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            map.put(i+","+i, mat[i][i]);
        }
        while (alt_diagonal < length) {
            for (int j = length - 1; j >= 0; j--) {
                if (!map.containsKey(alt_diagonal+","+j)) {
                    map.put(alt_diagonal+","+j, mat[alt_diagonal][j]);
                }
                alt_diagonal++;
            }
        }
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        return sum;
    }
}