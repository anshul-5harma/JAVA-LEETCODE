class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        for(int j = 0; j < list.size(); j++) {
            nums[j] = list.get(j);
        }
        return nums;
    }
}