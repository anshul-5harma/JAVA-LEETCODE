class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == '#') {
                String holder = s.substring(i - 2, i);
                int number = Integer.parseInt(holder);
                sb.append((char)(number + 96));
                i -= 2;
            } else {
                sb.append((char)(Integer.parseInt(s.charAt(i)+"") + 96));
            }
        }
        return sb.reverse().toString();
    }
}