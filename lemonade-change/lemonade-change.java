class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        int twenties = 0;
        for(int i = 0; i < bills.length; i++) {
            if(bills[i] == 5) {
                fives++;
            } else if(bills[i] == 10) {
                if(fives < 1) {
                    return false;
                } else {
                    tens++;
                    fives--;
                }
            } else if(bills[i] == 20) {
                if(fives > 0 && tens > 0) {
                    fives--;
                    tens--;
                } else fives -= 3;
                if(fives < 0) return false;
            }
        }
        return true;
    }
}