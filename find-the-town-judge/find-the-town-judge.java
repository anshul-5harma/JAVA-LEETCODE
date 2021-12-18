class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] to_return = new int[n+1];
        for(int[] t : trust) {
            to_return[t[0]]--;
            to_return[t[1]]++;
        }
        for(int i = 1; i <= n; i++) {
            if(to_return[i] == n - 1) return i;
        }
        return -1;
    }
}