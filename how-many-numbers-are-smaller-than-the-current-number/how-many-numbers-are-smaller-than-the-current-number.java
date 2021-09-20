class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int index = 0;
        int[] to_return = new int[nums.length];
        while(index < nums.length) {
            int counter = 0;
            for(int i = 0; i < nums.length; i++) {
                if(nums[index] > nums[i]) {
                    counter++;
                }
            }
            to_return[index] = counter;
            index++;
        }
        return to_return;
    }
}