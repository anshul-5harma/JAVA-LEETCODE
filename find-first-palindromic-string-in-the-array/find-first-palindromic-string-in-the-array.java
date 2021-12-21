class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words) {
            if(check(word)) {
                return word;
            }
        }
        return "";
    }
    public static boolean check(String word) {
        int start = 0;
        int end = word.length() - 1;
        while(start < end) {
            if(word.charAt(start) != word.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
}