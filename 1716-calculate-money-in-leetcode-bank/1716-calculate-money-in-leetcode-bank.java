class Solution {
    public int totalMoney(int n) {
        int start = 1;
        int current = start;
        int total = 0;
        for(int i = 1; i <= n; i++) {
            total += current;
            current++;
            if(i % 7 == 0) {
                start++;
                current = start;
            }
        }
        return total;
    }
}