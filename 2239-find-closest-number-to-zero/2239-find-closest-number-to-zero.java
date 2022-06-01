class Solution {
    public int findClosestNumber(int[] nums) {
        int difference = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;
        for(int number : nums) {
            if(Math.abs(number) < difference) {
                difference = Math.abs(number);
                result = number;
            } else if(Math.abs(number) == difference) {
                result = result > number ? result : number;
            }
        }
        return result;
    }
}