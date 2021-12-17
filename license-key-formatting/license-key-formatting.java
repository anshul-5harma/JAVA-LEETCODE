class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
        StringBuilder sb = new StringBuilder();
        int start = k;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(start == 0) {
                start = k;
                sb.append("-");
                sb.append(s.charAt(i));
            } else {
                sb.append(s.charAt(i));
            }
            --start;
        }
        return sb.reverse().toString();
    }
}