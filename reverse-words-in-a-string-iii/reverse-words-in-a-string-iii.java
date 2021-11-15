class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.trim().split(" ");
        for(int i = 0; i < str.length; i++) {
            sb.append(compute(str[i]));
        }
        return sb.toString().trim();
    }
    public static String compute(String toReverse) {
        String sb = "";
        for(int i = 0; i < toReverse.length(); i++) {
            sb = toReverse.charAt(i) + sb;
        }
        return sb + " ";
    }
}