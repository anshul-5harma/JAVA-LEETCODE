class Solution {
    public int findNumbers(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += compute(nums[i]);
        }
        return sum;
    }
    public static int compute(int number) {
        int counter = 0;
        while(number > 0) {
            number /= 10;
            counter++;
        }
        return counter % 2 == 0 ? 1 : 0;
    }
}