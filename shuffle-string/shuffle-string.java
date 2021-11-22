class Solution {
    public String restoreString(String s, int[] indices) {
        char[] to_return = new char[indices.length];
        for(int i = 0; i < indices.length; i++) {
            to_return[indices[i]] = s.charAt(i);
        }
        String str = "";
        for(char ch : to_return) {
            str += ch;
        }
        return str;
    }
}