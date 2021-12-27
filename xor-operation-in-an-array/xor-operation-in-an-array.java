class Solution {
    public int xorOperation(int n, int start) {
        int[] to_return = new int[n];
        for(int i = 0; i < n; i++) {
            to_return[i] = start + 2 * i;
        }
        int begin = to_return[0];
        for(int i = 1; i < to_return.length; i++) {
            begin ^= to_return[i];
        }
        return begin;
    }
}