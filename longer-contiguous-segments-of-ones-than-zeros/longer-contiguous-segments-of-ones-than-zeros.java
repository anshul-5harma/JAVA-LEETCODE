class Solution {
    public boolean checkZeroOnes(String s) {
        int one = 0;
        int zero = 0;
        int one_max = 0;
        int zero_max = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                one++;
                zero = 0;
                if(one > one_max) {
                    one_max = one;
                }
            } else {
                one = 0;
                zero++;
                if(zero > zero_max) {
                    zero_max = zero;
                }
            }
        }
        return one_max > zero_max;
    }
}