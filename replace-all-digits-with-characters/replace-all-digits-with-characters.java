class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sb.append((char) ((int) s.charAt(i - 1) + Integer.valueOf(String.valueOf(s.charAt(i)))));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}