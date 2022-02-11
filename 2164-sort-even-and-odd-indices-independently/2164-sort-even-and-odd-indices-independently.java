class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> even = new ArrayList();
        List<Integer> odd = new ArrayList();
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        int i=0;
        int evenindex=0;
        int oddindex=0;
        int[] arr = new int[nums.length];
        while(i<nums.length) {
            if(i%2==0) {
                arr[i]=even.get(evenindex);
                evenindex++;
            } else {
                arr[i]=odd.get(oddindex);
                oddindex++;
            }
            i++;
        }
        return arr;
    }
}