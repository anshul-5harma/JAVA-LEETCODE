class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] to_return = new int[encoded.length + 1];
        to_return[0] = first;
        for(int i = 1; i < to_return.length; i++) {
            to_return[i] = encoded[i - 1] ^ to_return[i - 1];
        }
        return to_return;
    }
}