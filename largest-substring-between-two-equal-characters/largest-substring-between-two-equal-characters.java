class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int start = 0;
        int MAX = -1;
        while(start < s.length() - 1) {
            MAX = Math.max(MAX, s.lastIndexOf(s.charAt(start)) - start - 1);
            start++;
        }
        return MAX;
    }
}