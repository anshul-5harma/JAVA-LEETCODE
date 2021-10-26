class Solution {
    public String generateTheString(int n) {
        int a_count = 0;
        int b_count = 0;
        StringBuilder sb = new StringBuilder();
        if(n % 2 == 0) {
            a_count = n - 1;
            for(int i = 1; i <= a_count; i++) {
                sb.append("a");
            }
            sb.append("b");
        } else {
            for(int i = 1; i <=n ; i++) {
                sb.append("a");
            }
        }
        return sb.toString();
    }
}