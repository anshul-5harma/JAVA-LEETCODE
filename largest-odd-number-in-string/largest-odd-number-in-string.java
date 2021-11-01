class Solution {
    public String largestOddNumber(String num) {
        int length = num.length() - 1;
        while(length >= 0) {
            if(Integer.valueOf(num.charAt(length)) % 2 != 0) {
                return num.substring(0, length + 1);
            } else {
                length--;
            }
        }
        return  "";
    }
}