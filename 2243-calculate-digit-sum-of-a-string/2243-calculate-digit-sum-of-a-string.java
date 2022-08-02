class Solution {
    public String digitSum(String s, int k) {
        if(s.length() <= k) return s;
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            count++;
            sum += s.charAt(i) - '0';
            if(i == s.length() - 1 || count >= k) {
                sb.append(String.valueOf(sum));
                count = 0;
                sum = 0;
            }
        }
        return digitSum(sb.toString(), k);
    }
}