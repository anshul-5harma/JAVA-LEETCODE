class Solution {
    public int largestAltitude(int[] gain) {
        int MAX = 0;
        for(int i = 1; i < gain.length; i++) {
            gain[i] += gain[i - 1];
        }
        for(int d : gain) {
            MAX = Math.max(MAX, d);
        }
        return MAX;
    }
}