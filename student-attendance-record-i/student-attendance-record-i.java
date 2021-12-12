class Solution {
    public boolean checkRecord(String s) {
        int length = s.length();
        int counter = 0;
        for(int i = 0; i < length; i++) {
            if(s.charAt(i) == 'A') {
                counter++;
            }
            if(counter > 1) return false;
            if(i < length - 2 && s.charAt(i) == 'L') {
                if(s.charAt(i+1) == 'L' && s.charAt(i+2) == 'L') {
                    return false;
                }
            }
        }
        return true;
    }
}