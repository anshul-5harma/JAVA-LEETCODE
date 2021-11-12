class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        List<Integer> list = new ArrayList();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                list.add(i);
            }
        }
        boolean flag = true;
        for(int i = 0; i < list.size() - 1; i++) {
            if(Math.abs(list.get(i) - list.get(i+1)) - 1  < k) {
                flag = false;
            }
        }
        return flag;
    }
}