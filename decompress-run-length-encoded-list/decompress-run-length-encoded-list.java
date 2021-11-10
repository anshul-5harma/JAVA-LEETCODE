class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i < nums.length - 1; i+=2) {
            int temp = 0;
            while(temp < nums[i]) {
                list.add(nums[i+1]);
                temp++;
            }
        }
        int[] to_return = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            to_return[i] = list.get(i);
        }
        return to_return;
    }
}