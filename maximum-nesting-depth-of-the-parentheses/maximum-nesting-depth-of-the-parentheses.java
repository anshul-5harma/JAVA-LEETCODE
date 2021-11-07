class Solution {
    public int maxDepth(String s) {
        int counter = 0;
        int MAX = Integer.MIN_VALUE;
        if(s.length() == 0) {
            return 0;
        }
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                counter++;
            } else  if(s.charAt(i) == ')') {
                counter--;
            }
            MAX = Math.max(MAX, counter);
        }
        return MAX;
    }
}