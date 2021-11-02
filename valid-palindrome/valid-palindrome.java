class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().trim();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                sb.append(s.charAt(i));
            }
        }
        String str = "";
        for(int i = 0; i < sb.toString().length(); i++) {
            str = sb.toString().charAt(i) + str;
        }
        return str.equals(sb.toString());
    }
}