class Solution {
    public boolean isPalindrome(int x) {
        boolean flag = false;
        if(x > 0) {
            flag = check(x);
        } else if(x == 0) {
            return true;
        }
        return flag;
    }
    
    public static boolean check(int y) {
        if(y % 10 == 0) {
                return false;
            }
        String number = "";
        int x = y;
        while(x > 0) {
            number = number + x % 10;
            x /= 10;
        }
        return number.equals(String.valueOf(y));
    }
}