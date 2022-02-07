class Solution {
    public int countPrimeSetBits(int left, int right) {
        int counter = 0;
        for(int i = left; i <= right; i++) {
            if(check(i)) {
                counter++;
            }
        }
        return counter;
    }
    public static boolean check(int number) {
            int counter = 0;
            String converted = Integer.toBinaryString(number);
            for(int i = 0; i < converted.length(); i++) {
                if(converted.charAt(i) == '1') {
                    counter++;
                }
            }
            if(counter <= 1) return false;
            for (int i = 2; i < counter; i++) {
                if (counter % i == 0)
                    return false;
            }
            return true;
        }
}