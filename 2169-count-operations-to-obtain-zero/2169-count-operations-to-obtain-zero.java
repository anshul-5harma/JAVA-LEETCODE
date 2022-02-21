class Solution {
    int counter = 0;
    public int countOperations(int nums1, int nums2) {
        if(nums1 == 0 || nums2 == 0) {
            return counter;
        } else {
            if(nums1 > nums2) {
                nums1 = nums1 - nums2;
            } else {
                nums2 = nums2 - nums1;
            }
            counter++;
        }
        return countOperations(nums1, nums2);
    }
}