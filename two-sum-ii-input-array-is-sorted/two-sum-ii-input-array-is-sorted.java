class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int slow = 0;
        int fast = numbers.length - 1;
        while(slow < fast) {
            if(numbers[slow] + numbers[fast] == target) {
                return new int[] {slow+1, fast+1};
            } else {
                if(numbers[slow] + numbers[fast] < target) {
                    slow++;
                } else {
                    fast--;
                }
            }
        }
        return new int[] {1,1};
    }
}