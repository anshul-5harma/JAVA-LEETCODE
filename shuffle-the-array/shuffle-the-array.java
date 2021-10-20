class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] to_return = new int[n * 2];
        int index = 0;
        for(int i = 0; i < n; i++) {
            to_return[index] = nums[i];
            index++;
            to_return[index] = nums[i + n];
            index++;
        }
        return to_return;
    }
}