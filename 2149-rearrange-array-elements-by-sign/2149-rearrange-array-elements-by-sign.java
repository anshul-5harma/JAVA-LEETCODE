class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> negative = new ArrayList();
        List<Integer> positive = new ArrayList();
        for(int number : nums) {
            if(number < 0) {
                negative.add(number);
            } else {
                positive.add(number);
            }
        }
        List<Integer> list = new ArrayList();
        for(int i = 0; i < positive.size(); i++) {
            list.add(positive.get(i));
            list.add(negative.get(i));
        }
        int[] arr = new int[list.size()]; 
        for(int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}