class Solution {
    public int countEven(int num) {
        int counter = 0;
        for(int i = 2; i <= num; i ++) {
            counter += check(i);
        }
        return counter;
    }
    public static int check(int number) {
        int sum = 0;
        while(number > 0) {
            int remainder = number % 10;
            sum += remainder;
            number /= 10;
        }
        return sum % 2 == 0 ? 1 : 0;
    }
}