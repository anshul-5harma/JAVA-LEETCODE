class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        int counter = 0;
        while(num > 0) {
            int remainder = num % 10;
            digits[counter] = remainder;
            num /= 10;
            counter++;
        }
        Arrays.sort(digits);
        StringBuilder extremes = new StringBuilder();
        StringBuilder adjacents = new StringBuilder();
        extremes.append(digits[0]);
        extremes.append(digits[3]);
        adjacents.append(digits[1]);
        adjacents.append(digits[2]);
        return Integer.valueOf(extremes.toString()) + Integer.valueOf(adjacents.toString());
    }
}