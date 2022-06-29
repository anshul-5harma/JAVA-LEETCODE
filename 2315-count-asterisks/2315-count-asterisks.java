class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        int star = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '|') {
                count++;
            }
            if (count == 0 || count % 2 == 0) {
                if(s.charAt(i) == '*') {
                    star++;
                }
            }
        }
        return star++;
    }
}