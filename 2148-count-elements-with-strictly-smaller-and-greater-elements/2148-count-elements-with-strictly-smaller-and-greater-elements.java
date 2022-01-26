class Solution {
    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int number : nums) {
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        int counter = 0;
        for(int number : nums) {
            if(number > min && number < max) {
                counter++;
            }
        }
        return counter;
    }
}