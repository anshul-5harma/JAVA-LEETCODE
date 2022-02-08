class Solution {
    public int minimumMoves(String s) {
        int counter = 0;
        for(int i = 0; i < s.length();) {
            if(s.charAt(i) == 'X') {
                counter++;
                i += 3;
            } else {
                i++;
            }
        }
        return counter;
    }
}