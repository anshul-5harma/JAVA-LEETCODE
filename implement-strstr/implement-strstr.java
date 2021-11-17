class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;
        if(needle.equals("")) {
            index = 0;
        } else if(haystack.length() < needle.length()) {
            index = -1;
        } else {
            index = haystack.indexOf(needle);  
        }
        return index;
    }
}