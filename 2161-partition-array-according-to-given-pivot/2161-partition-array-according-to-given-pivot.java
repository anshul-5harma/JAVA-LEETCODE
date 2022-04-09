class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lessThanPivot = new ArrayList();
        List<Integer> moreThanPivot = new ArrayList();
        List<Integer> equal = new ArrayList();
        for(int number : nums) {
            if(number < pivot) {
                lessThanPivot.add(number);
            } else if(number > pivot) {
                moreThanPivot.add(number);
            } else {
                equal.add(number);
            }
        }
        int counter = 0;
        for(Integer number : lessThanPivot) {
            nums[counter] = number;
            counter++;
        }
        for(Integer number : equal) {
            nums[counter] = number;
            counter++;
        }
        for(Integer number : moreThanPivot) {
            nums[counter] = number;
            counter++;
        }
        return nums;
    }
}