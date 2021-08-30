class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] return_array = new int[nums.length * 2];
        for(int i = 0, j = nums.length; i < nums.length && j < return_array.length; i++, j++) {
            return_array[i] = nums[i];
            return_array[j] = nums[i];
        }
        return return_array;
    }
}