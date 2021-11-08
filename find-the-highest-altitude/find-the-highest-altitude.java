class Solution {
    public int largestAltitude(int[] gain) {
        int MAX = gain[0];
        for(int i = 1; i < gain.length; i++) {
            gain[i] += gain[i - 1];
            int temp = gain[i];
            MAX = Math.max(MAX, temp);
        }
        return MAX < 0 ? 0 : MAX;
    }
}