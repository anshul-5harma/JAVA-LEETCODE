class Solution {
    Set<Integer> set = new HashSet();
    public boolean isHappy(int n) {
        if(n == 1) {
            return true;
        }
        if(n < 1) {
            return false;
        }
        int sum = 0;
        while(n > 0) {
            int remainder = n % 10;
            sum += remainder * remainder;
            n /= 10;
        }
        if(set.contains(sum)) return false;
        set.add(sum);
        return isHappy(sum);
    }
}