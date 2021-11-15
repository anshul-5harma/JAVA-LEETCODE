class Solution {
    public int maxScore(String s) {
        int itr = 0;
        int j = 1;
        int counter = 0;
        int MAX = Integer.MIN_VALUE;
        while(j < s.length()) {
            String left = s.substring(itr,j);
            String right = s.substring(j);
            for(int i = 0; i < left.length(); i++) {
                if(left.charAt(i) == '0') counter++;
            }
            for(int i = 0; i < right.length(); i++) {
                if(right.charAt(i) == '1') counter++;
            }
            MAX = Math.max(MAX, counter);
            itr = 0;
            j++;
            counter = 0;
        }
        return MAX;
    }
}