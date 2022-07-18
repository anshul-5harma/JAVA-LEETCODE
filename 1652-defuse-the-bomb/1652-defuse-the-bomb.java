class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] to_return = new int[code.length];
        if(k == 0) return to_return;
        if(k > 0) {
            for(int i = 0; i < code.length; i++) {
                for(int j = 1; j <= k; j++) {
                    to_return[i] += code[(i + j) % code.length];
                }
            }
        } else {
            for(int i = 0; i < code.length; i++) {
                for(int j = 1; j <= -1 * k; j++) {
                    to_return[i] += code[(i - j + code.length) % code.length];
                }
            }
        }
        return to_return;
    }
}