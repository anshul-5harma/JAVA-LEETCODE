class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet();
        for(char ch : s.toCharArray()) {
            if(set.contains(ch)) {
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }
        if(set.size() < 2) return s.length();
        return s.length() - set.size() + 1;
    }
}