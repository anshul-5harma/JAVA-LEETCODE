class Solution {
    public int maximumWealth(int[][] accounts) {
        int MAX = Integer.MIN_VALUE;
        for(int i = 0; i < accounts.length; i++) {
            MAX = Math.max(MAX, compute(accounts[i]));
        }
        return MAX;
    }
    
    public static int compute(int[] arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }
}