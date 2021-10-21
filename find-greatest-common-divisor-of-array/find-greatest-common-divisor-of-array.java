class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] == 0)
        return nums[nums.length - 1];

    while (nums[nums.length - 1] != 0) {
        if (nums[0] > nums[nums.length - 1])
            nums[0] = nums[0] - nums[nums.length - 1];
        else
            nums[nums.length - 1] = nums[nums.length - 1] - nums[0];
    }

    return nums[0];
    }
}