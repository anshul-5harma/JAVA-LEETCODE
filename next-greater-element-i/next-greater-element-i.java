class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int start = 0;
        while(start < nums1.length) {
            int element = nums1[start];
            for(int i = 0; i < nums2.length; i++) {
                if(nums2[i] == element) {
                    if(i == nums2.length - 1) {
                        nums1[start] = -1;
                    } else {
                        for(int j = i + 1; j < nums2.length; j++) {
                            if(nums2[j] > element) {
                                nums1[start] = nums2[j];
                                break;
                            }
                        }
                        if(nums1[start] == element) {
                            nums1[start] = -1;
                        }
                    }
                }
            }
            start++;
        }
        return nums1;
    }
}