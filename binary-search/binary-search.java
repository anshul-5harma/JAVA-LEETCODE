class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }
    
    public static int binarySearch(int[] nums, int target, int start, int end) {
        if(start > end) {
            return -1;
        }
        int middle = start + (end - start) / 2;
        if(nums[middle] == target) {
            return middle;
        } 
        if(nums[middle] > target) {
            return binarySearch(nums, target, start, middle - 1);
        }
        return binarySearch(nums, target, middle + 1, end);
    }
}
