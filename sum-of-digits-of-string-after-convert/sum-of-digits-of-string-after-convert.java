class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i) - 'a' + 1);
        }
        String str = sb.toString();
        for(int j = 1; j <= k; j++) {
            int sum = 0;
            for(int i = 0; i < str.length(); i++) {
                sum += str.charAt(i) - '0';
            }
            str = String.valueOf(sum);
        }
        return Integer.parseInt(str);
    }
}