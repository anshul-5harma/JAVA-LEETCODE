class Solution {
    public int maxPower(String s) {
        int counter = 1;
        int MAX = 1;
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                counter++;
            } else {
                MAX = Math.max(MAX, counter);
                counter = 1;
            }
        }
        MAX = Math.max(MAX, counter);
        return MAX;
    }
}